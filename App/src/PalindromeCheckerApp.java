import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. User Input Palindrome");
        System.out.println("2. Hardcoded Palindrome");
        System.out.println("3. Palindrome Using String Reverse (Loop)");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter a word: ");
            String word = sc.nextLine();
            checkPalindrome(word);

        } else if (choice == 2) {

            String hardcodedWord = "madam";
            System.out.println("Hardcoded word: " + hardcodedWord);
            checkPalindrome(hardcodedWord);

        } else if (choice == 3) {

            System.out.print("Enter a word: ");
            String word = sc.nextLine();
            palindromeUsingReverse(word);

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }

    // Common palindrome check (UC1 & UC2)
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

    // UC3 - Explicit Reverse Logic Explanation Version
    public static void palindromeUsingReverse(String word) {

        String reversed = "";

        // Reverse string using loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed
        if (word.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}