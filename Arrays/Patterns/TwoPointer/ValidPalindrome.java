package Arrays.Patterns.TwoPointer;

public class ValidPalindrome {

    public static void main(String[] args) {
        
        String word = "Madam";
        word = word.toLowerCase();

        int left =0;
        int right = word.length()-1;

        boolean ispali = true;


        while(left<right){ // two pointer
            if(word.charAt(left)== word.charAt(right))
            {
                left++;
                right--;
            }
            else{
                 System.out.println("False");
                 break;
            }

        }
        System.out.println(ispali);
    }
    
}
