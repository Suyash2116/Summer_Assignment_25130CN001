import java.util.Scanner;
public class lcm 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int x = a, y = b;
        while (y != 0) 
        {
            int temp = y;
            y = x % y;
            x = temp;
        }
        int t = x;
        int lcm = (a * b) / t;
        System.out.println("LCM = " + lcm);
        sc.close();
    }
}