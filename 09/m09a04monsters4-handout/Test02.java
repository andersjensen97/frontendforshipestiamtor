// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var o1 = new Owlbear("Toxinpest");
        var o2 = new Owlbear("Umbraface");
        var o3 = new Owlbear("Thunderscream");
        var owlbears = new Owlbear[] {o1, o2, o3};

        System.out.println("Owlbears:");
        for (var o: owlbears) {
            System.out.println("    - " + o.getDescription());
        }

        System.out.println("Hitting each owlbear...");
        o1.hit(20);
        o2.hit(16);
        o3.hit(40);

        System.out.println("Owlbears now:");
        for (var o: owlbears) {
            System.out.println("    - " + o.getDescription());
        }

        System.out.println("Healing each owlbear...");
        o1.heal(20);
        o2.heal(2);
        o3.heal(4);

        System.out.println("Owlbears now:");
        for (var o: owlbears) {
            System.out.println("    - " + o.getDescription());
        }

        System.out.println("Burning each owlbear...");
        o1.burn(17);
        o2.burn(56);
        o3.burn(60);

        System.out.println("Owlbears now:");
        for (var o: owlbears) {
            var deadMsg = o.isDead() ? " - DEAD!" : "";
            System.out.println("    - " + o.getDescription() + deadMsg);
        }
    }
}
