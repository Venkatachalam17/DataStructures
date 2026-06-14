package Arrays.Patterns.Sorting;

import java.util.*;

public class Binarysort {
    public static void main(String[] args) {
        
        int[] arr = {6,7,2,8,3,9,1,0};

        int n = arr.length;

        for(int i =0;i<n-1;i++)
        {
            for(int j =0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    
}
