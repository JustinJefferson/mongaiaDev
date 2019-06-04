import monsters.*;

public class PlayerProfile {

    private String name;
    private Monster[] monsters;

    public void PlayerProfile(){
        name = "";
        monsters = new Monster[6];
    }

    public void PlayerProfile(String name){
        this.name = name;
        monsters = new Monster[6];
    }

    public void addMonster(Monster mon) {
        Boolean space = false;

        for(int i = 0; i < monsters.length; i++) {
            if(monsters[i] == null) {
                monsters[i] = mon;
                space = true;
            }
        }

        //Error: No space
        System.out.println("There is no room available.");
    }

    public Monster removeMonsterByIndex(Integer index) {
        Monster remove = monsters[index];
        monsters[index] = null;
        return remove;
    }

    public Monster removeMonsterByObject(Monster mon) {
        Integer index = getIndexOfMonster(mon);

        if(index != null) {
            return removeMonsterByIndex(index);
        }
        else {
            return null;
        }
    }

    public void switchMonsters(Integer index1, Integer index2) {
        Monster placeholder = monsters[index1];
        monsters[index1] = monsters[index2];
        monsters[index2] = placeholder;
    }

    public Monster getMonsterAt(Integer index) {
        return monsters[index];
    }

    public String getName() { return name; }

    public Monster[] getMonsters() { return monsters; }

    public Integer getIndexOfMonster(Monster mon) {
        for(int i = 0; i < monsters.length; i++) {
            if(monsters[i].equals(mon)) return i;
        }
        return null;
    }





}
