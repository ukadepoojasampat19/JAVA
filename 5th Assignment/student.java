import java.util.*;
public class student
{
    private String name;
    private int age;
    Scanner sc=new Scanner(System.in);

    // parametrized constructore.

    public student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    
    
    
    // public void getdata(String name,int age)
    // {
    //    this.name=name;
    //    this.age=age;
    // }
     
    // default constructore:
    // public student()
    // {
    //     // System.out.println("Name: ");
    //     // name=sc.next();
    //     // System.out.println("Age: ");
    //     // age=sc.nextInt();

    // }

    // // public student()
    // // {
    // //     System.out.println("Name: ");
    // //     name=sc.next();
    // //     System.out.println("Age: ");
    // //     age=sc.nextInt();

    // }
      
    public void display()
    {
        // getdata();
        System.out.println("name+"+name);
        System.out.println("age+"+age);

        
    }

}
// public declared kiya tya mule apan tyal acces karu shaklo;
// private kelay avr apna tyla access nahi karu shkat;
// we have call a getdata method in same class so no need of object creation.
// 3 cases astil frst getdata ani accept as a accepter astil ,
// very important topic.
// now i dont want accept the data in constructor.
// accept the value /input in the main method;
// aata last step la 
// why the daefault constructor are call first?
// default constructor of of derived class execute first:
// derived class ke deafult constructor ke andar firts line should be first

