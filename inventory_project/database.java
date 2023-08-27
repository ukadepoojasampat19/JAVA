import java.util.*;
import java.util.ArrayList;
// import java.io.FileInputStream;
import java.io.FileOutputStream;
// import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class database implements Serializable{

    private String First_Name;
    private String last_Name;
    private int Birth_Year;

     public database(String First_Name,String  last_Name, int  Birth_Year)
     
     {
        this.First_Name= First_Name;
        this.last_Name=last_Name;
        this.Birth_Year= Birth_Year;
     }
     @Override

     public String toString()
     {
        return "First_Name: "+First_Name+"\t"+"last_Name: "+last_Name+"\t"+ " Birth_Year: "+ Birth_Year+"\n";
     }
     public static void main(String [] args)throws Exception
     {
         database b1=new database("pooja","ukade",2003);
         database b2=new database("kalpesh","uade",1998);
         database b3=new database("rupesh","ukde",1999);
     
        ArrayList<database> obj=new ArrayList<database>();

        obj.add(b1);
        obj.add(b2);
        obj.add(b3);

        // to write the data in the file.

       

            FileOutputStream fout=new  FileOutputStream("F:\\desktop\\collage\\SECOND YEAR\\pooja.txt");
            ObjectOutputStream obj_out=new ObjectOutputStream(fout);
            
            obj_out.writeObject(fout);
            obj_out.flush();
            obj_out.close();

            

      
        

      
            // FileInputStream fin=new FileInputStream("F:\\desktop\\collage\\SECOND YEAR\\kalpesh.txt");
            // ObjectInputStream obj_in=new ObjectInputStream(fin);

            // ArrayList<database> obj1=(ArrayList<database>) obj_in.readObject();
            // obj_in.close();

            // System.out.println(obj1.toString());
       
     }
     
}



