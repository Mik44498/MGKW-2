import java.util.LinkedList;
import static java.lang.Math.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Calculator extends CalculatorBaseListener {
    private final LinkedList<Double> firstStack = new LinkedList<>();
    private final LinkedList<Double> secondStack = new LinkedList<>();

    private final LinkedList<Double> thirdStack = new LinkedList<>();
    private final LinkedList<Double> fourthStack = new LinkedList<>();

    public Double getResult() {
        return fourthStack.pop();
    }

    @Override
    public void exitExpression(CalculatorParser.ExpressionContext ctx) {
        Double result = fourthStack.removeLast();
        for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.PLUS)) {
                result = result + fourthStack.removeLast();
            } else {
                result = result - fourthStack.removeLast();
            }
        }
        fourthStack.push(result);
        System.out.println("Expression: \"" + ctx.getText() + "\" -> " + result);
    }

    @Override
    public void exitMultiplyingExpression(CalculatorParser.MultiplyingExpressionContext ctx) {
        Double result = thirdStack.removeLast();
        for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.TIMES)) {
                result = result * thirdStack.removeLast();
            } else {
                result = result / thirdStack.removeLast();
            }
        }
        fourthStack.push(result);
        System.out.println("MultiplyingExpression: \"" + ctx.getText() + "\" -> " + result);
    }

    private boolean symbolEquals(ParseTree child, int symbol) {
        return ((TerminalNode) child).getSymbol().getType() == symbol;
    }

    @Override
    public  void exitPowExpression(CalculatorParser.PowExpressionContext ctx) {
        Double result = secondStack.removeLast();
        for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.POW)) {
                result = Math.pow(result, secondStack.removeLast());
            } else {
                result = Math.sqrt(result);
            }
        }
        thirdStack.push(result);
        System.out.println("PowExpression: \"" + ctx.getText() + "\" -> " + result);
    }

    @Override
    public  void exitCstExpression(CalculatorParser.CstExpressionContext ctx) {
        Double result = firstStack.removeLast();
        for (int i = 1; i < ctx.getChildCount(); i = i + 2) {
            if (symbolEquals(ctx.getChild(i), CalculatorParser.COS)) {
                result = Math.cos(result);
            } else if(symbolEquals(ctx.getChild(i), CalculatorParser.TAN)) {
                result = Math.tan(result);
            } else {
                result = Math.sin(result);
            }
        }
        secondStack.push(result);
        System.out.println("CstExpression: \"" + ctx.getText() + "\" -> " + result);
    }
    @Override
    public void exitIntegralExpression(CalculatorParser.IntegralExpressionContext ctx) {
        double value = Double.parseDouble(ctx.DOUBLE().getText());
        if (ctx.MINUS() != null) {
            firstStack.push(-1 * value);
        } else {
            firstStack.push(value);
        }
        System.out.println("IntegralExpression: \"" + ctx.getText() + "\" ");
    }


    public static Double calc(CharStream charStream) {
        CalculatorLexer lexer = new CalculatorLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.println(tokens.getText());

        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.expression();

        ParseTreeWalker walker = new ParseTreeWalker();
        Calculator calculatorListener = new Calculator();
        walker.walk(calculatorListener, tree);
        return calculatorListener.getResult();
    }

    public static Double calc(String expression) {
        return calc(CharStreams.fromString(expression));
    }

    public static void main(String[] args) throws Exception {
        CharStream charStreams = CharStreams.fromFileName("C:\\Users\\mkuku\\IdeaProjects\\Kalkulator\\Kalkulator\\src\\example.txt");
        Double result = calc(charStreams);
        System.out.println("Result = " + result);
    }
}