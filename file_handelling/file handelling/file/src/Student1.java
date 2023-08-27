import java.io.Serializable;
import java.util.Scanner;

public class Student1 implements Serializable{

    private String Name,ID,Address;
    private int Roll_no,Marks,Std;
   

    static Scanner sc=new Scanner(System.in);

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
        System.out.println("Enter your Std: ");
        Std=sc.nextInt();
        
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
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setStd(int Std) {
        this.Std = Std;
    }


    public String toString()
    {
        return "name: " +Name+ "\nAddress: " +Address+ "\nRoll_no: " +Roll_no+ "\nMarks: " +Marks+ "\nID: "+ID;
    }

    
}
