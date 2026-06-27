import java.util.Scanner;
public class MarksheetGeneration 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Marks in Subject 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter Marks in Subject 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter Marks in Subject 3: ");
        int s3 = sc.nextInt();
        int total = s1 + s2 + s3;
        double percentage = total / 3.0;
        String grade;
        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 80)
            grade = "A";
        else if (percentage >= 70)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else if (percentage >= 40)
            grade = "D";
        else
            grade = "F";
        System.out.println("\n------ Marksheet ------");
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + percentage + "%");
        System.out.println("Grade        : " + grade);
        sc.close();
    }
}