import java.util.*;
public class number1 {
    
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int x,y;
            System.out.println("Enter the first number: ");
            x=sc.nextInt();
            System.out.println("Enter the second number: ");
            y=sc.nextInt();
            
            number num=new number(x,y);
            num.calculation();
            num.display();
            System.out.println("copy constructer");
            number num1=new number(7,8);
            num1.modify(num);
            num1.calculation();
            num1.display();
            
        }
    }
   

