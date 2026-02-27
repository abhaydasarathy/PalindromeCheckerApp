import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Word Palindrome");
        System.out.println("2. Number Palindrome");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter a word: ");
            String word = sc.nextLine();
            checkWordPalindrome(word);
        }

        else if (choice == 2) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            checkNumberPalindrome(num);
        }

        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }

    public static void checkWordPalindrome(String word) {
        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if (word.equalsIgnoreCase(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void checkNumberPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while (num != 0) {
            reverse = reverse * 10 + (num % 10);
            num /= 10;
        }

        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}