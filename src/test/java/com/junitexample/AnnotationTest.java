import org.junit.jupiter.api.*;

class AnnotationTest {

    @BeforeAll
    static void initAll() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void init() {
        System.out.println("Before each test");
    }

    @Test
    @DisplayName("Sample Test")
    void sampleTest() {
        System.out.println("Executing sample test");
        // Assertions.assertEquals(3, 1 + 1, "Here the assert message is delivered when failed");
        Assertions.assertEquals(2, 1 + 1, "This message is NOT delivered as it passes");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("After all tests");
    }
}
