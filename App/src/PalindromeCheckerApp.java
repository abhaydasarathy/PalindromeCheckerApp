import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (char ch : input.toCharArray()) {
            queue.add(ch);     // Enqueue (FIFO)
            stack.push(ch);    // Push (LIFO)
        }

        boolean isPalindrome = true;

        // Compare Dequeue and Pop
        while (!queue.isEmpty()) {

            char qChar = queue.remove();  // Dequeue
            char sChar = stack.pop();     // Pop

            if (qChar != sChar) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome)
            System.out.println("The word is a Palindrome.");
        else
            System.out.println("The word is NOT a Palindrome.");

        sc.close();
    }
}