// Do not modify this file!

class Test10 {
    public static void main(String[] args) {
        var w = new Wumpus("Snotsnout");
        var o = new Owlbear("Nightclaw");
        var d = new Demogorgon("Chaosbringer");

        var playground = GameUtils.createPlayground(10, 10);
        playground[1][1] = w;
        playground[4][3] = o;
        playground[6][5] = d;

        GameUtils.displayMonsters(playground);
        System.out.println("Player won? " + GameUtils.playerWins(playground));

        System.out.println(System.lineSeparator() + "Hitting the monsters...");
        w.hit(100);
        o.hit(100);
        d.hit(100);
        GameUtils.displayMonsters(playground);
        System.out.println("Player won? " + GameUtils.playerWins(playground));

        System.out.println(System.lineSeparator() + "Burning the monsters...");
        o.burn(100);
        d.burn(100);
        GameUtils.displayMonsters(playground);
        System.out.println("Player won? " + GameUtils.playerWins(playground));

        System.out.println(System.lineSeparator() + "Hitting the monster...");
        d.hit(50);
        GameUtils.displayMonsters(playground);
        System.out.println("Player won? " + GameUtils.playerWins(playground));

        System.out.println(System.lineSeparator() + "Healing the monster...");
        d.heal(9999);
        GameUtils.displayMonsters(playground);
        System.out.println("Player won? " + GameUtils.playerWins(playground));
    }
}
