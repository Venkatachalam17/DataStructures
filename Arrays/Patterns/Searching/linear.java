package Arrays.Patterns.Searching;

// LINEAR SEARCH

// Check every element one by one

// Time:
// O(n)

public class linear {
    public static void main(String[] args) {
        
        int[] arr = {40,50,10,30,44,66,67};
        int target = 10;

        int index = -1;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                index = i;
            }
        }
        System.out.println(index);
    }
    
}
