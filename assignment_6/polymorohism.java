import java.util.*;
public class polymorohism {
    public static void  main(String[] args)
    {
        int store;
        Scanner sc=new Scanner(System.in);
    
        // Circle c=new Circle();
        // c.getdata();
        // c.coumput_area();

        // triangle t=new triangle();
        // t.getdata();
        // t.coumput_area();

        // creat a ref object to create 
           shape ref;
        // ref=new Circle();
        // ref.getdata();
        // ref.coumput_area();

        // ref=new triangle();
        // ref.getdata();
        // ref.coumput_area();

        // // shape obj=new shape();
        // // once your class is abstract we cannot create the object of class.

        // ref=new rectangle();
        // ref.getdata();
        // ref.coumput_area();
    

        // used of switch case:
            do{
            System.out.println("1. to calculate the area of circle.");
            System.out.println("2. to calculate the area of triangle.");
            System.out.println("3. to calculate the area of rectangle.");
            System.out.println(" enter 0. to  exite from the loop.");
            store=sc.nextInt();

            
            switch (store) 
            { 
                
                case 1:{
                   ref=new Circle();
                    
                   ref.getdata();
                   ref.coumput_area();
                   break;
                }
                case 2:{
                    ref=new triangle();
                    
                    ref.getdata();
                    ref.coumput_area();
                    break;
    
                }
                case 3:{
                    ref=new rectangle();
                    
                    ref.getdata();
                    ref.coumput_area();
                    break;
    
                }
            
            
           }
        }while(store !=0);
        

        
    }

     
    }
            
        
            
        

// runtime time poly when we cretae the ref variable of base class.

// which will be pointing the objects of derived class.
 
