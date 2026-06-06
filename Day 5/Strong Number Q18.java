import java.util.Scanner;
public class StrongNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, temp, d;
        int sum = 0;
        System.out.print("Enter Number : ");
        n = sc.nextInt();
        temp = n;
        while(temp > 0)
        {
            d = temp % 10;
            int fact = 1;
            for(int i = 1; i <= d; i++)
            {
                fact = fact * i;
            }
            sum = sum + fact;
            temp = temp / 10;
        }
        if(sum == n)
        {
            System.out.println("Strong Number");
        }
        else
        {  
            System.out.println("Not Strong Number");
        }
    }
}