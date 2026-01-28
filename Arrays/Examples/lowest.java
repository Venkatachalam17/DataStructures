package Arrays.Examples;

import java.util.Scanner;

public class lowest {
    public static void main(String[] args) {
        // find the lowest number amoung the array

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

        int least = num[0];

        for(int nums: num)
        {
            if(nums<least)
            {
                least = nums;
            }
        }
        System.out.print("The least value is :"+least);
    }
    
}
