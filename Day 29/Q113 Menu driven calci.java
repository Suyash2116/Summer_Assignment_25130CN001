import java.util.Scanner;
public class MenuCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        double a, b;
        do 
        {
            System.out.println("\n===== CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) 
            {
                System.out.print("Enter First Number: ");
                a = sc.nextDouble();
                System.out.print("Enter Second Number: ");
                b = sc.nextDouble();
                switch (choice) 
                {
                    case 1:
                        System.out.println("Result = " + (a + b));
                        break;

                    case 2:
                        System.out.println("Result = " + (a - b));
                        break;

                    case 3:
                        System.out.println("Result = " + (a * b));
                        break;

                    case 4:
                        if (b != 0)
                        {
                            System.out.println("Result = " + (a / b));
                        }
                        else
                        {
                            System.out.println("Division by Zero is not allowed.");
                        }
                        break;
                }
            }
        }
         while (choice != 5);
        System.out.println("Calculator Closed.");
        sc.close();
    }
}