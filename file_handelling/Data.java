// used of FileInputStream Class  to read single and multiple charecteryt

import java.io.FileInputStream;
// here we have imported the class which we have to used for taking input.



public class Data{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream Fin=new FileInputStream("F:\\hello.txt");
            // in the above line Fin is reference varible which is pointing to to the input class
            // in the bracketsmention the name of file where our data is store.  
            // to read a single charecter
            // int i=Fin.read();
            // System.out.println((char)i);

            // with the help of read() which is of FileInputStream class will read the data of one byte 
            // it will retuen -1 if all the data has been read

            
            // to read whole file
        
            int i=0;
            while((i=Fin.read())!=-1)
            {
                System.out.print((char)i);
            }
            
            Fin.close();
        }
        catch(Exception e)

        {
            System.out.println(e);
        }

    }

    
}
