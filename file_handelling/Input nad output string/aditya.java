// import java.io.File;
// import java.io.Reader;


// public class aditya
// {
//     public static void main(String[ ]args)throws Exception
//     {
//          File obj=new File("F:\\desktop\\collage\\SECOND YEAR\\pooja.txt");
//          Reader fin=new Reader()
//           {
//             int x;
//             while((x=fin.read())!=-1)
//             {
//                System.out.println((char)x);
//             }
            
//         }
         
//     }
// }

import java.io.File;
public class aditya{
    public static void main(String[] args)
    {
        String path="F:\\desktop\\collage\\SECOND YEAR\\kalpesh.txt";
        File file=new File(path);
        try{
            boolean flag=file.createNewFile();
            if(flag)
            {
            System.out.println("file created succesfully");
            }
            else{
                System.out.println("file not created");
            }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
}

}