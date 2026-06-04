import java.util.Scanner;
public class Arm_Range 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();
        for(int num = start; num <= end; num++) 
        {
            int temp = num, sum = 0;
            while(temp > 0) 
            {
                int rem = temp % 10;
                sum = sum + rem * rem * rem;
                temp = temp / 10;
            }
            if(sum == num)
                System.out.print(num + " ");
        }
    }
}