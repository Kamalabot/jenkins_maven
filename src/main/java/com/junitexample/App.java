package introjunit.src.main.java.com.junitexample;

public class App {
    public static void main(String[] args) {
        // Test the palindrome function
        String testString1 = "racecar";
        String testString2 = "hello";
        
        System.out.println("Is '" + testString1 + "' a palindrome? " + isPalindrome(testString1));
        System.out.println("Is '" + testString2 + "' a palindrome? " + isPalindrome(testString2));
    }

    /**
     * Function to check if a given string is a palindrome.
     * @param str The string to check.
     * @return true if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}

