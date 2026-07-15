import java.util.*;

public class day1
{
    public static void main(String[] args)
    {
        //Initialize fixed size array
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Input array values");
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        //Modify an element at a specific index
        arr[3] = 67;

        System.out.println("Displaying Array");
        // print individual elements using a loop.
        for(int i :arr)
        {
            System.out.println(i);
        }

        int memory =(arr.length)*Integer.BYTES;
        System.out.println("Total Memory :" + memory);

        sc.close();
        
    }
}