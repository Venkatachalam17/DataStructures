
import java.util.*;

public class day4
{
    public static void main(String[] args)
    {
        //Declare Multi array
        int[][] student = new int[4][4];

        int row = 4;
        int col = 4;

        Scanner sc = new Scanner(System.in);

        //Get values for each students
        for(int i =0;i<row;i++)
        {
            int index = 1; 
            for(int j=0;j<col;j++)
            {
                // the first col = roll number
                if(j==0&&i>=0)
                {
                    System.out.println("Enter roll number :");
                    student[i][j] = sc.nextInt();
                }
                //Other col are for marks
                else
                {
                    System.out.println("Enter marks:" + index);
                    student[i][j] = sc.nextInt();
                    index++;
                }
            }
        }

        //Traversing and displaying marks
        System.out.println("Student Grade Dashboard");

        System.out.println("Roll No"+ "|"+ "Math"+"|"+"Science"+"|"+"CS");

        for(int i =0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(student[i][j]+ "|");
            }
            System.out.println();
        }

        //Finding avg of each students
       
         for(int i =0;i<row;i++)
        {
             int sum =0;
            for(int j=0;j<col;j++)
            {
                if(j==0&&i>=0)
                {
                    System.out.print("Average of Student :"+student[i][j]);
                }
                else
                {
                    sum+=student[i][j];
                }
            }
            System.out.println(sum/(col-1));
        }

        sc.close();


    }
}