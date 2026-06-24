package Arrays.Array_2D.Basics;

import java.util.*;

public class Traversing {
 
    public static void main(String[] args) {
    
    int[][] arr = new int[3][3];


    //Get Value
    Scanner sc = new Scanner(System.in);
    
    for(int i =0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            arr[i][j] = sc.nextInt();
        }
    }

    System.out.println(" ");

    // Print all elements
    
     for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    } 

    
}
