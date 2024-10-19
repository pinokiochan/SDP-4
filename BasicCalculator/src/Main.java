import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the expression: ");

        String expression = scanner.nextLine();
        Expression parsedExpression = Interpreter.parse(expression);
        System.out.println("Result: " + parsedExpression.interpret());

    }
}
