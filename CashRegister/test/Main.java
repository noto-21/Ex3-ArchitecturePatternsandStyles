public class Main
{
    public static void main(String[] args)
    {
        Keyboard.getInput();

        DBReader.query("345712368");
        DBReader.query("133874926");
        DBReader.query("247473641");
        DBReader.query("248736911");

        /*
         * TODO:
         * Add an item to DB
         * Add a method to DBReader to read all items
         * Add a method to DBReader to read all items with a price less/greater than a given price
         * Implement MVC with CashRegister.java
         */
    }
}