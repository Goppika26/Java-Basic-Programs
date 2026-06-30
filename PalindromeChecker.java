/*7) Check if a Number is Palindromic
	input = 12321
	output = true

	input = 143
	output = false
*/
import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();
        
        // Check palindrome status and print result
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }

    /**
     * Method to check if an integer is a palindrome.
     */
    public static boolean isPalindrome(int num) {
        // Negative numbers are not palindromes (e.g., -121 reversed is 121-)
        if (num < 0) {
            return false;
        }

        int originalNum = num;
        int reversedNum = 0;

        // Loop to reverse the digits of the number
        while (num != 0) {
            int lastDigit = num % 10;                // Extract the last digit
            reversedNum = (reversedNum * 10) + lastDigit; // Append digit to reversed number
            num = num / 10;                          // Remove the last digit
        }

        // Compare the reversed number with the original number
        return originalNum == reversedNum;
    }
}

