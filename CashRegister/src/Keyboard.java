import java.util.Scanner;

public class Keyboard 
{
    private static Scanner sc = new Scanner(System.in);
    private static String query;

    public static String getQuery()
    {
        return query;
    }

    public static void inputQuery()
    {
        query = sc.nextLine();
    }

    public static void close()
    {
        sc.close();
    }
}
