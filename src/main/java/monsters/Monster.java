package monsters;

import stats.ConsumableStat;
import stats.ModifiableStat;

/**
 * This is the superclass for all monsters in the game. All generic functionality comes through this Class
 */

public abstract class Monster {
    /*
    Handles get and set
    updating stats upon level up
     */

    //Descriptors
    protected String name;
    protected final String species;
    protected Integer level;
    protected final Integer score;

    //State
    protected Integer experience;
    protected String[] skills;

    //Stats
    protected ConsumableStat hp;
    ConsumableStat sp;
    ModifiableStat attack;
    ModifiableStat defense;
    ModifiableStat power;
    ModifiableStat dexterity;
    ModifiableStat intelligence;
    ModifiableStat agility;
    ModifiableStat luck;
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

        hp = new ConsumableStat(level, baseHp);
        sp = new ConsumableStat(level, baseSp);
        attack = new ModifiableStat(level, baseAtk);
        defense = new ModifiableStat(level, baseDef);
        power = new ModifiableStat(level, basePower);
        dexterity = new ModifiableStat(level, baseDexterity);
        intelligence = new ModifiableStat(level, baseIntelligence);
        agility = new ModifiableStat(level, baseAgility);
        luck = new ModifiableStat(level, baseLuck);
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
//    public abstract Monster evolve();


    /**
     * adds experience gained from combat to the monster
     * @param gainedExp the score of the opposing monster
     */
    public void gainExperience(Integer gainedExp) {

    }

    protected void removeSkill() {

    }
    protected void addSkill() {

    }


    /**
     * Calculates each stat based on its level and changes the effective stat
     */
    protected void updateStats(){

        hp = new ConsumableStat(level, baseHp, hp);
        sp = new ConsumableStat(level, baseSp, sp);
        attack = new ModifiableStat(level, baseAttack, attack);
        defense = new ModifiableStat(level, baseDefense, defense);
        power = new ModifiableStat(level, basePower, power);
        dexterity = new ModifiableStat(level, baseDexterity, dexterity);
        intelligence = new ModifiableStat(level, baseIntelligence, intelligence);
        agility = new ModifiableStat(level, baseAgility, agility);
        luck = new ModifiableStat(level, baseLuck, luck);

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

    public ConsumableStat getHp() {
        return hp;
    }

    public ConsumableStat getSp() {
        return sp;
    }

    public ModifiableStat getAttack() {
        return attack;
    }

    public ModifiableStat getDefense() {
        return defense;
    }

    public ModifiableStat getPower() {
        return power;
    }

    public ModifiableStat getDexterity() {
        return dexterity;
    }

    public ModifiableStat getIntelligence() {
        return intelligence;
    }

    public ModifiableStat getAgility() {
        return agility;
    }

    public ModifiableStat getLuck() {
        return luck;
    }

    public Integer getWild() {
        return wild;
    }

    public void setWild(Integer wild) {
        this.wild = wild;
    }

    public Integer getBaseHp() {
        return baseHp;
    }

    public Integer getBaseSp() {
        return baseSp;
    }

    public Integer getBaseAttack() {
        return baseAttack;
    }

    public Integer getBaseDefense() {
        return baseDefense;
    }

    public Integer getBasePower() {
        return basePower;
    }

    public Integer getBaseDexterity() {
        return baseDexterity;
    }

    public Integer getBaseIntelligence() {
        return baseIntelligence;
    }

    public Integer getBaseAgility() {
        return baseAgility;
    }

    public Integer getBaseLuck() {
        return baseLuck;
    }
}
