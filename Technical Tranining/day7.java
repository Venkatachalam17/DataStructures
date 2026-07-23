public class day7 {
   

    public static String insertChar(String str, char ch, int pos) {

        String result = "";

        // If position is greater than length, append at the end
        if (pos > str.length()) {
            pos = str.length();
        }

        // Copy characters before the position
        for (int i = 0; i < pos; i++) {
            result += str.charAt(i);
        }

        // Insert the new character
        result += ch;

        // Copy the remaining characters
        for (int i = pos; i < str.length(); i++) {
            result += str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        String str = "Hello";
        char ch = 'X';
        int pos = 2;

        String newString = insertChar(str, ch, pos);

        System.out.println("Original String: " + str);
        System.out.println("New String: " + newString);
    }
}
    