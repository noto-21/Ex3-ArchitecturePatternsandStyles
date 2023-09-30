import java.util.Scanner;

public class Keyboard 
{
    public static String getInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a query: ");
        String input = sc.nextLine();
        sc.close();
        return input;
    }
}
