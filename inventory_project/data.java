import java.util.ArrayList;
import java.nio.file.Files;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

public class data {

    
    
    public static void receipt(ArrayList<base> arr,String book,String authorname,int count,int amount)
    {
        for(int i=0;i<count;i++){
            base b = arr.get(i);
            if(authorname.equals(b.author) &&  book.equals(b.bookname) )
            {
                SimpleDateFormat formatter =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();

                System.out.println("-----------------------SHOPE NAME---------------------------------");
                System.out.println("                   Address: Hinjewadi phase3                      ");
                System.out.println("                     Tel-Phone: 1234567891                        ");
                System.out.println("                     Time: "+formatter.format(date));
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("                      CASH RECEIPT                                ");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                
               
                System.out.println("Author Name: "+authorname);
                System.out.println("Book Name: "+book);
                 double SGST= b.cost * 0.09;
                 double CGST= b.cost * 0.09;

                 double final_cost = SGST + CGST;

                 System.out.println("SGST:9%");
                 System.out.println("SGST on cost: "+SGST);
                 System.out.println("CGST:9%");
                 System.out.println("CGST on cost:"+CGST);

                 System.out.println("Total cost of one book: "+final_cost);
                 System.out.println("Total cost of "+amount+" books: "+final_cost*amount);
                 System.out.println("------------------------------------------------------");

            }

        }
    }
    public static void main(String[] args) {

    String book,authorname;
    int count=0;
    int amount=0,choice;

    ArrayList<base> arr = new ArrayList<base>();

    base b1 = new base ("Sudha Murthy","Wise and Otherwise","Hope Publications",450,10);
    arr.add(b1);
    count++;

    base b2 = new base ("J.K.ROWLING","Harry Potter","Golden Goblet",2000,20);
    arr.add(b2);
    count++;

    base b3 = new base("Leo Tolstoy","Anna Karenina","Penguin Classics",700,23);
    arr.add(b3);
    count++;

    base b4 = new base("Shel Silverstein","Where the Sidewalk Ends","The Edge",980,43);
    arr.add(b4);
    count++;

    base b5 = new base("Stephen King","The Shining","Motion Publications",1320,27);
    arr.add(b5);
    count++;


    // for(int i=0;i<count;i++){
    //     base b = arr.get(i);
    //     b.display();
    //     System.out.println("------------------------------------------------");
    //     System.out.println("\n");
    // }

    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter the book name:");
    // book=sc.nextLine();
    // System.out.println("Enter the author name:");
    // authorname=sc.nextLine();


    // do{
    // System.out.println("Choose the appropriate choice:");
    // System.out.println("1.Search for book details.");
    // System.out.println("2.Place an order.");
    // System.out.println("3.Genearate a receipt.");
    // System.out.println("4.Add a new book.");
    // System.out.println("5.Exit");


    // choice=sc.nextInt();

    // switch(choice){
    //     case 1:{
    //         System.out.println("------------------------------------------------");
    //         for(int i=0;i<count;i++){
    //             base b = arr.get(i);
    //             if(authorname.equals(b.author) && book.equals(b.bookname)){
    //                 System.out.println("Cost of the book is:"+b.cost);
    //                 System.out.println("Quantity of the books available are:"+b.qty);
    //             }
    //         }
    //         System.out.println("------------------------------------------------");
    //         break;
    //     }

    //     case 2:{
    //         System.out.println("Enter the quantity of books required:");
    //         amount=sc.nextInt();

    //         System.out.println("------------------------------------------------");

    //         for(int i=0;i<count;i++){
    //         base b = arr.get(i);
    //         if(authorname.equals(b.author) && book.equals(b.bookname) && amount<=b.qty){
    //         System.out.println("Book is in stock");
    //         System.out.println("Your purchase is successful!");
    //         b.qty=b.qty-amount;
    //     }
    // }
    // System.out.println("------------------------------------------------");
    // break;
    //     }

    //     case 3:
    //     {
    //         System.out.println("Enter the quantity of books you placed an order for:");
    //         amount=sc.nextInt();
    //         receipt(arr,book,authorname,count,amount);
    //         break;
    //     }
    //     case 4:
    //     {
    //         base b = new base();
    //         b.getdata();
    //         arr.add(b);
    //         count++;
    //         for(int i=0;i<count;i++){
    //             base temp = arr.get(i);
    //             temp.display();
    //             System.out.println("------------------------------------------------");
    //             System.out.println("\n");
    //         }
    //         break;
    //     }
    //     case 5:
    //     {
    //         break;
    //     }
        

    // }
    public String toString()
    {
        return  "author:+ "+author +"\n" + "bookname: "+ bookname +"\n" + "publisher:"+ publisher +"\n" + "cost: "+ cost +"\n" + "qty: "+ qty +"\n";
    }

    // }while(choice!=6);

    // try{
    //     FileOutputStream filewrite=new FileOutputStream("F:\\desktop\\collage\\SECOND YEAR\\kalpesh.txt");
    //     ObjectOutputStream fileStream=new ObjectOutputStream(filewrite);
    //     fileStream.writeObject(arr);
    
    // }
    // catch(Exception e)
    // {
    //     e.printStackTrace();
    // }

    try{
         FileInputStream fin=new FileInputStream("F:\\desktop\\collage\\SECOND YEAR\\kalpesh.txt");
         ObjectInputStream obj=new ObjectInputStream(fin);
         ArrayList<base> arr1= (ArrayList<base>) obj.readObject();
         obj.close();
         System.out.println(arr1.toString());
    
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    
}
}




    
