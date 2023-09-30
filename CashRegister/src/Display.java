public class Display 
{
    public static void out(String message)
    {
        System.out.print(message);
    }
    public static void outLn(String message)
    {
        System.out.println(message);
    }

    public static void errorPrint(Exception e)
    {
        e.printStackTrace();
    }
}
