package stats;

public class ModifiableStat implements Stat {

    private final Integer value;
    private Integer modifier;

    /**
     * Null Constructor used for testing only
     */
    protected ModifiableStat() {
        value = 100;
        modifier = 0;
    }

    /**
     * Constructor to be used when creating a new Monster
     * @param level - the level of the monster as an Integer
     * @param baseScore - the baseScore of the stat as an Integer
     */
    public ModifiableStat(Integer level, Integer baseScore) {
        value = StatUtils.calculateModifier(level, baseScore);
        modifier = 0;
    }

    /**
     * Constructor to be used when updating a stat upon leveling up
     * @param level - the level of the monster
     * @param baseScore - the baseScore of the stat
     * @param previousStat - a ModifiableStat representing the stat to be updated
     */
    public ModifiableStat(Integer level, Integer baseScore, ModifiableStat previousStat) {
        value = StatUtils.calculateModifier(level, baseScore);
        modifier = previousStat.getModifier();
    }

    public Integer get() {

        switch(modifier) {

            case 6: return value * 8 / 2;
            case 5: return value * 7 / 2;
            case 4: return value * 6 / 2;
            case 3: return value * 5 / 2;
            case 2: return value * 4 / 2;
            case 1: return value * 3 / 2;
            case 0: return value;
            case -1: return value * 2 / 3;
            case -2: return value * 2 / 4;
            case -3: return value * 2 / 5;
            case -4: return value * 2 / 6;
            case -5: return value * 2 / 7;
            case -6: return value * 2 / 8;

        }

        return value;
    }

    public Integer getModifier() {
        return modifier;
    }

    public void buff() {
        if(modifier + 1 <= 6) modifier++;
    }

    public void buff(Integer numOfStages) {
        if(modifier + numOfStages < 6) {
            modifier += numOfStages;
        }
        else {
            modifier = 6;
        }
    }

    public void nerf() {
        if(modifier - 1 >= -6) modifier--;
    }

    public void nerf(Integer numOfStages) {
        if(modifier - numOfStages > -6) {
            modifier -= numOfStages;
        }
        else {
            modifier = -6;
        }
    }

    public void neutralize() {
        modifier = 0;
    }

    public void neutralizeBuff() {
        if(modifier > 0) neutralize();
    }

    public void neutralizeNerf() {
        if(modifier < 0) neutralize();
    }




}
