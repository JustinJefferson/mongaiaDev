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
    String name;
    final String species;
    Integer level;
    final Integer score;

    //State
    Integer experience;
    String[] skills;

    //Stats
    Integer hp;
    Integer maxHp;
    Integer sp;
    Integer maxSp;
    Integer attack;
    Integer defense;
    Integer power;
    Integer dexterity;
    Integer intelligence;
    Integer agility;
    Integer luck;
    Integer wild;

    //Base Stats
    final Integer baseHp;
    final Integer baseSp;
    final Integer baseAttack;
    final Integer baseDefense;
    final Integer basePower;
    final Integer baseDexterity;
    final Integer baseIntelligence;
    final Integer baseAgility;
    final Integer baseLuck;






    public Monster(String name, String species, Integer level, Integer experience, Integer baseHp, Integer baseSp, Integer baseAtk, Integer baseDef,
                   Integer basePower, Integer baseDexterity, Integer baseIntelligence, Integer baseAgility, Integer baseLuck, Integer wild, Integer score) {

        this.name = name;
        this.species = species;
        this.level = level;
        this.experience = experience;
        this.skills = new String[8];
        this.score = score;

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

        this.baseHp = baseHp;
        this.baseSp = baseSp;
        this.baseAttack = baseAtk;
        this.baseDefense = baseDef;
        this.basePower = basePower;
        this.baseDexterity = baseDexterity;
        this.baseIntelligence = baseIntelligence;
        this.baseAgility = baseAgility;
        this.baseLuck = baseLuck;




    }

    public abstract Boolean canEvolve();

    public void updateStats(){};

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
