package stats;

/**
 * This class is used to calculate the effective stat from a base stat depending on what type of stat is.
 * The formula used is:
 *
 *  effectiveStat = n + baseScore * level / 50
 *
 *  n is the minimum amount a stat can contain
 *  n is 10 for a ConsumableStat and 5 for ModifiableStats
 *
 *  An average level(lvl 50) monster will get the total amount of their baseScore added to their effective stat
 *  while a level 100 monster will get their baseScore doubled added.
 */
public class StatUtils {

    public static Integer calculateConsumable(Integer level, Integer baseScore) {
        return (10 + baseScore * level / 50);
    }

    public static Integer calculateModifier(Integer level, Integer baseScore) {
        return (5 + baseScore * level / 50);
    }
}
