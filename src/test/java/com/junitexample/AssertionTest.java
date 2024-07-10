import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;

class AssertionTest {

    @BeforeAll
    static void initAll(){
        System.out.println("Before All tests are executed.");
    }

    @BeforeEach
    void init(){
        System.out.println("Every Test in Assertion will have this line");
    }

    @Test
    void testAssertions() {
        Assertions.assertEquals(4, 2 + 2);
        Assertions.assertTrue(3 > 2, "3 is greater than 2");
        Assertions.assertThrows(ArithmeticException.class, () -> {
            int division = 1 / 0;
        });

        Assertions.assertAll("Multiple assertions",
                () -> Assertions.assertEquals(4, 2 + 2),
                () -> Assertions.assertTrue(3 > 2, "3 is greater than 2"));
    }

    @AfterEach
    void tearDown(){
        System.out.println("Pull down each setup");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("All assertions are done");
    }
}

