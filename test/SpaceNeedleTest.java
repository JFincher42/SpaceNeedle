import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SpaceNeedleTest
{
    private static StringStream solutionStream = new StringStream();
    private static StringStream studentStream = new StringStream();
    private static int totalScore = 0;

    @BeforeClass
    public static void testBegin()
    {
        System.out.println("\nSpace Needle Tests:\n");
    }   //testBegin

    @AfterClass
    public static void testEnd()
    {
        System.out.printf("\nTotal score = %d\n", totalScore);
    }   //testEnd

    @Test
    public void testDefaultSize()
    {
        System.out.print("Test space needle with default size: ");

        solutionStream.setEnabled(true);
        SpaceNeedleSample.printSpaceNeedle();
        solutionStream.setEnabled(false);

        studentStream.setEnabled(true);
        SpaceNeedle.printSpaceNeedle();
        studentStream.setEnabled(false);

        if (solutionStream.toString().equals(studentStream.toString()))
        {
           totalScore += 1;
           System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

        assertEquals(solutionStream.toString(), studentStream.toString());
    }   //testDefaultSize

}   //class SpaceNeedleTest
