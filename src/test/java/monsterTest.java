import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class monsterTest {
    /**
     * The test class tests the monster class and all of its sub classes.
     */

    @Test
    public void canEvoleTestTrue(){

        Monster monster = new Monster();

        Boolean expected = true;
        Boolean actual = monster.canEvolve();

        assertEquals(expected, actual);


    }


}
