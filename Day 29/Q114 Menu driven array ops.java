import java.util.Scanner;
public class ArrayOperations 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 Elements:");
        for (int i = 0; i < 5; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int choice;
        do 
        {
            System.out.println("\n===== ARRAY MENU =====");
            System.out.println("1. Display Array");
            System.out.println("2. Find Maximum");
            System.out.println("3. Find Minimum");
            System.out.println("4. Find Sum");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Array: ");
                    for (int num : arr)
                        System.out.print(num + " ");
                    System.out.println();
                    break;

                case 2:
                    int max = arr[0];
                    for (int num : arr)
                        if (num > max)
                            max = num;

                    System.out.println("Maximum = " + max);
                    break;

                case 3:
                    int min = arr[0];
                    for (int num : arr)
                        if (num < min)
                            min = num;

                    System.out.println("Minimum = " + min);
                    break;

                case 4:
                    int sum = 0;
                    for (int num : arr)
                        sum += num;

                    System.out.println("Sum = " + sum);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
        while (choice != 5);
        sc.close();
    }
}