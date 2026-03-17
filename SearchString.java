import java.util.Scanner;
public class SearchString
{
    public static void main(String args[])
    {
        int i,j,pos=0,f=0;
        boolean state=false;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no.of elements in array");
        int num=s.nextInt();
        String word[]=new String[num];
        System.out.println("\nEnter"+num+"words");
        for(i=0;i<num;i++)
        {
            word[i]=s.next();
            
        }
        System.out.println("Enter element to be searched:");
        String search=s.next();
        for(i=0;i<num;i++)
        {
            if(word[i].equals(search))
            {
                pos=i+1;
                state=true;
                break;
            }
        }
        if(state)
        {
            System.out.println("Element found at position="+(pos));
        }
        else
        {
            System.out.println("Elements not found");
        }
    }
}