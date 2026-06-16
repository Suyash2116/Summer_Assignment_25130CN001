import java.util.Scanner;
public class MissingNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int expected = (n + 1) * (n + 2) / 2;
        int actual = 0;
        for(int i = 0; i < n; i++) 
        {
            actual += arr[i];
        }
        int missing = expected - actual;
        System.out.println("Missing Number = " + missing);
    }
}