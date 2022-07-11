import junit.framework.TestCase;

public class UnitTesting extends TestCase {
    public void testIsPalindrome(){
        assertFalse(isPalindrome.isPalindrome("sdawdsd"));
        assertTrue(isPalindrome.isPalindrome("a"));
        assertTrue(isPalindrome.isPalindrome(""));

        assertTrue(isPalindrome.isPalindrome("kayak"));
        assertTrue(isPalindrome.isPalindrome("rotator"));
        assertTrue(isPalindrome.isPalindrome("peep"));
        assertTrue(isPalindrome.isPalindrome("racecar"));

        assertTrue(isPalindrome.isPalindrome("UFO tofu"));
        assertTrue(isPalindrome.isPalindrome("Wont lovers revolt now"));
        assertTrue(isPalindrome.isPalindrome("Was it a car or a cat I saw"));
    }
    public void testMinSplit(){
        assertEquals(3,minSplit.minSplit(3));
        assertEquals(1,minSplit.minSplit(5));
        assertEquals(6,minSplit.minSplit(215));
        assertEquals(112,minSplit.minSplit(5481));
    }
    public void testNotContains(){
        assertEquals(2,notContains.notContains(new int[]{1,5,3,4,8,6,45,4848}));
        assertEquals(1,notContains.notContains(new int[]{5,3,4,8,6,45,4848}));
        assertEquals(5,notContains.notContains(new int[]{1,2,3,4,8}));
        assertEquals(10,notContains.notContains(new int[]{1,5,3,4,8,6,2,7,9,11}));
    }
    public void testIsProperly(){
        assertFalse(isProparly.isProperly("("));
        assertFalse(isProparly.isProperly(")"));
        assertFalse(isProparly.isProperly("((())"));
        assertTrue(isProparly.isProperly("(()())"));
        assertTrue(isProparly.isProperly("((())())"));

    }

    public void testCountVariants(){
        assertEquals(1,countVariants.countVariants(1));
        assertEquals(2,countVariants.countVariants(2));
        assertEquals(3,countVariants.countVariants(3));
        assertEquals(5,countVariants.countVariants(4));
        assertEquals(8,countVariants.countVariants(5));
        assertEquals(987,countVariants.countVariants(15));

    }
}
