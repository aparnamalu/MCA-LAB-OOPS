public class ComplexNumber
{
    double real,img;

    public ComplexNumber(double r,double i) {
        real=r;
        img=i;
    }
    public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2)
    {
        return new ComplexNumber(c1.real+c2.real,c1.img+c2.img);

    }
    public static void main(String[] args) {
        ComplexNumber c1=new ComplexNumber(5.5,4);
        ComplexNumber c2=new ComplexNumber(1.2,3.5);
        ComplexNumber  temp=sum(c1,c2);
        System.out.println("Sum is:"+temp.real+"+"+temp.img+"i");

    }
    
}