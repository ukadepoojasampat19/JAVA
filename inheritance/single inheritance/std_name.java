import java.util.*;

public class std_name extends student
{
    Scanner sc=new Scanner(System.in);
    float sgpa;
     
    // method taking a input
    // public void accept()
    // {
    //     System.out.println("Enter the sgpa: ");
    //     sgpa=sc.nextFloat();
    // }

    // parametrized constructor.

    // public std_name(int roll_no,int marks,String name)
    // {
    //     super();
    //     System.out.println("Enter the sgpa: ");
    //     sgpa=sc.nextFloat();
    // }

    // parametrized constructor for inherit class.

    public std_name(float sgpa)
    {
        // used to call the constructor of base class.
        super();
        this.sgpa=sgpa;
        
    }

    public void output()
    {
        System.out.println(sgpa);
    }

    
}
