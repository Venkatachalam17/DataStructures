package Arrays.Examples;

import java.util.Scanner;

public class Ignore {
     public static void main(String[] args) {
        // list of numbers where you want to skip negative values, but stop completely if you find a zero

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
        System.out.println("Skipped negative value and stopped after 0");
        for(int nums: num)
        {
            if(nums<0)
            {
                continue;
            }
            if(nums==0)
            {
                break;
            }
            System.out.println(nums);
        }
        

    }
}
