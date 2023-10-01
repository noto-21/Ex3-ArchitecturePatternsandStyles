import java.text.DecimalFormat;

public class CashRegister 
{
    private static DecimalFormat df = new DecimalFormat("0.00");

    /*-------------------
     * DB-Related Methods
     ---------------------*/
    private static boolean queryDB(String query)
    {
        return DBReader.query(query);
    }

    /*-------------------
     * DB-Display Hybrid Methods
     ---------------------*/
    private static void queryResultSuccess()
    {
        Display.outLn(String.format("ID: %s", DBReader.getId()));
        Display.outLn(String.format("Name: %s", DBReader.getName()));
        Display.outLn(String.format("Price: $%s", df.format(DBReader.getPrice())));
    }
    private static void queryResultFailure()
    {
        Display.outLn(String.format("ERROR: ID '%s' not located in database!", DBReader.getId()));
    }

    public static void query(String query)
    {
        if (queryDB(query))
        {
            queryResultSuccess();
        }
        else
        {
            queryResultFailure();
        }
    }

    /*------------------------
     * Display-Related Methods
     --------------------------*/
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

    /*------------------------
     * Keyboard-Related Methods
     --------------------------*/
    public static String inputQuery()
    {
        Keyboard.inputQuery();
        return Keyboard.getQuery();
    }

    public static void closeKeyboard()
    {
        Keyboard.close();
    }
}
