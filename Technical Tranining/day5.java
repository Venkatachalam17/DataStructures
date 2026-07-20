import java.util.*;

public class day5 {

    public static int[] merge(int[] nums1,int[] nums2, int m, int n)
    {

        int index =0;
        for(int i =m;i<m+n;i++)
        {
            nums1[i] = nums2[index];
            index++;
        }
        Arrays.sort(nums1);
        return nums1;
    }
    public static void main(String[] args) {
        
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        int m =3;
        int n =3;

        System.out.println(Arrays.toString(merge(nums1,nums2,m,n)));

    }
    
}
