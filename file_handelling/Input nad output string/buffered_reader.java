import java.io.InputStreamReader;
import java.io.BufferedReader;

public class buffered_reader {
    public static void main(String[] args)throws Exception
    {
        // we are using input stream reader class for taking input from user.
        InputStreamReader Fin=new InputStreamReader(System.in);
        // here we have to take input from the user that is to read the data from the console 
        // for that purpose we used the InputStreamReaderclass.
        BufferedReader buff=new BufferedReader(Fin);
        // so buffered reader class is usefull to take the input in by including the space in one stroke and proint it


        System.out.println("Enter your name: ");
        String name=buff.readLine();
        System.out.println("name : "+ name);



    }
    
}
