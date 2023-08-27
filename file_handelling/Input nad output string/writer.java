import java.io.FileWriter;

// FILE WRITER.

public class writer {
    public static void main(String[] args)throws Exception
    {
        FileWriter Fw=new FileWriter("F:\\hello.txt");
        String s="Hello my self Pooja Sampat Ukade.";
        // byte b[]=s.getBytes();
        // Here we dont have to convert the string into byte because in charecter strem class write methode directly take the string as  input.
        Fw.write(s);
        Fw.close();
        System.out.println("Written sucessfully......");

    }
    
}
