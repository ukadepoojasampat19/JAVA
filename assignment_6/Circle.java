import java.util.*;


public class Circle extends shape {
    
    
   
    public void getdata()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter teh value of x: ");
        x=sc.nextDouble();
    }
    
    
    
    public void coumput_area()
    {
        double area;
        // Here x is a radius.
        area=3.142*x*x;
        System.out.println("Area of circle is:");
        System.out.println(area);
    }
    
}
