import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {
    Solution solution = new Solution();

    @Test
    public void testCase1(){
        String test = "({[]})";
        boolean expected = true;

        Assertions.assertEquals(expected, solution.isValid(test));

    }

    @Test
    public void testCase2(){
        String test = "()[]{}";
        boolean expected = true;

        Assertions.assertEquals(expected, solution.isValid(test));

    }

    @Test
    public void testCase3(){
        String test = "(";
        boolean expected = false;

        Assertions.assertEquals(expected, solution.isValid(test));

    }

    @Test
    public void testCase4(){
        String test = "{[(}])";
        boolean expected = false;

        Assertions.assertEquals(expected, solution.isValid(test));

    }

    @Test
    public void testCase5(){
        String test = "))}}]]";
        boolean expected = false;

        Assertions.assertEquals(expected, solution.isValid(test));

    }
}
