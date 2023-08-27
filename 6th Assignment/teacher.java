
import java.util.*;
public  class teacher extends person
{
    
    private String  employee_id;
    private String pan_card;
    private int basic_pay;
    private double gross_salary;
    private double net_salary;

    Scanner sc=new Scanner(System.in);

    public void accept()
    {
        System.out.println("employee_id:");
        employee_id=sc.next();
        System.out.println("pan_card:");
        pan_card=sc.next();
        System.out.println("basic_pay:");
        basic_pay=sc.nextInt();

    }

    public void calculate_salary()
    {
        gross_salary=basic_pay + 0.9 *basic_pay +3*basic_pay;
        net_salary= gross_salary -200 - 0.1*gross_salary;
    }

    public void output()
    {
        System.out.println("employee_id=+"+employee_id);
        System.out.println("pan_card=+"+pan_card);
        System.out.println("gross_salary="+gross_salary);
        System.out.println("net_salary="+net_salary);

    }




}
// instead of decalring variables as a instance variables and decalring as alocal to particular function is there any effect on memory managenment:
