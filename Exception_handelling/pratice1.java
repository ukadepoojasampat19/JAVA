import java.util.*;
public class pratice1 {
    public static void main(String [] args)
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        
        // System.out.println("Enter the value of x:");
        // x=sc.nextInt();
        // System.out.println("Enter the value of y:");
        // y=sc.nextInt();

        pratice p=new pratice();
        pratice p1=new pratice(1,2);
        // p.display();
        // p1.display();

        // now by creating the copy constructer
        // we have pass p1 (reference variablw)
        System.out.println("Value of p  before copy constructer:");
        p.display();

        System.out.println("Value of p  after copy constructer:");
        
        p.modify(p1);
        // p1.display();
        p.display();


    }
    
}
