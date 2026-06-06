import java.util.Scanner;
public class SetBits
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        System.out.print("Enter Number : ");
        n = sc.nextInt();
        while(n > 0)
        {
            if(n % 2 == 1)
            {
                count++;
            }
            n = n / 2;
        }
        System.out.println("Total Set Bits = " + count);
    }
}