import java.io.*;

public class random_access {
    
    static final String FilePath="F:\\File1.txt";
    public static void main(String[] args)throws Exception
    {
           System.out.println(new String(readFromFile(FilePath,0,18)));
    }
    
}

