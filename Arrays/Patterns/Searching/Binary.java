package Arrays.Patterns.Searching;

public class Binary {
    
    public static void main(String[] args) {
        
        int[] arr = {12,34,56,77,88,96};
        int target = 88;

        int left =0;
        int right = arr.length-1;

        int index =-1;

        while(left<=right)
        {
            int mid = left +(right - left)/2;

            if(arr[mid] == target)
            {
                index = mid;
                break;
            }
            else if(arr[mid]> target)
            {
                right = mid -1;
            }
            else if(arr[mid]<target)
            {
                left = mid +1;
            }

        }

        System.out.println(index);
    }
}
