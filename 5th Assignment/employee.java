
import java.util.*;
public class employee extends student
{
    private String address;
    Scanner sc=new Scanner(System.in);
    // public void accept()
    // {
        
    //     // Scanner sc=new Scanner(System.in);

    //     System.out.println("Address: ");
    //     address=sc.next();

    // }
    
    // parametrized constructer
    
    
    public employee(String name,int age,String addresss)
    {
        super(name,age);
        this.address=address;

    }

    //  public employee()
    // {
    //     Scanner sc=new Scanner(System.in);

    //     System.out.println("Address: ");
    //     address=sc.next();

    // }

    public void output()
    {
        System.out.prin tln("address+"+address);
    }


    
}
