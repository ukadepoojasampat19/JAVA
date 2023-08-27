// import java.io.InputStream;
import java.io.ByteArrayInputStream;


public class File1 {

    public static void main(String[] args)throws Exception {

        // try
        // {
        //     FileInputStream Fin=new FileInputStream("F:\\hello.txt");
        //     int i=Fin.read();
        //     System.out.println((char)i);
        // }
        // catch(Exception e)
        // {
        //     System.out.println("Done");
        // }

             byte b[]={35,36,37,38};
              
             ByteArrayInputStream by=new ByteArrayInputStream(b);
             int i;
             while((i=by.read())!=-1)
             {
                System.out.println((char)i);
             }
             
            

        

        
        
    }

    
}
