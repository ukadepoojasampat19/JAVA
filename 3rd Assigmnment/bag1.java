import java.util.*;


public class bag1 
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        bag b[]=new bag[10];
        
        String colour;
        double weight;
        int n,ch,ch1,no;
        


        do
        {
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("3.delete");

            System.out.println("choice: ");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1: 
                        do
                        {
                            System.out.println("1.default constructor.");
                            System.out.println("2.colour default colour and weight input.");
                            System.out.println("3.weight  default and colour input.");
                            System.out.println("4.parametrized constructor.");

                            System.out.println("choice: ");
                            ch1=sc.nextInt();

                            switch(ch1)
                            {
                                case 1: 

                                       n=bag.return_object();
                                       b[n]=new bag();
                                       break;

                                case 2: 

                                      System.out.println("enter Weight");
                                      weight=sc.nextDouble();

                                      n=bag.return_object();
                                      b[n]=new bag(weight);
                                      break;

                                case 3:

                                     System.out.println("enter clour:");
                                     colour=sc.next();
                                        
                                     n=bag.return_object();
                                     b[n]=new bag(colour);
                                     break;

                                case 4: 

                                     System.out.println("enter colour:");
                                     colour=sc.next();
                                     System.out.println("enter Weight:");
                                     weight=sc.nextDouble();
                                    
                                     n=bag.return_object();
                                     b[n]=new bag(colour,weight);
                                     break;

                                default: 

                                      System.out.println("No other constructor.");
                                      break;
                            }
                        
                            }while(ch1 ==4);
                            break;

                case 2:               

                        do
                        {
                        n=bag.return_object();
                        for(int i=0; i<n; i++)
                        {
                            b[i].display();
                        }
                        bag.output();

                        }while(ch !=4);
                        break;


                case 3:

                        System.out.println("Enter the which no of object you want to delete: ");
                        no=sc.nextInt();
                        b[no -1].delete_obj();
                        for( int i=(no-1); i<3; i++)
                        {
                            b[i]=b[i+1];

                        }
                        break;




                    }



                        


    
        }while(ch !=4);      
        
    }

}
        

        
        
    