import java.util.Scanner;

interface Shape
{
    double area();
    double perimeter();
}

class Circle implements Shape
{
    double radius;

    Circle(double r)
    {
        radius = r;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }

    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape
{
    double length, breadth;

    Rectangle(double l, double b)
    {
        length = l;
        breadth = b;
    }

    public double area()
    {
        return length * breadth;
    }

    public double perimeter()
    {
        return 2 * (length + breadth);
    }
}

public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)

    
        {
            System.out.println("\n1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    Circle c = new Circle(r);
                    System.out.println("Area = " + c.area());
                    System.out.println("Perimeter = " + c.perimeter());
                    break;

                case 2:
                    System.out.print("Enter length: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double b = sc.nextDouble();
                    Rectangle rect = new Rectangle(l, b);
                    System.out.println("Area = " + rect.area());
                    System.out.println("Perimeter = " + rect.perimeter());
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        }

    }
}
