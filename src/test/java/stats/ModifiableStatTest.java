package stats;

import org.junit.Test;
import static org.junit.Assert.*;

public class ModifiableStatTest {

    @Test
    public void nullConstructorTest () {

        //Given
        ModifiableStat stat = new ModifiableStat();

        //When
        Integer expectedValue = 100;
        Integer expectedModifier = 0;
        Integer actualValue = stat.get();
        Integer actualModifier = stat.getModifier();

        //Then
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedModifier, actualModifier);

    }

    @Test
    public void constructorTest1() {

        //Given
        ModifiableStat stat = new ModifiableStat(50, 100);

        //When
        Integer expectedValue = 105;
        Integer actualValue = stat.get();

        //Then
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void constructorTest2() {

        //Given
        ModifiableStat stat = new ModifiableStat(100, 100);

        //When
        Integer expectedValue = 205;
        Integer actualValue = stat.get();

        //Then
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void constructorTest3() {

        //Given
        ModifiableStat stat = new ModifiableStat(25, 500);

        //When
        Integer expectedValue = 255;
        Integer actualValue = stat.get();

        //Then
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void constructorTest4() {

        //Given
        ModifiableStat stat = new ModifiableStat(1, 300);

        //When
        Integer expectedValue = 11;
        Integer actualValue = stat.get();

        //Then
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void buffTest1() {

        //Given
        ModifiableStat stat = new ModifiableStat();

        //When
        stat.buff();
        Integer expectedValue = 150;
        Integer expectedModifier = 1;
        Integer actualValue = stat.get();
        Integer actualModifier = stat.getModifier();

        //Then
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedModifier, actualModifier);

    }

    @Test
    public void buffTest2() {

        //Given
        ModifiableStat stat = new ModifiableStat();

        //When
        stat.buff();
        stat.buff();
        stat.buff();
        Integer expectedValue = 250;
        Integer expectedModifier = 3;
        Integer actualValue = stat.get();
        Integer actualModifier = stat.getModifier();

        //Then
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedModifier, actualModifier);

    }

    @Test
    public void buffTest3() {

        //Given
        ModifiableStat stat = new ModifiableStat();

        //When
        stat.buff();
        stat.buff();
        stat.buff();
        stat.buff();
        stat.buff();
        stat.buff();
        stat.buff();
        stat.buff();
        Integer expectedValue = 400;
        Integer expectedModifier = 6;
        Integer actualValue = stat.get();
        Integer actualModifier = stat.getModifier();

        //Then
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedModifier, actualModifier);

    }

    @Test
    public void buffByStageTest1() {

        //Given
        ModifiableStat stat = new ModifiableStat();

        //When
        stat.buff(1);
        Integer expectedValue = 150;
        Integer expectedModifier = 1;
        Integer actualValue = stat.get();
        Integer actualModifier = stat.getModifier();

        //Then
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedModifier, actualModifier);

    }

    @Test
    public void buffByStageTest2() {

        //Given
        ModifiableStat stat = new ModifiableStat();

        //When
        stat.buff(4);
        Integer expectedValue = 300;
        Integer expectedModifier = 4;
        Integer actualValue = stat.get();
        Integer actualModifier = stat.getModifier();

        //Then
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedModifier, actualModifier);

    }

    @Test
    public void buffByStageTest3() {

        //Given
        ModifiableStat stat = new ModifiableStat();

        //When
        stat.buff(8);
        Integer expectedValue = 400;
        Integer expectedModifier = 6;
        Integer actualValue = stat.get();
        Integer actualModifier = stat.getModifier();

        //Then
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedModifier, actualModifier);

    }

    @Test
    public void buffByStageTest4() {

        //Given
        ModifiableStat stat = new ModifiableStat();

        //When
        stat.buff(0);
        Integer expectedValue = 100;
        Integer expectedModifier = 0;
        Integer actualValue = stat.get();
        Integer actualModifier = stat.getModifier();

        //Then
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedModifier, actualModifier);

    }

    @Test
    public void nerfTest1() {

        //Given
        ModifiableStat stat = new ModifiableStat();

        //When
        stat.nerf();
        Integer expectedValue = 100 * 2 / 3;
        Integer expectedModifier = -1;
        Integer actualValue = stat.get();
        Integer actualModifier = stat.getModifier();

        //Then
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedModifier, actualModifier);

    }

    @Test
    public void nerfTest2() {

        //Given
        ModifiableStat stat = new ModifiableStat();

        //When
        stat.nerf();
        stat.nerf();
        stat.nerf();
        Integer expectedValue = 100 * 2 / 5;
        Integer expectedModifier = -3;
        Integer actualValue = stat.get();
        Integer actualModifier = stat.getModifier();

        //Then
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedModifier, actualModifier);

    }

    @Test
    public void nerfTest3() {

        //Given
        ModifiableStat stat = new ModifiableStat();

        //When
        stat.nerf();
        stat.nerf();
        stat.nerf();
        stat.nerf();
        stat.nerf();
        stat.nerf();
        stat.nerf();
        stat.nerf();
        Integer expectedValue = 100 * 2 / 8;
        Integer expectedModifier = -6;
        Integer actualValue = stat.get();
        Integer actualModifier = stat.getModifier();

        //Then
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedModifier, actualModifier);

    }

    @Test
    public void nerfByStageTest1() {

        //Given
        ModifiableStat stat = new ModifiableStat();

        //When
        stat.nerf(1);
        Integer expectedValue = 100 * 2 / 3;
        Integer expectedModifier = -1;
        Integer actualValue = stat.get();
        Integer actualModifier = stat.getModifier();

        //Then
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedModifier, actualModifier);

    }

    @Test
    public void nerfByStageTest2() {

        //Given
        ModifiableStat stat = new ModifiableStat();

        //When
        stat.nerf(4);
        Integer expectedValue = 100 * 2 / 6;
        Integer expectedModifier = -4;
        Integer actualValue = stat.get();
        Integer actualModifier = stat.getModifier();

        //Then
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedModifier, actualModifier);

    }

    @Test
    public void nerfByStageTest3() {

        //Given
        ModifiableStat stat = new ModifiableStat();

        //When
        stat.nerf(8);
        Integer expectedValue = 100 * 2 / 8;
        Integer expectedModifier = -6;
        Integer actualValue = stat.get();
        Integer actualModifier = stat.getModifier();

        //Then
        assertEquals(expectedValue, actualValue);
        assertEquals(expectedModifier, actualModifier);

    }

    @Test
    public void neutralizeTest1() {

        //Given
        ModifiableStat stat = new ModifiableStat();
        stat.buff();

        //When
        stat.neutralize();
        Integer expected = 0;
        Integer actual = stat.getModifier();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void neutralizeTest2() {

        //Given
        ModifiableStat stat = new ModifiableStat();
        stat.nerf();

        //When
        stat.neutralize();
        Integer expected = 0;
        Integer actual = stat.getModifier();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void neutralizeBuffTest1() {

        //Given
        ModifiableStat stat = new ModifiableStat();
        stat.buff();

        //When
        stat.neutralizeBuff();
        Integer expected = 0;
        Integer actual = stat.getModifier();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void neutralizeBuffTest2() {

        //Given
        ModifiableStat stat = new ModifiableStat();
        stat.nerf();

        //When
        stat.neutralizeBuff();
        Integer expected = -1;
        Integer actual = stat.getModifier();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void neutralizeNerfTest1() {

        //Given
        ModifiableStat stat = new ModifiableStat();
        stat.buff();

        //When
        stat.neutralizeNerf();
        Integer expected = 1;
        Integer actual = stat.getModifier();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void neutralizeNertTest2() {

        //Given
        ModifiableStat stat = new ModifiableStat();
        stat.nerf();

        //When
        stat.neutralizeNerf();
        Integer expected = 0;
        Integer actual = stat.getModifier();

        //Then
        assertEquals(expected, actual);

    }

    @Test
    public void constructorFromModifiableStatTest() {
        fail();

        //TODO make a constructor from ModifiableStat Test
    }

}
