package Arrays;

public class ArrayLOOPS {
    
    public static void main(String[] args)
    {
        String[] Languages = {"Tamil","English","Maths","Phy"};
        for(int i = 0; i<Languages.length;i++)
        {
            System.out.println(Languages[i]);
        }

        //Sum of Elements in an array
        int[] Num = {1,4,5,67,8,7};
        int Sum =0;
        for(int i=0;i<Num.length;i++)
        {
            Sum+=Num[i];
        }
        System.out.println("The Sum of all the ELements: "+Sum);

        //using For each loop to iteration only
        int[] marks = {67,89,77,99,90,68};
        System.out.println("Marks from For each loop: ");
        for (int mark : marks){
            if( mark > 67){
            System.out.println( mark);
            }
        }
    }
}
