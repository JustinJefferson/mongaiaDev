package monsters;

public class Drippy extends Monster implements SlimeFamily{

    public Drippy() {

        super("DRIPPY", "DRIPPY", 1, 0, 120, 120,
                80, 80,80, 80, 80,
                80, 80, 20, 100);

    }

    public Drippy(Integer level) {

        super("DRIPPY", "DRIPPY", level, 0, 120, 120,
                80, 80,80, 80, 80,
                80, 80, 20, 100);

    }

    public Drippy(String name, Integer level) {

        super(name, "DRIPPY", level, 0, 120, 120,
                80, 80,80, 80, 80,
                80, 80, 20, 100);

    }

    /**
     * Evolves into Boxyblob or Globby
     * @return true when conditions are met.
     */
    public Boolean canEvolve() {
        return null;
    }


}
