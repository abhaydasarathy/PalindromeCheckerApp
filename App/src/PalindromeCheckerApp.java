import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if (isPalindrome(word, 0, word.length() - 1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }

    // UC9 - Recursive Palindrome Checker
    public static boolean isPalindrome(String word, int start, int end) {

        // Base condition
        if (start >= end)
            return true;

        // If characters don't match
        if (word.charAt(start) != word.charAt(end))
            return false;

        // Recursive call
        return isPalindrome(word, start + 1, end - 1);
    }
}