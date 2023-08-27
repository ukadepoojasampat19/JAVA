//  copy constructer in java 

public class pratice
{
    private int x,y;

    // used of de fault constructer.
    
    public pratice()
    {
         x=10;
         y=20;
    }
     
    // used of parametrized constructor
    
    public pratice(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    // used of copy constructor;

    public void modify(pratice m)
    {
        this.x=m.x;
        this.y=m.y;
    }
     
    public void display()
    {
        System.out.println("x="+x+"and"+"y="+y);
    }
}