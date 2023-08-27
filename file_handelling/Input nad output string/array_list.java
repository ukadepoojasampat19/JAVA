import java.util.ArrayList;


public class array_list {

    public static void main(String[] args)
    {   
        ArrayList<String> language=new ArrayList<>();

        // add() methode is used to store element in the arrylist.

        language.add("java");
        language.add("Python");
        language.add("C++");
        language.add("javascript");

        System.out.println("Arraylist: "+ language);

        // get() is used to get the element in the array if we wnat access indivisual element 
        // from array.

        System.out.println("Arraylist First element is: "+ language.get(0));
        System.out.println("Arraylist First element is: "+ language.get(1));


        // now if i want to change the element of arraylist or replace the element we used set() of arraylist
        // Set methode has two parameter first is index and  second is value that we want to insert.


        language.set(1,"pooja");
        System.out.println("Arraylist: "+ language);
        System.out.println("Arraylist: "+ language.remove(3));
        System.out.println("Arraylist: "+ language);
    
    }
    
}
