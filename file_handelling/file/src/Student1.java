import java.util.Scanner;

public class Student1 {

    private String Name,ID,Address,Std;
    private int Roll_no,Marks;

    Scanner sc=new Scanner(System.in);

    public Student1()
    {
        System.out.println("Enter your name: ");
        Name=sc.nextLine();
        System.out.println("Enter your Address: ");
        Address=sc.nextLine();
        System.out.println("Enter your Id: ");
        ID=sc.next();
        System.out.println("Enter your roll_no: ");
        Roll_no=sc.nextInt();
        System.out.println("Enter your marks: ");
        Marks=sc.nextInt();
        
    }

    public void display()
    {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Name is: "+ Name);
        System.out.println("Address is: "+Address);
        System.out.println("ID is:"+ID);
        System.out.println("roll_no is:"+Roll_no);
        System.out.println("marks is:"+ Marks);
       
    }

    public void setName(String Name)
    {
        this.Name=Name;
    }
    public void setAddress(String Address)
    {
        this.Address=Address;
    }
    public void setRoll_no(int Roll_no)
    {
        this.Roll_no=Roll_no;
    }
    public void setMarks(int Marks)
    {
        this.Marks=Marks;
    }
    public String getID()
    {
        return ID;
    }

    
}
