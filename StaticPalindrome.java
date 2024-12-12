public class StaticPalindrome {

    // Static method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        str = str.replaceAll("\\s", "").toLowerCase();
        
        int start = 0;
        int end = str.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }
        return true; // It's a palindrome
    }

    public static void main(String[] args) {
        // Hardcoded input string
        String input = "A man a plan a canal Panama";  // You can change this string to test different cases

        // Check if the input is a palindrome using the static method
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
