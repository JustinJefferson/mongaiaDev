package monsters;

/**
 * This is the superclass for all monsters in the game. All generic functionality comes through this Class
 */

public abstract class Monster {
    /*
    Handles get and set
    updating stats upon level up
     */

    //Descriptors
    private String name;
    private Integer level;

    //State
    private Integer experience;
    private String[] skills;

    //Stats
    private Integer hp;
    private Integer maxHp;
    private Integer sp;
    private Integer maxSp;
    private Integer attack;
    private Integer defense;
    private Integer power;
    private Integer dexterity;
    private Integer intelligence;
    private Integer agility;
    private Integer luck;
    private Integer wild;






    public Monster(String name, Integer level, Integer experience, Integer baseHp, Integer baseSp, Integer baseAtk, Integer baseDef,
                   Integer basePower, Integer baseDexterity, Integer baseIntelligence, Integer baseAgility, Integer baseLuck, Integer wild) {

        this.name = name;
        this.level = level;
        this.experience = experience;
        this.skills = new String[8];

        Integer startHpSp = 10;
        Integer startAbility = 5;
        Integer effectiveAbility = level / 100;

        // TODO Finish this
        maxHp = startHpSp + baseHp * effectiveAbility;
        hp = maxHp;
        maxSp = startHpSp + baseSp * effectiveAbility;
        sp = maxSp;
        attack = startAbility + baseAtk * effectiveAbility;
        defense = startAbility + baseDef * effectiveAbility;
        power = startAbility + basePower * effectiveAbility;
        dexterity = startAbility + baseDexterity * effectiveAbility;
        intelligence = startAbility + baseIntelligence * effectiveAbility;
        agility = startAbility + baseAgility * effectiveAbility;
        luck = startAbility + baseLuck * effectiveAbility;
        this.wild = wild;


    }

    public abstract Boolean canEvolve();

    public abstract void updateStats();

    public void calculateStats(Integer baseHp, Integer baseSp, Integer baseAtk, Integer baseDef,
                               Integer basePower, Integer baseDexterity, Integer baseIntelligence, Integer baseAgility, Integer baseLuck) {
        // TODO calculate stats

    }

    public void evolve() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(Integer maxHp) {
        this.maxHp = maxHp;
    }

    public Integer getSp() {
        return sp;
    }

    public void setSp(Integer sp) {
        this.sp = sp;
    }

    public Integer getMaxSp() {
        return maxSp;
    }

    public void setMaxSp(Integer maxSp) {
        this.maxSp = maxSp;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getAgility() {
        return agility;
    }

    public void setAgility(Integer agility) {
        this.agility = agility;
    }

    public Integer getLuck() {
        return luck;
    }

    public void setLuck(Integer luck) {
        this.luck = luck;
    }

    public Integer getWild() {
        return wild;
    }

    public void setWild(Integer wild) {
        this.wild = wild;
    }
}
