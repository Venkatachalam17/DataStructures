package Arrays.Patterns.SlidingWindow;


// SLIDING WINDOW

// IDEA:
// Reuse previous window result
// Remove left element
// Add right element

// DRY RUN:
// [2,1,5] = 8
// [1,5,1] = 7
// [5,1,3] = 9
// [1,3,2] = 6

// MAX = 9

// TIME:
// O(n)

// SPACE:
// O(1)



public class MaxSub {
    public static void main(String[] args) {
        
        int[] arr = {2,1,5,1,3,2};
        int k =3;
        
        int windowsize =0;
        //First Window
        for(int i =0;i<k;i++)
        {
            windowsize+=arr[i];
        }
        int maxSum = windowsize;

        for(int i =k;i<arr.length;i++)
        {
            windowsize = windowsize- arr[i-k]+arr[i];

            maxSum = Math.max(maxSum, windowsize);
        }

        System.out.println(maxSum);
        
    }
    
}
