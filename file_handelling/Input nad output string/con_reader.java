// copy the data of two file and store it in another file

import java.io.*;


public class con_reader {
    public static void main(String[] args)throws Exception
    {
          PrintWriter pw=new PrintWriter("F:\\hello.txt");

          FileReader Fin=new FileReader("F:\\File1.txt");
          BufferedReader buff=new BufferedReader(Fin);

          String  line=buff.readLine();
          while(line!=null)
          {
             pw.println(line);
             line=buff.readLine();
          }

          FileReader Fin1=new FileReader("F:\\File2.txt");
          buff=new BufferedReader(Fin1);

          String  line1=buff.readLine();
          while(line1!=null)
          {
             pw.println(line1);
             line1=buff.readLine();
          }

         //  pw.flush();
          buff.close();
          pw.close();



    }

    
}
