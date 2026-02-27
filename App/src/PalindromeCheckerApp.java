import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Check User Input Palindrome");
        System.out.println("2. Check Hardcoded Palindrome");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            // Use Case 1
            System.out.print("Enter a word: ");
            String word = sc.nextLine();
            checkPalindrome(word);

        } else if (choice == 2) {

            // Use Case 2
            String hardcodedWord = "madam";
            System.out.println("Hardcoded word: " + hardcodedWord);
            checkPalindrome(hardcodedWord);

        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }

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
}