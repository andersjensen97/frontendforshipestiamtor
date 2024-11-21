class Alien {
    private String name;
    private String species;
    private String planet;

    public Alien(String name, String species, String planet) {
        this.name = name;
        this.species = species;
        this.planet = planet;
    }

    public String description() {
        return name + " (" + species + " from planet " + planet + ")";
    }
}

class Gorn extends Alien {
    private boolean isFriendly;

    public Gorn(String name, boolean isFriendly) {
        super(name, "Gorn", "Arcturus");
        this.isFriendly = isFriendly;
    }

    @Override
    public String description() {
        return super.description() + " - " + (isFriendly ? "friendly" : "aggressive");
    }
}

class Cardassian extends Alien {
    private String preferredGem;

    public Cardassian(String name, String preferredGem) {
        super(name, "Cardassian", "Bajor");
        this.preferredGem = preferredGem;
    }

    @Override
    public String description() {
        return super.description() + " - preferred gem: " + preferredGem;
    }
}