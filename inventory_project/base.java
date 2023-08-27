import java.io.Serializable;
import java.util.*;

public class base implements Serializable{
    protected String author;
    protected String bookname;
    private String publisher;
    protected int cost;
    protected int qty;

    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);


    public base(String author,String bookname,String publisher,int cost,int qty){
        this.author=author;
        this.bookname=bookname;
        this.publisher=publisher;
        this.cost=cost;
        this.qty=qty;
    }

    public base(){
        author=null;
        bookname=null;
        publisher=null;
        cost=0;
        qty=0;
    }



    public void getdata(){
        System.out.println("AUTHOR:");
        author=sc1.nextLine();
        System.out.println("BOOKNAME:");
        bookname=sc1.nextLine();
        System.out.println("PUBLISHER:");
        publisher=sc1.nextLine();
        System.out.println("COST PER BOOK:");
        cost=sc2.nextInt();
        System.out.println("QUANTITY:");
        qty=sc2.nextInt();
    }

     public void display(){
        System.out.println("AUTHOR:"+author);
        System.out.println("BOOKNAME:"+bookname);
        System.out.println("PUBLISHER:"+publisher);
        System.out.println("COST PER BOOK:"+cost);
        System.out.println("QUANTITY:"+qty);
    }
               
}