// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var d1 = new Demogorgon("Chaosscreamer");
        var d2 = new Demogorgon("Wispsoul");
        var d3 = new Demogorgon("Emberteeth");
        var demogorgons = new Demogorgon[] {d1, d2, d3};

        System.out.println("Demogorgons:");
        for (var o: demogorgons) {
            System.out.println("    - " + o.getDescription());
        }

        System.out.println("Hitting each demogorgon...");
        d1.hit(8);
        d2.hit(40);
        d3.hit(60);

        System.out.println("Demogorgons now:");
        for (var d: demogorgons) {
            System.out.println("    - " + d.getDescription());
        }

        System.out.println("Healing each demogorgon...");
        d1.heal(20);
        d2.heal(12);
        d3.heal(8);

        System.out.println("Demogorgons now:");
        for (var d: demogorgons) {
            System.out.println("    - " + d.getDescription());
        }

        System.out.println("Burning each demogorgon...");
        d1.burn(500);
        d2.burn(56);
        d3.burn(294);

        System.out.println("Demogorgons now:");
        for (var d: demogorgons) {
            var deadMsg = d.isDead() ? " - DEAD!" : "";
            System.out.println("    - " + d.getDescription() + deadMsg);
        }
    }
}
