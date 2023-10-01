/*
 * ~DB Base Contents~
 * [247473641]: Banana, 0.47
 * [345712368]: Apple, 1.12
 * [248736911]: Mango, 1.20
 * [133874926]: HD Television, 499.99
 * [180026721]: Ramen, 0.94
 */

public class Main
{
    public static void main(String[] args)
    {
        CashRegister.outputLn("Welcome to the Cash Register!");

        while (true)
        {
            CashRegister.output("\nPlease enter a 9-digit ID to query ['X' to quit]: ");
            String idQuery = CashRegister.inputQuery();

            if (idQuery.toLowerCase().equals("X".toLowerCase()))
                break;

            CashRegister.query(idQuery);
        }

        CashRegister.closeKeyboard();

        CashRegister.outputLn("\nThank you for using the Cash Register!\n");
    }
}