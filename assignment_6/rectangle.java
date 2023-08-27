
import java.util.*;
public class rectangle extends shape{


    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter teh value of x: ");
        x=sc.nextDouble();
        System.out.println("Enter teh value of y: ");
        y=sc.nextDouble();

     }
    public void coumput_area()
    {
        
        double area;
        // Here x is a length.
        // Here y is breadth.
        area= x * y;
        System.out.println("Area of rectangle is:");
        System.out.println(area);
    }

    
}
