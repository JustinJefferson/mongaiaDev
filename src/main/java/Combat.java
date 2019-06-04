import monsters.Monster;

/**
 *
 * This class hold all of the information for combat.
 */
public class Combat {

    private Monster enemyMonster;
    private Monster playerMonster;
    private CPUMonsterHandler cpu;
    private PlayerMonsterHandler player;


    public Combat(Monster enemyMonster, Monster playerMonster) {

        this.enemyMonster = enemyMonster;
        this.playerMonster = playerMonster;
        cpu = new CPUMonsterHandler(this.enemyMonster);
        player = new PlayerMonsterHandler(this.playerMonster);
    }

    public void setUpPhase(){

        cpu.getAction();
        player.getAction();

    }

    public void actionPhase(){

        if(player.fetchAgility() > cpu.fetchAgility()){

            //player goes first

            //check to see if cpu can go
            //cpu goes
        }
        else {

            //cpu goes first

            //check to see if player can go
            //player goes

        }
    }

    public Boolean areCombatantsReady(){
        return null;
    }

    public Boolean isVictorious(){
        return null;
    }

    public void awardExperience(){

        player.gainExperience(cpu.fetchScore());

    }

    private void playerPerformAction(){}

    private void cpuPerformAction(){}
}
