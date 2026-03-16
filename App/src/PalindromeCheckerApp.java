import java.util.Scanner;

public class PalindromeCheckerApp {

    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        Node head = createLinkedList(word);

        if (isPalindrome(head))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }

    // Convert string to linked list
    public static Node createLinkedList(String word) {

        Node head = null, tail = null;

        for (int i = 0; i < word.length(); i++) {

            Node newNode = new Node(word.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    // Check palindrome using linked list
    public static boolean isPalindrome(Node head) {

        Node slow = head;
        Node fast = head;

        // Find middle of list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        while (slow != null) {
            Node next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        // Compare halves
        Node first = head;
        Node second = prev;

        while (second != null) {

            if (first.data != second.data)
                return false;

            first = first.next;
            second = second.next;
        }

        return true;
    }
}