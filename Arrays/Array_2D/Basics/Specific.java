package Arrays.Array_2D.Basics;

public class Specific {

    public static void main(String[] args) {
        
        int[][] arr = {
                 {1, 2, 3},
                 {4, 5, 6},
                 {7, 8, 9}
                 };

    
        // Print Specific Row

        int row =0;

        for(int i =0;i<arr[0].length;i++)
        {
            System.out.print(arr[row][i]);
        }

        System.out.println(" "); //Break line

        // Print Specific Column

        int col =1;

        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i][col]);
        }
    }
    
}
