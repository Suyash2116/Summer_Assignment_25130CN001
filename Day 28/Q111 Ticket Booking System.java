import java.util.Scanner;
public class TicketBooking 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int seats=10;
        while(true)
        {
            System.out.println("\nAvailable Seats = "+seats);
            System.out.print("Enter seats to book (0 to Exit): ");
            int book=sc.nextInt();
            if(book==0)
            {
                break;
            }
            if(book<=seats)
            {
                seats-=book;
                System.out.println("Booking Successful");
            }
            else
            {
                System.out.println("Not Enough Seats");
            }
        }
        System.out.println("Thank You!");
        sc.close();
    }
}