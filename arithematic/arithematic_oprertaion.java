import java.util.Scanner;

public class arithematic_opreation
{
    private int num_1,num_2,num_3;

    public getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num_1=sc.nextInt();
        System.out.println("Enter the Second number: ");
        num_2=sc.nextInt();
    }

    public division()
    {
        try
        {
            num_3=num_1/num_2;
            System.out.println(num_3);
        }
        // catch is always parametrized.
        // catch(ArithematicExeception e)
        // {
        //     System.out.println("Exepetion is handel.")
        //     e.printStacktrace;
        // }
        // catch(NullPointerExeception e)
        // {
        //     System.out.println("Null Pointer Exeception got")
        //     e.printStacktrace;
        // }
        // catch(NumberFormatExeception e)
        // {
        //     System.out.println("Number Format Exeception is got.")
        //     e.printStacktrace;
        // }
        // System.out.println("Done")
        // change the sequence .
        catch(NullPointerExeception e)
        {
            System.out.println("Exepetion is handel.")
            e.printStacktrace;
        }
        catch(ArithematicExeception e)
        {
            System.out.println("Null Pointer Exeception got")
            e.printStacktrace;
        }
        catch(NumberFormatExeception e)
        {
            System.out.println("Number Format Exeception is got.")
            e.printStacktrace;
        }
        System.out.println("Done")
       
    }
    // important question can be asked.

    // public display()
    // {
    //     System.out.println(num_3);
    // }
}

// when output is 10 and 5 output is 2.
// when output is 10 and 0 the message in the catch box is printed.
// array list used for dynamic  
// theory exams.
// 1)write a code in java which will handel in exeption handelling.
// 2)def,how will you handel in oop or java.
// 3)write a short note on multiple catch. 
// 4)mandotary to write the output.