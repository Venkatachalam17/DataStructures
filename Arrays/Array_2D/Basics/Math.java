package Arrays.Array_2D.Basics;

import java.util.*;

public class Math {

    public static void main(String[] args) {
        
       int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

    //Addition
    int sum=0;

    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            sum+= arr[i][j];
        }
    }
    System.out.println("Addition :"+ sum);

    //Subtration
    int sub =0;
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            sub-= arr[i][j];
        }
    }
    System.out.println("Subtration :"+ java.lang.Math.abs(sub));

    //Multiplication
     int mul =1;
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            mul*= arr[i][j];
        }
    }
    System.out.println("Multiplication :"+ mul);


    // Max Element
    int max = arr[0][0];
      for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
           if(arr[i][j]>max)
           {
            max = arr[i][j];
           }
        }
    }
    System.out.println("Max Element: "+ max);


    // Min Element
    int min = arr[0][0];
      for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
           if(arr[i][j]<min)
           {
            min = arr[i][j];
           }
        }
    }
    System.out.println("Max Element: "+ min);
    }
    
}
