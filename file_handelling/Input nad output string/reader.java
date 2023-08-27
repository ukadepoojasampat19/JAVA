// import java.io.*;
// // reader class come under java.io.pakage

// public class reader {
//     public static void main(String[] args)throws Exception
//     {
//         //   We cannot make the object of reader class because it is abstract class
//         // so we make reference variable of the reader class.
//         Reader re=new FileReader("F:\\hello.txt");
//         int i;
//         while((i=re.read())!=-1)
//         {
//             System.out.print((char)i);
//         }
//         re.close();
       
//     }

    
// }


// FileReader class is inherited class of Reader class.

import java.io.FileReader;

public class reader{
    public static void main(String[] args)
    {
        try
        {
            
            FileReader Fin=new FileReader("F:\\hello.txt");
            int i=Fin.read();
            System.out.println((char)i);
            Fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         
       
    }
}


// to check whether my file exist or not.

// import java.io.File;

// public class reader{
//     public static void main(String[] args)
//     {
        
//         File obj = new File("F:\\hello.txt");
//         if(obj.exists() )
//         {
//             System.out.println("Exsits");
//         }
//         else{
//             System.out.println("Not Exsits. ");
//         }
//     }

// }
