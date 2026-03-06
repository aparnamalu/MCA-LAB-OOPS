import java.util.Scanner;
public class StudentDetails
{
    int rollno,m1,m2,m3;
    String name;
    int total;
    float average;
    void getdata()

{
Scanner scan=new Scanner(System.in);
System.out.println("\n\nEnter Student Name,rollno and marks of 3 subjects:");
name=scan.nextLine();
rollno=scan.nextInt();
m1=scan.nextInt();
m2=scan.nextInt();
m3=scan.nextInt();
}
void cal()
{
total=m1+m2+m3;
average=total/3.0f;
System.out.println("Total marks:"+total);
System.out.println("Average:"+average);
}
public static void main(String args[])
{
    StudentDetails r=new StudentDetails();
    r.getdata();
    System.out.println("\n\nStudent Details\n");
    System.out.println("Name:"+r.name);
    System.out.println("Rollno:"+r.rollno);
    r.cal();


}
}


