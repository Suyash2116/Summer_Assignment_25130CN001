import java.util.Scanner;
public class MiniProject 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        int[] marks = new int[5];
        int count = 0;
        int choice;
        do 
        {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) 
            {
                case 1:

                    if (count < 5) 
                    {
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();
                        System.out.print("Enter Marks: ");
                        marks[count] = sc.nextInt();
                        count++;
                        System.out.println("Student Added Successfully.");
                    }
                     else 
                    {

                        System.out.println("Database Full.");
                    }
                    break;

                case 2:

                    if (count == 0) 
                    {
                        System.out.println("No Records Found.");
                    }
                     else 
                    {
                        System.out.println("\nStudent Records");
                        for (int i = 0; i < count; i++) 
                        {
                            System.out.println(names[i] + " - " + marks[i]);
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Student Name: ");
                    String search = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) 
                    {
                        if (names[i].equalsIgnoreCase(search)) 
                        {
                            System.out.println("Marks = " + marks[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) 
                    {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 4:

                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        } 
        while (choice != 4);
        sc.close();
    }
}