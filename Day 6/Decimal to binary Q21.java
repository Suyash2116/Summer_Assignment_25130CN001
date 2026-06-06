import java.util.Scanner;
public class Decimal_To_Binary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        String binary = "";
        System.out.print("Enter Decimal Number : ");
        n = sc.nextInt();
        while(n > 0)
        {
            binary = (n % 2) + binary;
            n = n / 2;
        }
        System.out.println("Binary Number = " + binary);
    }
}