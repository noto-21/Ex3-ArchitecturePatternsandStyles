import java.util.Scanner;

public class Keyboard 
{
    public static String query()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a query: ");
        String query = sc.nextLine();
        sc.close();
        return query;
    }

    public static void addItem()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an ID: ");
        int id = sc.nextInt();

        System.out.print("Enter a name: ");
        String name = sc.next();

        System.out.print("Enter a price: ");
        double price = sc.nextDouble();

        sc.close();
        
        CashRegister.inputDB(id, name, price);
    }
}
