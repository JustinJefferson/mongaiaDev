package monsters;

public class Nefairy extends Monster implements PlantFamily {

    public Nefairy() {

        super("NEFAIRY", "NEFAIRY", 1, 0, 120,180,
                120, 120,40, 40, 80,
                80, 80, 40, 100);

    }

    public Nefairy(Integer level) {

        super("NEFAIRY", "NEFAIRY", level, 0, 120,180,
                120, 120,40, 40, 80,
                80, 80, 40, 100);

    }

    public Nefairy(String name, Integer level) {

        super(name, "NEFAIRY", level, 0, 120,180,
                120, 120,40, 40, 80,
                80, 80, 40, 100);

    }

    /**
     * Evolves into Hanaby or Nymphea
     * @return true when conditions are met.
     */
    public Boolean canEvolve() {
        return null;
    }
    public Monster evolve() {
        return this;
    }
}
