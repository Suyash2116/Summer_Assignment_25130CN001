import java.util.Scanner;
public class QuizApplication 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int answer;
        System.out.println("===== Java Quiz =====");
        System.out.println("\n1. Which keyword is used to inherit a class?");
        System.out.println("1. implements");
        System.out.println("2. extends");
        System.out.println("3. import");
        System.out.println("4. package");
        answer = sc.nextInt();
        if (answer == 2)
            score++;
        System.out.println("\n2. Which method is the entry point of a Java program?");
        System.out.println("1. start()");
        System.out.println("2. run()");
        System.out.println("3. main()");
        System.out.println("4. execute()");
        answer = sc.nextInt();
        if (answer == 3)
            score++;
        System.out.println("\n3. Java is?");
        System.out.println("1. Platform Independent");
        System.out.println("2. Platform Dependent");
        System.out.println("3. Operating System");
        System.out.println("4. None");
        answer = sc.nextInt();
        if (answer == 1)
            score++;
        System.out.println("\nYour Score = " + score + "/3");
        sc.close();
    }
}