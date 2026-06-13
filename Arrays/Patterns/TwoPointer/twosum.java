package Arrays.Patterns.TwoPointer;


// input = [2,7,11,15]
// target = 9

// output = [0,1]

public class twosum {

    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int target = 9;

        int left =0;
        int right = arr.length-1;

        while(left < right)
        {
            int sum = arr[left]+arr[right];

            if(sum==target)
            {
                System.out.println(left+" "+right);
                break;
            }
            else if(sum<target)
            {
                left ++;
            }
            else 
            {
                right--;
            }
        }
        
    }
    
}
