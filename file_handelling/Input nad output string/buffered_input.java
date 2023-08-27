
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class buffered_input {

    public static void main(String[] args)throws Exception
    { 
        FileInputStream Fin=new FileInputStream("F:\\hello.txt");
        BufferedInputStream buff=new BufferedInputStream(Fin);
        System.out.print("First char "+(char)buff.read());
        System.out.print("\nSecond char "+(char)buff.read());
        System.out.print("\nThird char "+(char)buff.read());

        System.out.println("\nBefore mark: ");
        // mark is used to specified the current position where you are starting to read the file.

        
        buff.mark(0);

        System.out.println("\n before reset position ...");

        System.out.print("\nFirst char "+(char)buff.read());
        System.out.print("\nSecond char "+(char)buff.read());
        System.out.println("After mark used..");
        

        buff.reset();

        System.out.println("\n after reset position ...");

        System.out.print("\nFirst char "+(char)buff.read());
        System.out.print("\nSecond char "+(char)buff.read());






       
        // int i;
        // while((i=buff.read())!=-1)
        // {
        //     System.out.print((char)i);
        //     buff.reset();
        // }


        
        buff.close();
        Fin.close();

    }
    
}
