import java.util.Scanner;

interface Calc
{
    void calculate();
}

class Bill implements Calc
{
    String pid, pname;
    int quantity;
    double price, total, amount = 0;

    Scanner sc = new Scanner(System.in);

    public void calculate()
    {
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        System.out.println("\nProduct Id\tName\tQuantity\tUnit Price\tTotal");

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter Product Id: ");
            pid = sc.next();

            System.out.print("Enter Product Name: ");
            pname = sc.next();

            System.out.print("Enter Quantity: ");
            quantity = sc.nextInt();

            System.out.print("Enter Unit Price: ");
            price = sc.nextDouble();

            total = quantity * price;
            amount += total;

            System.out.println(pid + "\t\t" + pname + "\t" + quantity + "\t\t" + price + "\t\t" + total);
        }

        System.out.println("\nNet Amount = " + amount);
    }
}

public class Shop
{
    public static void main(String[] args)
    {
        Bill b = new Bill();
        b.calculate();
    }
}