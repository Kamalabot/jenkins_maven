package introjunit.src.main.java.com.junitexample;
// check where the package is pointing. 
// when App is used, it has to point to main, else 
// parameterized test will not find the App class

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Assertions;

class ParameterizedExampleTest {
    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar", "level"})
    void testIsPalindrome(String candidate) {
        Assertions.assertTrue(App.isPalindrome(candidate));
    }
    // below implementation is using the reverse method
    // boolean isPalindrome(String str) {
        // return str.equals(new StringBuilder(str).reverse().toString());
    // }
}

