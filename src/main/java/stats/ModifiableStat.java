package stats;

public class ModifiableStat implements Stat {

    private final Integer value;
    private Integer modifer;

    protected ModifiableStat() {
        value = 100;
        modifer = 0;
    }

    public ModifiableStat(Integer level, Integer baseScore) {
        value = StatUtils.calculateModifier(level, baseScore);
        modifer = 0;
    }

    public ModifiableStat(Integer level, Integer baseScore, ModifiableStat previousStat) {
        value = StatUtils.calculateModifier(level, baseScore);
        modifer = previousStat.getModifier();
    }
    public Integer get() {
        return null;
    }

    public Integer getModifier() {
        return null;
    }

    public void buff() {}

    public void buff(Integer numOfStages) {}

    public void nerf() {}

    public void nerf(Integer numOfStages) {}

    public void neutralize() {}

    public void neutralizeBuff() {}

    public void neutralizeNerf() {}




}
