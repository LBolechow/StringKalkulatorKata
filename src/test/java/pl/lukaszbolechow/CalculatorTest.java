package pl.lukaszbolechow;



import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class CalculatorTest
{

    @Test
    public void shouldReturnNumberWhenSingleNumber() {assertEquals(4,Calculator.add("4"));}
    @Test
    public void shouldReturnSumofNumbersWhenTwoNumbers() {assertEquals(28,Calculator.add("20,8"));}
    @Test
    public void shouldReturnSumofNumbersWhenMultipleNumbers() {assertEquals(6,Calculator.add("1,2,3"));}
    @Test
    public void shouldReturnSumofNumbersUsingCustomSeperator() {assertEquals(8,Calculator.add("1,2\n5"));}
    @Test
    public void shouldReturnSumofNumbersUsingDifferentDelimiters()
    {
        assertEquals(3,Calculator.add("//;\n1;2"));
    }
    @Test
    public void shouldReturnExceptionWhenNegatives()
    {
        try
        {
            Calculator.add("-1,2");
            fail("AssertionError");
        }
        catch (RuntimeException exc)
        {
            assertEquals("Negatives are not allowed[-1]",exc.getMessage());
        }

    }
}
