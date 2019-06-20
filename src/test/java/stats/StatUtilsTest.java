package stats;

import org.junit.Test;
import static org.junit.Assert.*;

public class StatUtilsTest {

    @Test
    public void calculateConsumableTest1() {

        //When
        Integer expected = 210;
        Integer actual = StatUtils.calculateConsumable(100, 100);

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void calculateConsumableTest2() {

        //When
        Integer expected = 110;
        Integer actual = StatUtils.calculateConsumable(50, 100);

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void calculateConsumableTest3() {

        //When
        Integer expected = 12;
        Integer actual = StatUtils.calculateConsumable(1, 100);

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void calculateConsumableTest4() {

        //When
        Integer expected = 1510;
        Integer actual = StatUtils.calculateConsumable(75, 1000);

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void calculateConsumableTest5() {

        //When
        Integer expected = 260;
        Integer actual = StatUtils.calculateConsumable(25, 500);

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void calculateModifierTest1() {

        //When
        Integer expected = 105;
        Integer actual = StatUtils.calculateModifier(50, 100);

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void calculateModifierTest2() {

        //When
        Integer expected = 205;
        Integer actual = StatUtils.calculateModifier(100, 100);

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void calculateModifierTest3() {

        //When
        Integer expected = 25;
        Integer actual = StatUtils.calculateModifier(10, 100);

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void calculateModifierTest4() {

        //When
        Integer expected = 455;
        Integer actual = StatUtils.calculateModifier(75, 300);

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void calculateModifierTest5() {

        //When
        Integer expected = 9;
        Integer actual = StatUtils.calculateModifier(1, 200);

        //Then
        assertEquals(expected, actual);

    }

}
