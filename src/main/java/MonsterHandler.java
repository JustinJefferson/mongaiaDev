public class MonsterHandler {

    private Monster monster;
    private String action;

    public MonsterHandler(Monster monster) {
        this.monster = monster;
        action = "";
    }

    public void getAction() { action = ""; }

    public Integer[] fetchHp() {return null;}

    public Integer[] fetchSp() {return null;}

    public Integer fetchAttack() {return null;}

    public Integer fetchDefense() {return null;}

    public Integer fetchPower() {return null;}

    public Integer fetchDexterity() {return null;}

    public Integer fetchIntelligence() {return null;}

    public Integer fetchAgility() {return null;}

    public Integer fetchLuck() {return null;}

    public Integer fetchWild() {return null;}
}
