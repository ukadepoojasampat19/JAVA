// creat a class basic demo.creat a class base display messsage.used derived class and display the message.


class base
{
    public void display()
    {
        System.out.println("I am in base class.");
    }
}

class derived extends base
{
    public void display()
    {
        // super.display();
        System.out.println("I am in the derived class.");
        super.display();
        

    }
}







class basic_demo
{
    public static void  main(String[] args)
    {
        derived d=new derived();
        d.display();
       
    }
}

// 1)create a class base class ,derived class
// 2)call the methode.
// 3)used the super methode.(while calling a  method we can used the super keyword on any line. )
// 4)if the display methode is not present in the deriveed class then ?then the display methode of another class will call.
// 5)in methode overrifing singnauture is same.