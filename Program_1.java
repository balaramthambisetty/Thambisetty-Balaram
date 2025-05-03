import java.util.Scanner;

public class Program_1 
{
    double a, b;
    String operation;

    public Program_1(double a, double b, String operation) 
  {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate() 
  {
        switch (operation.toLowerCase()) 
        {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0)
                    return a / b;
                else
                    return Double.NaN;
            default:
                return Double.NaN;
        }
    }

    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter operation (add, subtract, multiply, divide): ");
            String operation = sc.nextLine();
            Program_1 calc = new Program_1(a, b, operation);
            System.out.println("Result: " + calc.calculate());
        } catch (Exception e)
          {
            System.out.println("Invalid input. Please enter two numbers followed by the operation.");
        }
    }
}
