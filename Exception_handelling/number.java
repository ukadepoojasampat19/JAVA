import java.util.*;
class number
{
    Scanner sc=new Scanner(System.in);
    private int a,b,sum;
    public number(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void calculation()
    {
        sum=a+b;
    }
    public void display()
    {
        System.out.println("Sum is ="+sum);
    }
    public void modify(number num)
    {
        this.a=num.a;
        this.b=num.b;
    }
}