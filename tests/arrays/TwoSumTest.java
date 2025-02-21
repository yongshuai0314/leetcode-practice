import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        assertArrayEquals(new int[] { 0, 1 }, result);
    }
} 