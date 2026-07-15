import java.util.*;
public class day2
{
    public static void main(String[] args) {
        
        //Create a Dynamic Array
        ArrayList<Integer> list = new ArrayList<>();
       
        //Add Elements to the array
        list.add(10);
        list.add(20);
        list.add(25);

        //Insert Element at a specific index
        list.add(3,15);
        list.add(4,45);

        //Access any one element from the array
        System.out.println("Displaying values");
        for(int i =0;i<list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Update an element
        list.set(3,35);
        list.set(4,50);

        System.out.println("Displaying values after updating");
        for(int i =0;i<list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        }

        //remove element 
        list.remove(2);  //remove index
        list.remove(Integer.valueOf(50)); //remove value (Directly)
        
        System.out.println();
         System.out.println("Displaying values after Removing");
        for(int i =0;i<list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.println("Size of the Array : " + list.size());
    }
}