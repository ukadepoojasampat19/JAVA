import java.util.*;

public class prac_main {
    

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        // pra_1 obj1=new pra_1();
        // obj1.getdata();
        // System.out.println("complex number of first object\n");
        // obj1.display();

        // pra_1 obj2=new pra_1();
        // obj2.getdata();
        // System.out.println("complex number of second object\n");
        // obj2.display();

        // // now i have to add the instance variables of two objects for that purpose i have to pas the object as parameters.
        // // create the third object 

        // pra_1 obj3=new pra_1();
        // System.out.println("After adding the instances of to objects\n");
        // obj3.addition(obj1,obj2);
        // obj3.display();

        // 2)default constructer.
        
        // pra_1 obj1=new pra_1();
        // obj1.display();

        // pra_1 obj2=new pra_1();
        // obj2.display();

    //     pra_1 obj3=new pra_1();
    //     obj3.addition(obj1,obj2);
    //     obj3.display();
    // }

    // 3)parametrized constructer

       float real,img;
       System.out.println("Enter the real number: ");
       real=sc.nextFloat();
       System.out.println("Enter the img number: ");
       img=sc.nextFloat();
        
        pra_1 obj1=new pra_1(real,img);
        obj1.display();

        System.out.println("Enter the real number: ");
        real=sc.nextFloat();
        System.out.println("Enter the img number: ");
        img=sc.nextFloat();
        

        pra_1 obj2=new pra_1(real,img);
        obj2.display();

        pra_1 obj3=new pra_1(0,0);
        obj3.addition(obj1,obj2);
        obj3.display();
    
}
}
