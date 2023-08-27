import java.util.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.io.*;


public class database1
{
     Scanner sc=new Scanner(System.in);
     static ArrayList<Student1> student=new ArrayList<>();
    //  find out why static keyword is used before arraylist
     static File file=new File("student1.txt");
    // dont know why static keywoed is used.
     static ObjectOutputStream opp=null;
     static ObjectInputStream ipp=null;

     public void OpenFile()throws Exception
     {
        ipp=new ObjectInputStream(new FileInputStream(file));
        // here we have created the obj of objectcalss linked with the file
        student=(ArrayList<Student1>) ipp.readObject();
        // as know readObject will written the data in the binary format we are type casting it in the ArrayList<Student1>.

        ipp.close();
     }

     public void CloseFile()throws Exception
     {
        opp=new ObjectOutputStream(new FileOutputStream(file));
        // open the file for write purpose and objectstream i linked with the file for write purpose.

        opp.writeObject(student);
        // here we are passing the object of arraylist which will store the data of class Student1
        // hence we have serialized(byte) it it will convert the data into byte and write will write in deserialized form(original).

        opp.close();
     }

     public void Insert()throws Exception
     {
        Student1 s=new Student1();
        student.add(s);
        // with the help of add methode the data get store in the arraylist 
        CloseFile();
        // after storing we wre calling Closemethode to store the data in the file
        // in Closemethode
        
     }

     private void Modify()throws Exception

     {
        if(file.isFile())
        {
            OpenFile();
            boolean found=false;
            System.out.println("Enter student ID: ");
            String id=sc.next();
            System.out.println("----------------------------------------------------");
            Student1 temp;
            for(int i=0; i<student.size(); i++)
            {
                if(Objects.equals(student.get(i).getID(), id))
                {

                
                // .size() will return the number of element in the arraylist of object
                // equals methode compare the two argument given in the brackets
                // get(i) will return the value present at zero index intially but at zero
                // index there colud be any value so at zero index i want id so .getID() is used 
                // so that at zero index we will get our Id and get compare with another parameter.
                temp=student.get(i);
                // get methode will return the element present at o index and store it in temp object.
                System.out.println(temp.toString());
                System.out.println("-------------------------------------------------------------------");
                reassign(temp);
                found true;
                }
            }
            if(found)
            {
               CloseFile();
               System.out.println("Record updated sucessfully...");
               System.out.println("------------------------------------------------------------------------------");
            }
            else{
               System.out.println("Record not found...");
            }
        }
        else{
         System.out.println("file does not exist...");
        }
     }

