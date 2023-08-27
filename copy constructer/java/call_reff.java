import java.util.*;

public class call_reff
{
    private int real,img;

    Scanner sc= new Scanner(System.in);

    public void getdata()
    {
        System.out.println("Enter the real: ");
        real=sc.nextInt();
        System.out.println("Enter the img: ");
        img=sc.nextInt();
    }

    public void display()
    {
        System.out.println(real+"+"+img+"i");
    }

    // public void modify(call_reff x)
    // {
    //     x.real=10;
    //     x.img=11;
    // }

    // default constructer

    public call_reff(int x,int y)
    {
        real=x;
        img=y;
    }

    // parametrized constructer
    public call_reff(call_reff x)
    {
        real=x.real;
        img=x.img;
    }

    


}