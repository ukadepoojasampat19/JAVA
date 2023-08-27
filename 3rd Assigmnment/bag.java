import java.util.function.IntBinaryOperator;

public class bag
{
    private  String colour;
    private double weight;
    private static int total_object;
    private static double total_weight;

    // use of default constructor:
    // no any parameter values are already define:
    public bag()
    {
        colour="red";
        weight=30;
        
        total_weight=total_weight + weight;
        total_object =total_object + 1;

        
        
        

    }

    // colour default and weight parametrize:

    public bag(double weight)
    {
        this.colour="blue";
        this.weight=weight;
        
        total_weight=total_weight + weight;
        total_object =total_object + 1;
        
    }
 
    // weight default and colour parameter:
    public bag(String colour)
    {
        this.colour=colour;
        this.weight=20;
        
        total_weight=total_weight + weight;
        total_object =total_object + 1;
   }

// colour and weight both passed  as aparameter:
    public bag(String colour,double weight)
    {
        this.colour=colour;
        this.weight=weight;
        
        total_weight=total_weight + weight;
        total_object =total_object + 1;

        
    }

    public void display()
    {
        System.out.println("colour="+ colour+"  weight="+weight);
    }

    public static int return_object()
    {
        
        return total_object + 1;
    }
    public static void output()
    {
        System.out.println("the total number of objects are:"+total_object);
        System.out.println("the total weight is :"+total_weight);
    }
    
    
    public static double total_wg()
    {
        return total_weight;
    }



    public void delete_obj()
    {
        total_object=total_object - 1;
        total_weight=total_weight -  weight;
    }
}   