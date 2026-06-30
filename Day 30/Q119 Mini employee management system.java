import java.util.Scanner;
public class MiniEmployee 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] empName = new String[3];
        double[] salary = new double[3];
        for (int i = 0; i < 3; i++) 
        {
            System.out.print("Enter Employee Name: ");
            empName[i] = sc.next();
            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
        }
        System.out.println("\n------ Employee Details ------");
        for (int i = 0; i < 3; i++) 
        {
            System.out.println(empName[i] + " : ₹" + salary[i]);
        }
        sc.close();
    }
}