import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. User Input Palindrome");
        System.out.println("2. Hardcoded Palindrome");
        System.out.println("3. Palindrome Using String Reverse (Loop)");
        System.out.println("4. Palindrome Using Character Array (Two-Pointer)");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        if (choice == 1) {

            // UC1
            System.out.print("Enter a word: ");
            String word = sc.nextLine();
            checkPalindrome(word);

        } else if (choice == 2) {

            // UC2
            String hardcodedWord = "madam";
            System.out.println("Hardcoded word: " + hardcodedWord);
            checkPalindrome(hardcodedWord);

        } else if (choice == 3) {

            // UC3
            System.out.print("Enter a word: ");
            String word = sc.nextLine();
            palindromeUsingReverse(word);

        } else if (choice == 4) {

            // UC4
            System.out.print("Enter a word: ");
            String word = sc.nextLine();
            palindromeUsingCharArray(word);

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }

    // UC1 & UC2 - Basic Reverse Logic
    public static void checkPalindrome(String word) {

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if (word.equalsIgnoreCase(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    // UC3 - String Reverse Using Loop & Concatenation
    public static void palindromeUsingReverse(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    // UC4 - Character Array Two-Pointer Technique
    public static void palindromeUsingCharArray(String word) {

        char[] characters = word.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}