import java.util.Scanner;
public class ContactManagement 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String[] names=new String[5];
        String[] numbers=new String[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter Contact Name: ");
            names[i]=sc.next();
            System.out.print("Enter Mobile Number: ");
            numbers[i]=sc.next();
        }
        System.out.println("\n===== CONTACT LIST =====");
        for(int i=0;i<5;i++)
        {
            System.out.println(names[i]+" : "+numbers[i]);
        }
        sc.close();
    }
}