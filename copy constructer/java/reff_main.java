// Example of call by reference in java

public class reff_main {
    
    public static void main(String[] args)
    {
        // call_reff r=new call_reff();
        // call_reff r1=new call_reff();

        // r.getdata();
        // r.display();

        // r1.modify(r);
        // r.display();

        // used of copy constructer in java.


        call_reff r=new call_reff(0,0);
        r.getdata();
        r.display();
        call_reff r1=new call_reff(r);
        r1.display();

    }

}