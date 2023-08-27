import java.util.*;

public class employee_database
{
    public static void main(String[] args)
    {
       
       Scanner sc=new Scanner(System.in);
       String name,address;
       int age;
    
        System.out.println("Name: ");
        name=sc.next();
        System.out.println("Age: ");
        age=sc.nextInt();
        System.out.println("Age: ");
        address=sc.next();

        
        employee e=new employee(name,age,address); 
        // e.getdata(name,age);
        // e.accept();
        e.display();
        e.output();
    }
}