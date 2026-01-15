import java.util.Scanner;

public class Palindromechecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("PALINDROME CHECKER ");
        System.out.println("1. Check String");
        System.out.println("2. Check Number");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume the newline

        switch (choice) {
            case 1:
                System.out.print("Enter a string: ");
                String inputStr = scanner.nextLine();
                if (isPalindrome(inputStr)) {
                    System.out.println("\"" + inputStr + "\" is a palindrome.");
                } else {
                    System.out.println("\"" + inputStr + "\" is not a palindrome.");
                }
                break;

            case 2:
                System.out.print("Enter a number: ");
                int inputNum = scanner.nextInt();
                if (isPalindrome(inputNum)) {
                    System.out.println(inputNum + " is a palindrome.");
                } else {
                    System.out.println(inputNum + " is not a palindrome.");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Overloaded method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }
}