     public void reassign(Student1 temp)
     {
      int chioce=-1;
      do
      {
         System.out.println("1. Name:  ");
         System.out.println("2. Address:  ");
         System.out.println("3. Roll_no:  ");
         System.out.println("4. ID:  ");
         System.out.println("5. Marks:  ");
         System.out.println("6. Std:  ");
         System.out.println("7. Exit:  ");
         chioce=sc.nextInt();

         switch(chioce)
         {
            case 1: 
            {
               System.out.println("change the name: ");
               System.out.println("Enter the name: ");
               String tname=sc.nextLine();
               temp.setName(tname);
               // in the above line set methode of class Student1 is called to store the name.

               student.set(student.indexOf(temp),temp);
               // in the above line now i arraylist we ahve to update the name so
               // we have written the named of th eobject.set methode in that set methode the indexof methode
               // will written the index of temp i.e the name and then we are going to store the temp in that index.
               System.out.println("Record updated sucessfully...........");
               System.out.println("----------------------------------------------------------");
               break;

            }
            case 2:
            {
               System.out.println("change the Address: ");
               System.out.println("Enter the Address: ");
               String tAddress=sc.nextLine();
               temp.setAddress(tAddress);
               // in the above line set methode of class Student1 is called to store the name.

               student.set(student.indexOf(temp),temp);
               // in the above line now i arraylist we ahve to update the name so
               // we have written the named of th eobject.set methode in that set methode the indexof methode
               // will written the index of temp i.e the name and then we are going to store the temp in that index.
               System.out.println("Record updated sucessfully...........");
               System.out.println("----------------------------------------------------------");
               break;
            }
            case 3:
            {
               System.out.println("change the Roll_no: ");
               System.out.println("Enter the Rpll_no: ");
               int  tRoll_no=sc.nextInt();
               temp.setRoll_no(tRoll_no);
               // in the above line set methode of class Student1 is called to store the name.

               student.set(student.indexOf(temp),temp);
               // in the above line now i arraylist we ahve to update the name so
               // we have written the named of th eobject.set methode in that set methode the indexof methode
               // will written the index of temp i.e the name and then we are going to store the temp in that index.
               System.out.println("Record updated sucessfully...........");
               System.out.println("----------------------------------------------------------");
               break;
            }
            case 4:
            {
               System.out.println("change the ID: ");
               System.out.println("Enter the ID: ");
               String  tID=sc.next();
               temp.setID(tID);
               // in the above line set methode of class Student1 is called to store the name.

               student.set(student.indexOf(temp),temp);
               // in the above line now i arraylist we ahve to update the name so
               // we have written the named of th eobject.set methode in that set methode the indexof methode
               // will written the index of temp i.e the name and then we are going to store the temp in that index.
               System.out.println("Record updated sucessfully...........");
               System.out.println("----------------------------------------------------------");
               break;
            }
            case 5:
            {
               System.out.println("change the Marks: ");
               System.out.println("Enter the Marks: ");
               int  tMarks=sc.nextInt();
               temp.setMarks(tMarks);
               // in the above line set methode of class Student1 is called to store the name.

               student.set(student.indexOf(temp),temp);
               // in the above line now i arraylist we ahve to update the name so
               // we have written the named of th eobject.set methode in that set methode the indexof methode
               // will written the index of temp i.e the name and then we are going to store the temp in that index.
               System.out.println("Record updated sucessfully...........");
               System.out.println("----------------------------------------------------------");
               break;
            }
            case 6:
            {
               System.out.println("change the Std: ");
               System.out.println("Enter the Std: ");
               int  tStd=sc.nextInt();
               temp.setStd(tStd);
               // in the above line set methode of class Student1 is called to store the name.

               student.set(student.indexOf(temp),temp);
               // in the above line now i arraylist we ahve to update the name so
               // we have written the named of th eobject.set methode in that set methode the indexof methode
               // will written the index of temp i.e the name and then we are going to store the temp in that index.
               System.out.println("Record updated sucessfully...........");
               System.out.println("----------------------------------------------------------");
               break;
            }
            case 7:
            {
               chioce=7;
               break;
            }
            default:
            {
               System.out.println("Enter Valid Input.....");
            }
       

         }

      }while(chioce!=7);
}


public void search()throws Exception
{
   if(file.isFile()){
      OpenFile();
      boolean found=false;
      System.out.println("Enter id: ");
      String id=sc.next();
      System.out.println("----------------------------------------------------------------");
      Student1 temp;
      for(int i=0;i<student.size();i++)
      {
          if(Objects.equals(student.get(i).getID, temp))
          {
            temp=student.get(i);
            System.out.println(temp.toString());
            found=true;
            System.out.println("---------------------------------------------------------------------------");
          }
          
      }
      if(!found)
      {
         System.out.println("Record not found....");
         System.out.println("-----------------------------------------------------------------");
      }
      
      }else{
         System.out.println("File not exist....");
      }

   }
   public void delete()throws Exception{
      if(file.isFile())
      {
         OpenFile();
         boolean found =false;
         System.out.println("Enter the id: ");
         String id=sc.next();
         System.out.println("-----------------------------------------------------------");
         Student1 temp;
         for(int i=0;i<student.size();i++)
         {
            if(Objects.equals(student.get(i).getID, temp))
            {
               temp=student.get(i);
               student.remove(temp);
               found true;

            }
         }if(found)
         {
            CloseFile();
            System.out.println("Record deleted successfully........");
            System.out.println("---------------------------------------------------------");
         }else{
            System.out.println("Record deleted succefully.....");
         }

      }else{
         System.out.println("File not Exist.........");
      }
   }

}