package Arrays.Examples;

public class Leaders {
 /*🔹 Leaders in an Array (1D)

📌 What is a leader?
An element is a leader if all elements to its right are smaller than it.

➡️ Last element is ALWAYS a leader (nothing on the right).

🧠 Key Idea (Logic)
Traverse the array from right to left
Keep track of the maximum seen so far
If current element > max → it’s a leader */

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        int max = arr[arr.length - 1];
        System.out.print(max + " ");

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }
}


    