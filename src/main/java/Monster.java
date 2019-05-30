public class Monster {

    //Descriptors
    private String name;
    private final String species;
    private final String family;
    private final Integer score;

    //State
    private Integer experience;
    private String[] skills;

    //Stats
    private Integer hp;
    private Integer sp;

    private Integer[] stats;

    private Integer wild;

    public Monster() {

        name = "Monster";
        species = "unknown";
        family = "slime";
        score = 100;

        experience = 0;
        skills = new String[8];


        hp = 100;
        sp = 100;

        stats = new Integer[]{10, 10, 10, 10, 10, 10};

        wild = 100;

    }

    public Boolean canEvolve() {
        return null;
    }

    public void evolve() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public String getFamily() {
        return family;
    }

    public Integer getScore() {
        return score;
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

    public Integer getSp() {
        return sp;
    }

    public void setSp(Integer sp) {
        this.sp = sp;
    }

    public Integer[] getStats() {
        return stats;
    }

    public void setStats(Integer[] stats) {
        this.stats = stats;
    }

    public Integer getWild() {
        return wild;
    }

    public void setWild(Integer wild) {
        this.wild = wild;
    }
}
