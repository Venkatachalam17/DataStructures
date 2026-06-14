package Arrays.Patterns.Sorting;

// SELECTION SORT

// IDEA:
// Find the smallest element
// Place it in the correct position
// Repeat for remaining array


// DRY RUN:
// 5 3 8 4 2
// Min = 2
// 2 3 8 4 5

// 2 3 8 4 5
// Min = 3
// 2 3 8 4 5

// 2 3 8 4 5
// Min = 4
// 2 3 4 8 5

// 2 3 4 8 5
// Min = 5
// 2 3 4 5 8

// KEY POINT:
// After every pass,
// the smallest element of the unsorted part
// is placed in its correct position.

// TIME COMPLEXITY:
// Best  : O(n²)
// Average: O(n²)
// Worst : O(n²)

// SPACE COMPLEXITY:
// O(1)


import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        
        int[] arr = {54,6,7,98,0,3,5,83,2,8};

        int n = arr.length;

        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j = i+1 ;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i]= arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
