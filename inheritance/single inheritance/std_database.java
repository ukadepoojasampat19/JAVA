import java.util.*;

public class std_database
{
    public static void main(String[] args)
    {
       int roll_no,marks;
       String name;
       float sgpa;

      Scanner sc=new Scanner(System.in);
      // System.out.println("Enter the roll_no:");
      // roll_no=sc.nextInt();
      // System.out.println("Enter the marks:");
      // marks=sc.nextInt();
      // System.out.println("Enter the name:");
      // name=sc.next();
       System.out.println("Enter sgpa: ");
       sgpa=sc.nextFloat();
      


      
      
      std_name s=new std_name(sgpa);
       
    //    s.display();
      //  s.accept();
      s.display(); 
      s.output();

    }

}
