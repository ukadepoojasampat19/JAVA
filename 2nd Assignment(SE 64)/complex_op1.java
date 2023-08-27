import java.util.*;
public class complex_op1
{
    public static void main(String[] args)
    {
        int real,img;
        char ar_op;
        
        Scanner sc = new Scanner(System.in);
        
    

        System.out.println("Following are the arithmetic opreation perform on complex number:\n");
        System.out.println("+ ,- , *, d (division)");
        System.out.println("Choose the opreator you want :");
        System.out.println("enter the arethmetic opreator to which you want to perform on complex number:\n");
        ar_op=sc.next().charAt(0);


        switch(ar_op)
        {
      
            case '+' :
            { 
                System.out.println("Enter the real:");
                real=sc.nextInt();
                System.out.println("Enter the img:");
                img=sc.nextInt();
                System.out.println("Real and imginary value of c1 object is:");
                System.out.println("real="+real);
                System.out.println("img="+img);
    
                complex2 c1 =new complex2(real,img);
                
                System.out.println("Enter the real:") ;
                real=sc.nextInt();
                System.out.println("Enter the img:");
                img=sc.nextInt();
                System.out.println("Real and imginary value of c2 object is:");
                System.out.println("real="+real);
                System.out.println("img="+img);
    
                complex2 c2 =new complex2(real,img);
    
                complex2 c3=new complex2(0,0);
                c3.add(c1,c2);
                c3.display();
                break;
            }
    
            case  '-':
            {
                System.out.println("Enter the real:");
                real=sc.nextInt();
                System.out.println("Enter the img:");
                img=sc.nextInt();
                System.out.println("Real and imginary value of c1 object is:");
                System.out.println("real="+real);
                System.out.println("img="+img);

                complex2 c1 =new complex2(real,img);

                System.out.println("Enter the real:");
                real=sc.nextInt();
                System.out.println("Enter the img:");
                img=sc.nextInt();
                System.out.println("Real and imginary value of c2 object is:");
                System.out.println("real="+real);
                System.out.println("img="+img);

                complex2 c2 =new complex2(real,img);

                complex2 c3=new complex2(0,0);
                c3.sub(c1,c2);
                c3.display();
                break;
                }
    case '*':
    {
              System.out.println("Enter the real:");
              real=sc.nextInt();
              System.out.println("Enter the img:");
              img=sc.nextInt();
              System.out.println("Real and imginary value of c1 object is:");
              System.out.println("real="+real);
              System.out.println("img="+img);

              complex2 c1 =new complex2(real,img);

              System.out.println("Enter the real:");
              real=sc.nextInt();
              System.out.println("Enter the img:");
              img=sc.nextInt();
              System.out.println("Real and imginary value of c2 object is:");
              System.out.println("real="+real);
              System.out.println("img="+img);

              complex2 c2 =new complex2(real,img);

              complex2 c3=new complex2(0,0);
              c3.mul(c1,c2);
              c3.display();
              break;
    }

    case 'd':
    {
            System.out.println("Enter the real:");
            real=sc.nextInt();
            System.out.println("Enter the img:");
            img=sc.nextInt();
            System.out.println("Real and imginary value of c1 object is:");
            System.out.println("real="+real);
            System.out.println("img="+img);

            complex2 c1 =new complex2(real,img);

            System.out.println("Enter the real:");
            real=sc.nextInt();
            System.out.println("Enter the img:");
            img=sc.nextInt();
            System.out.println("Real and imginary value of c2 object is:");
            System.out.println("real="+real);
            System.out.println("img="+img);

            complex2 c2 =new complex2(real,img);

            complex2 c3=new complex2(0,0);
            c3.div(c1,c2);

            c3.display();
            break;
    }

    default: 
    {
            System.out.println("choose the correct opreator:");
            break;
    }

    
    
    }    

}

}


