// Do not modify this file!

class Test10 {
    public static void main(String[] args) {
        var w = new Wumpus("Snotsnout");
        var o = new Owlbear("Nightclaw");
        var d = new Demogorgon("Chaosbringer");
        var t = new Thing("Voidsoul");
        var b = new Monster("beholder", "Krashos", 70, 1.0, 2.0);

        var playground = GameUtils.createPlayground(10, 10);
        playground[1][1] = w;
        playground[4][3] = o;
        playground[6][5] = d;
        playground[2][4] = t;
        playground[7][0] = b;

        GameUtils.displayMonsters(playground);
        System.out.println("Player won? " + GameUtils.playerWins(playground));

        System.out.println(System.lineSeparator() + "Hitting the monsters...");
        w.hit(10);
        o.hit(10);
        d.hit(10);
        t.hit(10);
        b.hit(10);
        GameUtils.displayMonsters(playground);
        System.out.println("Player won? " + GameUtils.playerWins(playground));

        System.out.println(System.lineSeparator() + "Burning the monsters...");
        w.burn(30);
        o.burn(30);
        d.burn(30);
        t.burn(30);
        b.burn(30);
        GameUtils.displayMonsters(playground);
        System.out.println("Player won? " + GameUtils.playerWins(playground));

        System.out.println(System.lineSeparator() + "Hitting the monsters...");
        o.hit(50);
        d.hit(250);
        GameUtils.displayMonsters(playground);
        System.out.println("Player won? " + GameUtils.playerWins(playground));

        System.out.println(System.lineSeparator() + "Healing the monsters...");
        t.heal(9999);
        b.heal(9999);
        GameUtils.displayMonsters(playground);
        System.out.println("Player won? " + GameUtils.playerWins(playground));
    }
}
