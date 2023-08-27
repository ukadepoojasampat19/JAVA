// The CharArrayWriter class can be used to write common data to multiple files


// import java.io.CharArrayWriter;
// import java.io.FileWriter;

// public class char_writer {
//     public static void main(String[] args)throws Exception
//     {
//         CharArrayWriter c=new CharArrayWriter();
//         c.write("Hello pooja");

//         FileWriter Fw=new FileWriter("F:\\hello.txt");
//         c.writeTo(Fw);
//         System.out.println("Written sucessfully....");

//         // FileWriter Fw=new FileWriter("F:\\hello.txt");
//         // Fw.write("Hello pooja");
//         // Fw.close();
//         // System.out.println("Written sucessfully....");


//         // c.close();



//     }
    
// }


// passing empty aarray as a parameter.

import java.io.CharArrayWriter;

public class char_writer{
    public static void main(String[] args)throws Exception
    {
        char b[10];
        CharArrayWriter cw=new CharArrayWriter(b);
    }
}