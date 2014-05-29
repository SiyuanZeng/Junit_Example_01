import junit.framework.TestCase;




/*
1. Add a test
2. Run all the test and see if the new one falls
3. Write some code
4. Run tests
5. Refactor code
6. Repeat

Reference:
http://en.wikipedia.org/wiki/Test-driven_development#Development_style
https://www.youtube.com/watch?v=O-ZT_dtlrR0


*/


public class PalindromeCheckerTest extends TestCase {
    PalindromeChecker palindromeChecker;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        palindromeChecker = new PalindromeChecker();
        // Step 1: Write the content without Class, then create required Class;
    }

    public void testCreatePalindromeTestObject() throws Exception {
        assertNotNull(palindromeChecker);
    }

    public void testSimplePalindromeMethod_YesPalindrome() throws Exception {
        assertTrue(palindromeChecker.isAPalindrome("MOM"));
        // Step 2: First simple valid scenario without method declaration, then write method and return true to make the test pass;

    }

    public void testSimplePalindromeMethod_NotAPalindrome1() throws Exception {
        assertFalse(palindromeChecker.isAPalindrome("Blah"));

        // Step 3: First negative scenario and make it fail, then go to the method and add simple code to make it work (if (string.equals("Blah")))
    }

    public void testSimplePalindromeMethod_NotAPalindrome2() throws Exception {
        assertFalse(palindromeChecker.isAPalindrome("ASDF"));
        // Step 4: Second negative scenario, then go to the method to make code change to make it work and do refactoring with refactoring tool;
    }

    public void testComplexPalindromOnMethod() throws Exception {
        assertTrue(palindromeChecker.isAPalindrome("kinnikinnik"));
        // Step 5: Test complex scenario to make sure that it works properly, done ;
    }

}