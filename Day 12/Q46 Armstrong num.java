import java.util.Scanner;
public class Armstrongnum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0, temp;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        temp = n;
        while(n > 0)
        {
            int r = n % 10;
            sum = sum + r*r*r;
            n = n / 10;
        }
        if(sum == temp)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}