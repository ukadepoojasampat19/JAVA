import java.util.*;

public class database
{
    public static void main(String[] args)
    {
        String name;
        int roll_no;
        float sgpa;
        
        Scanner sc=new Scanner(System.in);

        // taking input.
        
        // /extFloat();

        // creating a parametrized constructor.
        // now i am store only info of one student .
        // but i want to store the info of 10 atudents.
        // for that purpose we have to used the concept array of objects.
        // student s=new student(name,roll_no,sgpa);
        // s.display();

        student[] s=new student[10];
        // in the above line array of reference is created which will point the particular object.
        for(int i=0;i<10; i++)
        {
            System.out.println("Enter your name: ");
            name=sc.next();
            System.out.println("Enter your roll_no: ");
            roll_no=sc.nextInt();
            System.out.println("Enter your sgpa: ");
            sgpa=sc.nextFloat();
            s[i]=new student(name,roll_no,sgpa);  
        }
        for(int i=0;i<10; i++)
        {
            s[i].display();
            System.out.println("\n");
        }
    }
    
}