import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter the first number: ");
        double num1 = calc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = calc.nextDouble();

        // Input operator
        System.out.println("=======Enter operator======= ");
        System.out.println("Enter (+) For Addition");
        System.out.println("Enter (-) For Subtraction");
        System.out.println("Enter (*) For Multiplication");
        System.out.println("Enter (/) For Division");
        char operator = calc.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }

        calc.close();
    }
}
