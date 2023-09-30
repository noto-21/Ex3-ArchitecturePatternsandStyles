import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class DBReader 
{
    private static final String path = "CashRegister/src/DB.txt";
    private static final int attLength = 3;
    private static String name = "Not Found";
    private static int id = 1;
    private static double price = 0;

    public static int getId(int id)
    {
        return id;
    }
    public static String getName(String name)
    {
        return name;
    }
    public static double getPrice(double price)
    {
        return price;
    }

    public static void query(String query)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        
        try (Scanner sc = new Scanner(new File(path));)
        {
            while (sc.hasNext())
            {
                String read = sc.nextLine();
                String[] itemArr = read.split(",");

                if (itemArr.length == attLength && itemArr[0].equals(query))
                {
                    id = Integer.parseInt(itemArr[0]);
                    name = itemArr[1];
                    price = Double.parseDouble(itemArr[2]);
                    break;
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

        CashRegister.outputLn(String.format("%s [%d]: $%s", name, id, df.format(price)));
    }

    public static void addItem(int id, String name, double price) 
    {
        try (FileWriter fw = new FileWriter(path, true))
        {
            fw.write("\n" + String.format("%d,%s,%f", id, name, price));
        }
        catch (IOException e) 
        {
            CashRegister.outputLn("IOException: " + e.getMessage());
        }
    }
}
