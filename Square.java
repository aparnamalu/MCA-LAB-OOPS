public class Square
{
    int side;
    void getInput(int a)
    {
        side=a;
    }
    double calArea()
    {
        return side*side;
    } 
    public static void main(String[] args) 
    {
      Square r= new Square();
      r.getInput(5);
      System.out.println("Area of square="+r.calArea());  
    }
}