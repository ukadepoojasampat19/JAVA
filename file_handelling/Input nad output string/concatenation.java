import java.io.*;

public class concatenation {

    public static void main(String[] args)throws Exception
    {
        FileInputStream Fin=new FileInputStream("F:\\File1.txt");
        FileInputStream Fin2=new FileInputStream("F:\\File2.txt");

        SequenceInputStream sin=new SequenceInputStream(Fin,Fin2);

        BufferedInputStream buff=new BufferedInputStream(sin);
        BufferedOutputStream buff2=new BufferedOutputStream(System.out);

        int c;
        while((c=sin.read())!=-1)
        {
             buff2.write((char)c);
        }

        buff.close();
        buff2.close();
        sin.close();
        Fin2.close();
        Fin.close();



        
        
       
        // sin.close();
        // // Fh.close();
        // Fin2.close();
        // Fin.close();



    }

    
}
