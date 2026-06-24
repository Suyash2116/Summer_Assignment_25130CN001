import java.util.Scanner;
public class FirstRepeating 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) 
        {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != str.lastIndexOf(ch)) 
            {
                System.out.println("First Repeating Character: " + ch);
                return;
            }
        }
        System.out.println("No Repeating Character Found");
    }
}