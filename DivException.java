public class DivException
{
    static int a=10,b=0;
    public static void main(String[] args) {
        try{
            System.out.println("Quotient:"+(a/b));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception thrown:"+e);
        }
        finally{
            b++;
            System.out.println("Quotient"+(a/b));
        }
    }
}