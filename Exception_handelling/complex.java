import java.util.*;

public class complex
{
    private int real,img;

    public complex()
    {
        
        real=0;
        img=0;

    }
    public complex(int real,int img)
    {
        this.real=real;
        this.img=img;

    }
    public complex(complex c1)
    {
        real=c1.real;
        img=c1.img;
    }
    public void display()
    {
       System.out.println(real +"+" +img +"i");
    }

    public void modify(complex x)
    {
        x.real=10;
        x.img=20;
    }
}