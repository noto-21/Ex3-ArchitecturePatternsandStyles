import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DBReader 
{
    private static String path = "CashRegister/src/DB.txt";
    private static File db = new File(path);
    private static final int attLength = 3;
    private static String id;
    private static String name;
    private static double price;

    public static String getId()
    {
        return id;
    }
    public static String getName()
    {
        return name;
    }
    public static double getPrice()
    {
        return price;
    }

    public static boolean query(String query)
    {
        boolean success = false;

        id = query;
        
        try (Scanner sc = new Scanner(db))
        {
            while (sc.hasNext())
            {
                String read = sc.nextLine();
                String[] itemArr = read.split(",");

                if (itemArr.length == attLength && itemArr[0].equals(query))
                {
                    name = itemArr[1];
                    price = Double.parseDouble(itemArr[2]);
                    success = true;
                    break;
                }
                else
                {
                    name = "Not Found";
                    price = 0.00;
                }
            }
        }
        catch (FileNotFoundException e)
        {
            CashRegister.outputLn("Error: File not found! - " + e.getMessage());
            CashRegister.trace(e);
        }
        catch (Exception e)
        {
            CashRegister.outputLn("Error: Unknown Exception! - " + e.getMessage());
            CashRegister.trace(e);
        }

        return success;
    }
}
