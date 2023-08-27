import java.io.FileOutputStream;

public class fillewrite {
    public static void main(String[] args)
    {

        // for printing a single charecter
        // try{
        //     FileOutputStream Fout=new FileOutputStream("F:\\hello.txt");
        //     Fout.write(76);
        //     Fout.close();
        //     System.out.println("Succesfully written.");

        // }
        // catch(Exception e)
        // {
        //     System.out.print(e);
        // }

        // below is for printing  a whole line.
        try{ 

            FileOutputStream Fout=new FileOutputStream("F:\\hello.txt");
            String s="I am studing File Handelling.";
            byte b[]=s.getBytes();
            Fout.write(b);
            Fout.close();
            System.out.println("Sucess fully done.");


        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        

       
    }
    
}
