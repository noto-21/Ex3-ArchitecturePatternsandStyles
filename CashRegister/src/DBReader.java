import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class DBReader 
{
    public static final String path = "CashRegister/src/DB.txt";
    public static final int attLength = 3;

    public static void query(String query)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        String name = "Not Found";
        int id = 0;
        double price = 0;
        
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
        catch (FileNotFoundException err)
        {
            System.out.println("Error: File not found!");
            err.printStackTrace();
        }
        catch (Exception err)
        {
            System.out.println("Error: Unknown Exception!");
            err.printStackTrace();
        }

        System.out.println(String.format("%s [%d]: $%s", name, id, df.format(price)));
    }

    public static void addItem(int id, String name, double price) 
    {
        try (FileWriter fw = new FileWriter(path, true))
        {
            fw.write("\n" + String.format("%d,%s,%f", id, name, price));
        }
        catch (IOException ioe) 
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}
