
import java.util.*;
// adhi public hota mag anater abstract kele.
// karen method la apan abstract kele hote.
abstract class shape {
    protected double x,y;

    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter teh value of x: ");
        x=sc.nextDouble();
        System.out.println("Enter teh value of y: ");
         y=sc.nextDouble();

     }
    // public void coumput_area()
    // {
    //     System.out.println("I am in sahape class.");
    // }

    abstract public void coumput_area();
}

// base class is called interphase here.
 

