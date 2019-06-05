package monsters;

public class Hatchly extends Monster implements Avian {
    /*
    Handles base stats per species
    skills for leveling up

     */
    /**
     * Base set for all of the stat values
     */

    private static final String species = "HATCHLY";
    private static final Integer baseHp = 120;             // D 120 - 60
    private static final Integer baseSp = 120;             // D 120 - 60
    private static final Integer baseAttack = 80;          // D 80 - 40
    private static final Integer baseDefense = 120;        // C 120 - 80
    private static final Integer basePower = 80;           // D 80 - 40
    private static final Integer baseDexterity = 80;       // D 80 - 40
    private static final Integer baseIntelligence = 120;   // C 120 - 80
    private static final Integer baseAgility = 40;         // E 40 - 0
    private static final Integer baseLuck = 120;           // C 120 - 80
    private static final Integer baseWild = 20;            // E 20 - 0
    private static final Integer score = 100;

    /**
     * Nulliary Constructor
     * Creates monster at level 1
     */
    public Hatchly() {

        super(species,1,0, baseHp, baseSp, baseAttack, baseDefense,
                basePower, baseDexterity, baseIntelligence, baseAgility, baseLuck, baseWild);
    }

    /**
     * Used for creating enemy monsters at a specific level
     * @param level is the level at which hatchly is created at. It is also used to determine the effective level of
     */
    public Hatchly(Integer level) {

        super(species, level, 0, baseHp, baseSp, baseAttack, baseDefense,
                basePower, baseDexterity, baseIntelligence, baseAgility, baseLuck, baseWild);
    }

    /**
     * Used for making specific monsters with a name;
     */
    public Hatchly(String name, Integer level) {

        super(name, level, 0, baseHp, baseSp, baseAttack, baseDefense,
                basePower, baseDexterity, baseIntelligence, baseAgility, baseLuck, baseWild);
    }

    public void updateStats() {

        calculateStats(baseHp, baseSp, baseAttack, baseDefense, basePower, baseDexterity, baseIntelligence, baseAgility, baseLuck);
    }

    public Boolean canEvolve(){

        return false;

        /*
        Hatchly can evolve into Swanda or Kondor depending on certain conditions
         */
    }
}
