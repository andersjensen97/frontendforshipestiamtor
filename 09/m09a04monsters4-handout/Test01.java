// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        var w1 = new Wumpus("Slagstep");
        var w2 = new Wumpus("Horrorface");
        var w3 = new Wumpus("Vileling");
        var wumpuses = new Wumpus[] {w1, w2, w3};

        System.out.println("Wumpuses:");
        for (var w: wumpuses) {
            System.out.println("    - " + w.getDescription());
        }

        System.out.println("Hitting each wumpus...");
        w1.hit(5);
        w2.hit(7);
        w3.hit(16);

        System.out.println("Wumpuses now:");
        for (var w: wumpuses) {
            System.out.println("    - " + w.getDescription());
        }

        System.out.println("Healing each wumpus...");
        w1.heal(1);
        w2.heal(10);
        w3.heal(3);

        System.out.println("Wumpuses now:");
        for (var w: wumpuses) {
            System.out.println("    - " + w.getDescription());
        }

        System.out.println("Burning each wumpus...");
        w1.burn(17);
        w2.burn(3);
        w3.burn(3);

        System.out.println("Wumpuses now:");
        for (var w: wumpuses) {
            var deadMsg = w.isDead() ? " - DEAD!" : "";
            System.out.println("    - " + w.getDescription() + deadMsg);
        }
    }
}
