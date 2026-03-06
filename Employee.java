import java.util.Scanner;
public class Employee
{
    int empid,TA,DA,HRA,Tax,netsal,basic;
    String empname;
    void getdata()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter employee name,id,basic pay,TA,DA,HRA and Tax");
        empname=scan.nextLine();
        empid=scan.nextInt();
        basic=scan.nextInt();
        TA=scan.nextInt();
        DA=scan.nextInt();
        HRA=scan.nextInt();
        Tax=scan.nextInt();

    }
    void calc()
    {
        netsal=( basic+TA+DA+HRA)-Tax;
        System.out.println("Net salary:"+netsal);

    }
    public static void main(String args[])
    {
        Employee e1=new Employee();
        e1.getdata();
        System.out.println("\n Employee Details");
        System.out.println("---------------------------");
        System.out.println("Employee ID:"+e1.empid);
        System.out.println("Employee name:"+e1.empname);
        e1.calc();
    }
}