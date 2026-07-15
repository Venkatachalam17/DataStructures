public class day3 {
    public static void main(String[] args) {
        
        //Define the dimensions
        int row=4,col=4;

        //Declare and Initialize a 2d ARRAY
        int[][] arr = new int[row][col];
        for(int i =0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = i;
            }
        }

        //Print the matrix
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Sum the elements of each row
        
        for(int i =0;i<row;i++)
        {
            int sum =0;
            for(int j=0;j<col;j++)
            {
                sum+=arr[i][j];
            }
            System.out.println("Sum of row"+ " "+ i +" : "+ sum);
        }

        //Perform transpose of matrix
        int[][] transpose = new int[arr.length][arr[0].length];

        for(int i =0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                transpose[j][i] = arr[i][j];
            }
        }

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }


    }
    
}
