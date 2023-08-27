import java.util.*;

public class person
{
    private String name;
    private int age;
    private String address;
    
    Scanner sc=new Scanner(System.in);
    public void getdata()
    {
        System.out.println("Enter the name=");
        name=sc.next();
        System.out.println("Enter the age=");
        age=sc.nextInt();
        System.out.println("Enter theaddress=");
        address=sc.next();

    }

    public void display()
    {
        
        System.out.println("Name= "+name);
        System.out.println("age= "+age);
        System.out.println("Address= "+address);
        
    }
}

