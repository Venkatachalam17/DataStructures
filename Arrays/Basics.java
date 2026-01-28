package Arrays;

public class Basics{
    public static void main(String[] args)
    {
            int[] nums = {10,20,30,40,50};  // 0,1,2,3,4,5
            
            int[] number = new int[5]; // One more way of creating Array 
            int[] value;      // declare the variable not the dynamic size
          
            //Accessing Array elements
            int FirstVal = nums[0];
            int SecondVal = nums[1];
            
            //Print Firstval
            System.out.println("The first element in nums is:" +FirstVal);

            //Concatination +
            System.out.println("The first element in nums is:" +FirstVal+SecondVal);

            // adding Two values
            System.out.println("The first element in nums is:" +(FirstVal+SecondVal));


            //Now adding Value to int value[]
            value =new int[]{67,98,99};   //*

            value[0] = 65;  // Changing value
            System.out.println(value[0]);

            // Find length of the string

            String[] MyString ={"Hello","java"};
            System.out.print(MyString.length);

    }
}
