package Arrays.Patterns.TwoPointer;

import java.util.*; // Arrays funciton

public class reverse {
    
    public static void main(String[] args) {
        
    
    int[] arr = {1,2,3,4,5,6,7};

    int start =0; // left pointer
    int end = arr.length-1; //right pointer

    while(start<end){

        int temp = arr[start];
        arr[start] = arr[end];
       arr[end] = temp;
       
       start ++;
       end --;
    }

    System.out.println(Arrays.toString(arr));

    }

}
