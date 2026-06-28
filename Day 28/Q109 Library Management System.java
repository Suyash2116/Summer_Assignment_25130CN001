import java.util.Scanner;
public class LibraryManagement 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] books = {"Java", "Python", "C++", "Data Structures"};
        boolean[] issued = new boolean[books.length];
        int choice;
        do 
        {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    for(int i=0;i<books.length;i++)
                    {
                        System.out.println((i+1)+". "+books[i]+" - "
                        +(issued[i]?"Issued":"Available"));
                    }
                    break;

                case 2:
                    System.out.print("Enter Book Number: ");
                    int issue=sc.nextInt()-1;
                    if(issue>=0 && issue<books.length)
                    {
                        if(!issued[issue])
                        {
                            issued[issue]=true;
                            System.out.println("Book Issued Successfully.");
                        }
                        else
                        {
                            System.out.println("Book Already Issued.");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Number: ");
                    int ret=sc.nextInt()-1;
                    if(ret>=0 && ret<books.length)
                    {
                        if(issued[ret])
                        {
                            issued[ret]=false;
                            System.out.println("Book Returned Successfully.");
                        }
                        else
                        {
                            System.out.println("Book was not issued.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
        while(choice!=4);
        sc.close();
    }
}