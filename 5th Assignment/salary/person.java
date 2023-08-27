public class person {

    protected String name;
    protected int age;
    protected String dob;
    protected String employee_id;
    protected  String pan_card;
    protected long mob_no;
    protected String email_id;


    public void getdata()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        name=sc.next();
        System.out.println("Enter your age: ");
        age=sc.nextInt();
        System.out.println("Enter your date of birth: ");
        dob=sc.next();
        System.out.println("Enter your name: ");
        employee_id=sc.next();
        System.out.println("Enter your pan_card: ");
        pan_card=sc.next();
        System.out.println("Enter your mobile number: ");
        mob_no=sc.nextLong();
        System.out.println("Enter your email_id: ");
        email_id=sc.next();
        

    
        

    }

    public void display()
    {
        System.out.print("name: ");
        System.out.println(name);
        System.out.print("age: ");
        System.out.println(age);
        System.out.print("date of birth: ");
        System.out.println(dob);
        System.out.print("employee_id: ");
        System.out.println(employee_id);
        System.out.print("pan card number: ");
        System.out.println(pan_card);
        System.out.print("mobile number: ");
        System.out.println(mob_no);
        System.out.print("email id: ");
        System.out.println(email_id);
        
    }

}
