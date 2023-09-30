public class CashRegister 
{
    public static void queryDB(String query)
    {
        DBReader.query(query);
    }
    public static void inputDB(int id, String name, double price)
    {
        DBReader.addItem(id, name, price);
    }

    public static void output(String message)
    {
        Display.out(message);
    }
    public static void outputLn(String message)
    {
        Display.outLn(message);
    }
    public static void trace(Exception e)
    {
        Display.errorPrint(e);
    }
}
