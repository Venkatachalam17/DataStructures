package Arrays.Examples;
import java.util.*;

public class avg {
    public static void main (String[] args)
    {
        // calculate the average of the sum of an array

        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of the Array: ");
        size = sc.nextInt();

        int[] num = new int[size];
        System.out.println("Enter " + size + " Numbers :");
        for(int i =0; i<size;i++)
        {    
            
            num[i] = sc.nextInt();
        }


        int sum =0;
        for(int nums : num)
        {
            sum+=nums;
        }
        System.out.println("The sum of the values are : " + sum);

        float avg =(float) sum/size;
        System.out.println("The average of the Sum "+ sum+" is "+ avg);




    }
    
}
