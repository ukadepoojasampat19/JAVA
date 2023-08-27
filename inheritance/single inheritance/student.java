// single inheritance
// one parent one child
import java.util.*;
public class student
{
    private int roll_no,marks;
    private String name;

    Scanner sc=new Scanner(System.in);
// input methode.
    // public  void getdata()
    // {
    //     System.out.println("Enter the roll number:\n");
    //     roll_no=sc.nextInt();
    //     System.out.println("Enter the marks:\n");
    //     marks=sc.nextInt();
    //     System.out.println("Enter the roll number:\n");
    //     roll_no=sc.nextInt();
    //     System.out.println("Enter the name:\n");
    //     name=sc.next();

    


    // }
    // used of default constructor;
    public  student()
    {
        System.out.print("Enter the roll number:\n");
        roll_no=sc.nextInt();
        System.out.print("Enter the marks:\n");
        marks=sc.nextInt();
    
        System.out.print("Enter the name:\n");
        name=sc.next();

    }

    // parametrized constructor.

    // public  student(int roll_no,int marks,String name)
    // {
    //     this.roll_no=roll_no;
    //     this.marks=marks;   
    //     this.name=name;      
    // }



    public void display()
    {
        
        System.out.println(roll_no +" "+name+"  "+marks);
    }
}