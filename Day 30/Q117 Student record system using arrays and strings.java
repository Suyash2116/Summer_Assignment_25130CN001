import java.util.Scanner;
public class StudentRecordSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        int[] marks = new int[5];
        System.out.println("Enter Details of 5 Students:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter Name: ");
            names[i] = sc.next();
            System.out.print("Enter Marks: ");
            marks[i] = sc.nextInt();
        }
        System.out.println("\n------ Student Records ------");
        for (int i = 0; i < 5; i++) 
        {
            System.out.println((i + 1) + ". " + names[i] + " - " + marks[i]);
        }
        sc.close();
    }
}