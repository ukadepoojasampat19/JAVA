public class complex_1 {
    public static void main(String[] args)
    {
        // complex c1=new complex();
        // complex c2=new complex(3,4);
        // c1.display();
        // c2.display();
        // complex c3=new complex(c1);
        // // int x=10;
        // // int y=x;
        // // also called as deep copy.
        // c3.display();

        // to check the call by refrence or not.
        // downside.

        complex c1=new complex(1,2);
        c1.display();
        complex c2=new complex(3,4);
        c2.display();

        c1.modify(c2);
        c2.display();
    }
}

// array of pointer need to study.