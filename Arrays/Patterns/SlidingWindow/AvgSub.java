package Arrays.Patterns.SlidingWindow;

// Given:
// [1,2,3,4,5]

// Find the average of every subarray of size 3.

// Output:
// [2.0, 3.0, 4.0]


import java.util.*;

public class AvgSub {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        int k =3;

        float[] n = new float[arr.length-k+1];

        int sum =0;

        for(int i =0;i<k;i++)
        {
            sum+=arr[i];
        }
        float avg = (float)sum/k;
        n[0] = avg;

        for(int i =k;i<arr.length;i++)
        {
             sum = sum -arr[i-k] +arr[i];

             avg = (float) sum/k;

             n[i-k+1] = avg;
        }

        System.out.println(Arrays.toString(n));

        
    }
    
}
