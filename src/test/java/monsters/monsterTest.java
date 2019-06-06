package monsters;

import static org.junit.Assert.*;

import monsters.Monster;
import org.junit.Assert;
import org.junit.Test;

public class monsterTest {
    /**
     * The test class tests the monster class and all of its sub classes.
     */

    @Test
    public void calculateHpSPTest1(){

        // Given
        Hatchly hatchly = new Hatchly();
        hatchly.setLevel(20);
        hatchly.updateStats();

        Integer expected = hatchly.getBaseHp() * 2 / 5 + 10 ;
        Integer actual = hatchly.getHp();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateHpSpTest2(){

        // Given
        Hatchly hatchly = new Hatchly();
        hatchly.setLevel(100);
        Integer base = hatchly.getBaseSp();
        hatchly.updateStats();

        Integer expected = base * 2 + 10;
        Integer actual = hatchly.getSp();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void calculateHpSpTest3(){

        // Given
        Nefairy nefairy = new Nefairy();
        nefairy.setLevel(50);
        Integer base = nefairy.getBaseHp();
        nefairy.updateStats();

        Integer expected = base + 10;
        Integer actual = nefairy.getHp();

        Assert.assertEquals(expected, actual);
    }



    @Test
    public void calculateAblilityTest1(){

        //Given
        Hatchly hatchly = new Hatchly();
        hatchly.setLevel(25);
        Integer base = hatchly.getBaseAttack();
        hatchly.updateStats();

        Integer expected = 5 + base / 2;
        Integer actual = hatchly.getAttack();

        Assert.assertEquals(expected, actual);
    }


}
