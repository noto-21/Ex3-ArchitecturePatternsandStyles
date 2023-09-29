/*
 * DB.txt contents:
 * 100825559,Banana,0.47
 * 345712368,Apple,1.12
 * 248736911,Mango,1.20
 * 133874926,HD Television,420.00
 */

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Test 1:");
        DBReader.query("345712368");
        DBReader.query("133874926");
    }
}