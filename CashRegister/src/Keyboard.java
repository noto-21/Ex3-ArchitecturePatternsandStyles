import java.util.Scanner;

public class Keyboard 
{
    private static Scanner sc = new Scanner(System.in);
    private static String query;

    public static String inputQuery()
    {
        query = sc.nextLine();

        return query;
    }

    public static void close()
    {
        sc.close();
    }
}
