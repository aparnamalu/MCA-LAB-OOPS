import java.io.BufferedReader;   // BufferedReader, FileReader, FileWriter: For reading from and writing to files
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;     // To handle file-related errors
import java.util.Scanner;       // For reading user input from the console

public class FileWrite
{
    public static void main(String[] args)
    {
        try
        {
            Scanner s = new Scanner(System.in);

            System.out.print("\nEnter File Name : ");
            String fname = s.nextLine();

            // Creates a FileWriter object "obW" to write to specified file
            // "true" means append mode
            FileWriter obW = new FileWriter(fname,true);

            System.out.print("\nEnter no. of entries in file : ");
            int n = s.nextInt();

            System.out.println("\nEnter " + n + " entries into file ");
            String data;

            s.nextLine(); // To consume leftover newline

            for(int i = 0; i <= n; i++)
            {
                data = s.nextLine();
                obW.write(data + "\n");
            }

            // Close FileWriter
            obW.close();

            // Read File and Display Contents
            FileReader obR = new FileReader(fname);
            BufferedReader br = new BufferedReader(obR);

            String line;
            System.out.println("Data read from " + fname + " file");

            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }

            obR.close();
        }
        catch (IOException e)
        {
            System.out.println("---- Error ----");
        }
    }
}