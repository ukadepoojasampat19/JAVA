import java.io.FileInputStream;

public class filereda {

    public static void main(String[] args)
    {
        // this is for reading only one charecter.
        // try
        // {
        //     FileInputStream  Fin=new FileInputStream("F:\\hello.txt");
        //     int i=Fin.read();
        //     System.out.print((char)i);

        // }
        // catch(Exception e)
        // {
        //     System.out.println(e);
        // }

        // for reading a multiple charecter.
        try
       {
           FileInputStream  Fin=new FileInputStream("F:\\hello.txt");
           int i=0;
           while((i=Fin.read())!=-1)
           {
               System.out.print((char)i);
           }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }

        
        
        
    }

    
}
