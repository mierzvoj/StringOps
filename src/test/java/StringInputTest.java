import org.example.StringOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StringInputTest {

    private StringOperations so = new StringOperations();

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testReverse() {
        assertEquals(so.reverse("abc"), "cba");

    }

    @Test
    public void testNegativeReverse() {
        assertNotEquals(so.reverse("abc"), "cab");

    }

    @Test
    public void testConcat(){
        assertEquals(so.concat("abc", "cba"), "abccba");
    }

    @Test
    public void testNegativeConcat(){
        assertNotEquals(so.concat("abc", "cba"), "abcabc");
    }



    @Test
    public void testIsPalindrome(){
        assertEquals(so.isPalindrome("madam"), true);
    }

    @Test
    public void testIsNotPalindrome(){
        assertNotEquals(so.isPalindrome("abcdes"), true);
    }


}
