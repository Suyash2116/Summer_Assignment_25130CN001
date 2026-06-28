import java.util.Scanner;
public class InventoryManagement 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] items = new String[5];
        int[] quantity = new int[5];
        for (int i = 0; i < 5; i++) 
        {
            System.out.print("Enter Item Name: ");
            items[i] = sc.next();
            System.out.print("Enter Quantity: ");
            quantity[i] = sc.nextInt();
        }
        System.out.println("\n===== INVENTORY =====");
        for (int i = 0; i < 5; i++) 
        {
            System.out.println(items[i] + " : " + quantity[i]);
        }
        sc.close();
    }
}