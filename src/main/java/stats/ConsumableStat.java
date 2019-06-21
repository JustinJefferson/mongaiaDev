package stats;

public class ConsumableStat implements Stat {

    private final Integer maxValue;
    private Integer currentValue;

    /**
     * Null Constructor for use in Test Cases
     */
    protected ConsumableStat() {
        maxValue = 100;
        currentValue = maxValue;
    }

    /**
     * Constructor used for creating a new stat
     * @param level the level of the monster
     * @param baseScore the baseScore of the stat
     */
    public ConsumableStat(Integer level, Integer baseScore) {
        maxValue = StatUtils.calculateConsumable(level, baseScore);
        currentValue = maxValue;
    }

    /**
     * Constructor used for creating a new stat based on and to replace the current value of the consumable
     * @param level the level of the monster
     * @param baseScore - the baseScore of the stat
     * @param previous - the ConsumbaleStat used to base the currentValue off of.
     */
    public ConsumableStat(Integer level, Integer baseScore, ConsumableStat previous) {
        maxValue = StatUtils.calculateConsumable(level, baseScore);
        currentValue = previous.get() + maxValue - previous.getMax();
        if(maxValue < currentValue) currentValue = maxValue;
    }

    /**
     * @return the currentValue of the ConsumableStat
     */
    public Integer get() {
        return currentValue;
    }

    /**
     * @return the maxValue of the ConsumableStat
     */
    public Integer getMax() {
        return maxValue;
    }

    /**
     * takes a num and adds it to the current while making sure it is less than the maxValue
     * @param num int to add
     */
    public void add(int num) {
        if(currentValue + num < maxValue) {
            currentValue += num;
        }
        else {
            currentValue = maxValue;
        }
    }

    /**
     * takes a num and subtracts it from the currentValue while keeping it greater than or equal to 0.
     * @param num int to subtract
     */
    public void substract(int num) {
        if(currentValue - num >= 0) {
            currentValue -= num;
        }
        else {
            currentValue = 0;
        }

    }

    /**
     * Zeros out the currentValue
     */
    public void deplete() {
        currentValue = 0;
    }

    /**
     * Subtracts a percentage of the maxValue from the CurrentValue
     * @param percent the percent as an Integer
     */
    public void deplete(Integer percent) {
        substract(maxValue * percent / 100);
    }

    /**
     * Makes currentValue equal to MaxValue
     */
    public void restore() {
        currentValue = maxValue;
    }

    /**
     * Adds a percentage of the maxValue to the CurrentValue
     * @param percent the percent as an Integer
     */
    public void restore(Integer percent) {
        add(maxValue * percent / 100);
    }

    /**
     * Prints the value of current and max in respects to each other
     * @return
     */
    @Override
    public String toString() {
        return String.format("%d / %d", currentValue, maxValue);
    }
}
