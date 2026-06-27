import java.util.Scanner;
public class VotingEligibility 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age and nationality :");
        int age = sc.nextInt();
        String nationality = sc.next();
        if (age >= 18 && nationality.equals("Indian")) 
        {
            System.out.println("You are eligible to vote.");
        }
         else 
        {
            System.out.println("You are not eligible to vote.");
        }
        sc.close();
    }
}