public class day6 {
    
    public static void main(String[] args) {

        String str = "Hello";

        System.out.println("All Non-Empty Substrings:");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    
}
}
