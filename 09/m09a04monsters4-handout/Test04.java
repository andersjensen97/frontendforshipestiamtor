// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var monsters = new Monster[] {
            new Wumpus("Horrorface"),
            new Owlbear("Thunderscream"),
            new Thing("Slagstep"),
            new Demogorgon("Wispsoul"),
            new Owlbear("Umbraface"),
            new Wumpus("Chaosscreamer"),
            new Thing("Vileling"),
            new Thing("Emberteeth"),
            new Owlbear("Toxinpest"),
        };

        System.out.println("Monsters:");
        for (var m: monsters) {
            System.out.println("    - " + m.getDescription());
        }

        System.out.println("Hitting each monster...");
        for (var m: monsters) {
            m.hit(10);
        }

        System.out.println("Monsters now:");
        for (var m: monsters) {
            System.out.println("    - " + m.getDescription());
        }

        System.out.println("Healing each monster...");
        for (var m: monsters) {
            m.heal(2);
        }

        System.out.println("Monsters now:");
        for (var m: monsters) {
            System.out.println("    - " + m.getDescription());
        }

        System.out.println("Burning each monster...");
        for (var m: monsters) {
            m.burn(15);
        }

        System.out.println("Monsters now:");
        for (var m: monsters) {
            var deadMsg = m.isDead() ? " - DEAD!" : "";
            System.out.println("    - " + m.getDescription() + deadMsg);
        }
    }
}
