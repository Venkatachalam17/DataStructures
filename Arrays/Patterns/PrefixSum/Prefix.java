package Arrays.Patterns.PrefixSum;


import java.util.*;
public class Prefix {
    public static void main(String[] args) {
        
        int[] arr = {1,7,4,2,3,5,6,3,2,3,4,5};
        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for(int i =1;i<n;i++)
        {
            prefix[i] = prefix[i-1] +arr[i];
        }

        System.out.println(Arrays.toString(prefix));

        // range is given!!

        int left = 1;
        int right = 5;

        int sum;
        if(left ==0)
        {
            sum =prefix[right];
        }
        else{
            sum = prefix[right] -prefix[left-1];
        }

        System.out.println(sum);
    }
    
}
