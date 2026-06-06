import java.util.Scanner;
public class Binary_To_Decimal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int binary;
        int decimal = 0;
        int base = 1;
        System.out.print("Enter Binary Number : ");
        binary = sc.nextInt();
        while(binary > 0)
        {
            int lastDigit = binary % 10;
            decimal = decimal + lastDigit * base;
            base = base * 2;
            binary = binary / 10;
        }
        System.out.println("Decimal Number = " + decimal);
    }
}