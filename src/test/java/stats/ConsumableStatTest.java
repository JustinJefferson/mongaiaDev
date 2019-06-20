package stats;

import static org.junit.Assert.*;
import org.junit.Test;

public class ConsumableStatTest {

    @Test
    public void nullConstructorTest() {

        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expectedMax = 100;
        Integer expectedCurrent = 100;
        Integer actualMax = stat.getMax();
        Integer actualCurrent = stat.get();

        //Then
        assertEquals(expectedMax, actualMax);
        assertEquals(expectedCurrent, actualCurrent);

    }

    @Test
    public void ConstructorTest1() {

        //Given
        Integer expected = 1010;
        ConsumableStat stat = new ConsumableStat(50, 1000);

        //When
        Integer actualMax = stat.getMax();
        Integer actualCurrent = stat.get();

        //Then
        assertEquals(expected, actualMax);
        assertEquals(expected, actualCurrent);

    }

    @Test
    public void ConstructorTest2() {

        //Given
        Integer expected = 16;
        ConsumableStat stat = new ConsumableStat(1, 300);

        //When
        Integer actualMax = stat.getMax();
        Integer actualCurrent = stat.get();

        //Then
        assertEquals(expected, actualMax);
        assertEquals(expected, actualCurrent);

    }

    @Test
    public void ConstructorTest3() {

        //Given
        Integer expected = 750;
        ConsumableStat stat = new ConsumableStat(100, 370);

        //When
        Integer actualMax = stat.getMax();
        Integer actualCurrent = stat.get();

        //Then
        assertEquals(expected, actualMax);
        assertEquals(expected, actualCurrent);

    }

    @Test
    public void ConstructorTest4() {

        //Given
        Integer expected = 410;
        ConsumableStat stat = new ConsumableStat(20, 1000);

        //When
        Integer actualMax = stat.getMax();
        Integer actualCurrent = stat.get();

        //Then
        assertEquals(expected, actualMax);
        assertEquals(expected, actualCurrent);

    }

    @Test
    public void ConstructorTest5() {

        //Given
        Integer expected = 210;
        ConsumableStat stat = new ConsumableStat(50, 200);

        //When
        Integer actualMax = stat.getMax();
        Integer actualCurrent = stat.get();

        //Then
        assertEquals(expected, actualMax);
        assertEquals(expected, actualCurrent);

    }

    @Test
    public void subtractTest1() {

        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 50;
        stat.substract(50);
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void subtractTest2() {

        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 25;
        stat.substract(75);
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void subtractTest3() {

        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 0;
        stat.substract(100);
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void subtractTest4() {

        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 100;
        stat.substract(0);
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void subtractTest5() {

        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 0;
        stat.substract(150);
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void addTest1() {

        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 50;
        stat.substract(100);
        stat.add(50);
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void addTest2() {

        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 75;
        stat.substract(25);
        stat.add(50);
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void addTest3() {

        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 63;
        stat.substract(70);
        stat.add(33);
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void addTest4() {

        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 100;
        stat.add(50);
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void addTest5() {

        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 0;
        stat.substract(100);
        stat.add(0);
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void depleteTest() {
        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 0;
        stat.deplete();
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void depletePercentageTest1() {
        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 50;
        stat.deplete(50);
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void depletePercentageTest2() {
        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 0;
        stat.deplete(100);
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void depletePercentageTest3() {
        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 100;
        stat.deplete(0);
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void depletePercentageTest4() {
        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expected = 0;
        stat.deplete(200);
        Integer actual = stat.get();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void restoreTest() {
        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expectedZero = 0;
        Integer expectedMax = 100;
        stat.deplete();
        Integer actualZero = stat.get();
        stat.restore();
        Integer actualMax = stat.get();

        //Then
        assertEquals(expectedZero, actualZero);
        assertEquals(expectedMax, actualMax);

    }

    @Test
    public void restorePercentageTest1() {
        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expectedZero = 0;
        Integer expectedMax = 50;
        stat.deplete();
        Integer actualZero = stat.get();
        stat.restore(50);
        Integer actualMax = stat.get();

        //Then
        assertEquals(expectedZero, actualZero);
        assertEquals(expectedMax, actualMax);

    }

    @Test
    public void restorePercentageTest2() {
        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expectedZero = 0;
        Integer expectedMax = 100;
        stat.deplete();
        Integer actualZero = stat.get();
        stat.restore(100);
        Integer actualMax = stat.get();

        //Then
        assertEquals(expectedZero, actualZero);
        assertEquals(expectedMax, actualMax);

    }

    @Test
    public void restorePercentageTest3() {
        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expectedZero = 0;
        Integer expectedMax = 0;
        stat.deplete();
        Integer actualZero = stat.get();
        stat.restore(0);
        Integer actualMax = stat.get();

        //Then
        assertEquals(expectedZero, actualZero);
        assertEquals(expectedMax, actualMax);

    }

    @Test
    public void restorePercentageTest4() {
        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        Integer expectedZero = 0;
        Integer expectedMax = 100;
        stat.deplete();
        Integer actualZero = stat.get();
        stat.restore(200);
        Integer actualMax = stat.get();

        //Then
        assertEquals(expectedZero, actualZero);
        assertEquals(expectedMax, actualMax);

    }

    @Test
    public void toStringTest1() {

        //Given
        ConsumableStat stat = new ConsumableStat();

        //When
        String expected = "100 / 100";
        String actual = stat.toString();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void toStringTest2() {

        //Given
        ConsumableStat stat = new ConsumableStat();
        stat.substract(50);

        //When
        String expected = "50 / 100";
        String actual = stat.toString();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void toStringTest3() {

        //Given
        ConsumableStat stat = new ConsumableStat(50, 200);

        //When
        String expected = "200 / 200";
        String actual = stat.toString();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void toStringTest4() {

        //Given
        ConsumableStat stat = new ConsumableStat(50, 200);
        stat.deplete();

        //When
        String expected = "50 / 100";
        String actual = stat.toString();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void ConstructorFromConsumableTest1() {

        //Given
        ConsumableStat previous = new ConsumableStat();
        previous.deplete();
        Integer expectedMax = 1010;
        Integer expectedCurrent = 910;
        ConsumableStat stat = new ConsumableStat(50, 1000, new ConsumableStat());

        //When
        Integer actualMax = stat.getMax();
        Integer actualCurrent = stat.get();

        //Then
        assertEquals(expectedMax, actualMax);
        assertEquals(expectedCurrent, actualCurrent);

    }
}
