import java.util.*;

public class student_database 
{
   
   
    public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       String name;
       int age;
    
        System.out.println("Name: ");
        name=sc.next();
        System.out.println("Age: ");
        age=sc.nextInt();

    
    student s =new student(name,age);
    // s.getdata();

    s.display();
    
    }
}
