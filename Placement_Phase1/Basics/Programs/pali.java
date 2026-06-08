
//Input : String a ="05:39";
//Output: 11; (The number that makes the times min and hr palindrome)

package Programs;

public class pali
{
    public static void main(String[] args)
    {
      String time = "05:39";
    int h = Integer.parseInt(time.substring(0,2));
    int m = Integer.parseInt(time.substring(3,5));
    
    System.out.println(palindrome(h,m));
    }

    public static int palindrome(int h , int m)
    {
        int min =0;
        while(!ispali(h, m))
        {
            m++;
            if(m==60)
            {
                m=0;
                h=(h+1)%24;
               
            }
            
         min++;
        }
        return min;
    }


    public static boolean ispali(int h,int m)
    {
        int h1 = h/10;
        int h2= h%10;
        int m1= m/10;
        int m2 = m%10;

        return h1==m2 && h2==m1;
    }



}