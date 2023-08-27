import java.util.*;


public class pra_1 {

    Scanner sc=new Scanner(System.in);

    private float real,img;

    // used of getdata methode.
//     public void getdata()
//     {
//         System.out.println("Enter the real number: ");
//         real=sc.nextFloat();
//         System.out.println("Enter the img number: ");
//         img=sc.nextFloat();
       
//     }

//    public void addition(pra_1 obj1,pra_1 obj2)
//    {
//       real=obj1.real + obj2.real;
//       img=obj1.img + obj2.img;
//    }
//     public void display()
//     {
//         System.out.println(real+"+"+img+"i");
//     }

// 2) default constructer.
 
//     public pra_1()
//     {
//         System.out.println("Enter the real number: ");
//         real=sc.nextFloat();
//         System.out.println("Enter the img number: ");
//         img=sc.nextFloat();
//     }
    

    // public void addition(pra_1 obj1,pra_1 obj2)
    // {
    //    real=obj1.real + obj2.real;
    //    img=obj1.img + obj2.img;
    // }


//    public void display()
//     {
//          System.out.println(real+"+"+img+"i");
//     }


// 3)parametrized constructer.

   pra_1(float real,float img)
   {
     this.real=real;
     this.img=img;
   }

    public void addition(pra_1 obj1,pra_1 obj2)
    {
       real=obj1.real + obj2.real;
       img=obj1.img + obj2.img;
    }

    public void display()
    {
         System.out.println(real+"+"+img+"i");
    }



}
