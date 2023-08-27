import java.io.BufferedOutputStream;
import java.io.FileOutputStream;


public class buffered_output {

    public static void main(String[] args)throws Exception
    {
        FileOutputStream Fout=new FileOutputStream("F:\\hello.txt");
        BufferedOutputStream buff=new BufferedOutputStream(Fout);
        String s="My Name is pooja sampat ukade.";
        byte b[]=s.getBytes();

        buff.write(b);
        
        buff.close();
        Fout.close();

        System.out.println("Written sucessfully....0");

    }
    
}
