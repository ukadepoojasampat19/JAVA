import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;


public class byteoutput {

    public static void main(String[] args)throws Exception
    {
        FileOutputStream fout1=new FileOutputStream("F:\\f1.txt");
        FileOutputStream fout2=new FileOutputStream("F:\\f2.txt");

        ByteArrayOutputStream bout= new ByteArrayOutputStream();
        bout.write(65);
        bout.writeTo(fout1);
        bout.writeTo(fout2);
        System.out.println("Sucessully written .......");
    }
    
}
