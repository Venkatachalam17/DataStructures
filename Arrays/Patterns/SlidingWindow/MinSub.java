package Arrays.Patterns.SlidingWindow;

public class MinSub {

    public static void main(String[] args) {
        
        int[] arr = {2,1,5,1,3,2};
        int k =3;

        int windowsize=0;

        for(int i =0;i<k;i++)
        {
            windowsize+=arr[i];
        }
        int minSum = windowsize;

        for(int i=k;i<arr.length;i++)
        {
            windowsize = windowsize-arr[i-k]+ arr[i];

            minSum = Math.min(minSum, windowsize);
        }

        System.out.println(minSum);
    }
    
}
