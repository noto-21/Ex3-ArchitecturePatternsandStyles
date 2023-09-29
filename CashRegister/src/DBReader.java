import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

public class DBReader 
{
    public static void query(String query)
    {
        DecimalFormat df = new DecimalFormat("0.00");
        String name = "Not Found";
        double price = 0;
        
        try (Scanner sc = new Scanner(new File("CashRegister/src/DB.txt"));)
        {
            while (sc.hasNext())
            {
                String read = sc.nextLine();
                String[] itemArr = read.split(",");

                if (itemArr.length == 3 && itemArr[0].equals(query))
                {
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

        System.out.println(name + ": $" + df.format(price));
    }
}