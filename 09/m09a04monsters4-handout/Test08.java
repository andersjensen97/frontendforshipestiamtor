// Do not modify this file!

class Test08 {
    public static void main(String[] args) {
        var playground = GameUtils.createPlayground(8, 8);
        playground[3][4] = new Wumpus("Slagstep");
        playground[6][7] = new Owlbear("Toxinpest");
        playground[3][6] = new Monster("beholder", "Krashos", 70, 1.0, 2.0);
        playground[1][2] = new Thing("Raurgoch");
        playground[4][5] = new Monster("dragon", "Despayr", 1000, 0.5, 0.5);
        playground[7][2] = new Demogorgon("Emberteeth");

        System.out.println("Playground with monsters:");
        GameUtils.displayPlayground(playground, 0, 0);
        GameUtils.displayMonsters(playground);

        System.out.println();

        System.out.println("Player hits while at row 1, column 0 (damage 30)");
        GameUtils.hit(playground, 1, 0, 30);

        System.out.println();

        System.out.println("Updated playground with monsters:");
        GameUtils.displayPlayground(playground, 0, 0);
        GameUtils.displayMonsters(playground);

        System.out.println();

        System.out.println("Player hits while at row 3, column 5 (damage 26)");
        GameUtils.hit(playground, 3, 5, 26);

        System.out.println();

        System.out.println("Updated playground with monsters:");
        GameUtils.displayPlayground(playground, 0, 0);
        GameUtils.displayMonsters(playground);

        System.out.println();

        System.out.println("Player hits while at row 7, column 7 (damage 19)");
        GameUtils.hit(playground, 7, 7, 19);

        System.out.println();

        System.out.println("Updated playground with monsters:");
        GameUtils.displayPlayground(playground, 0, 0);
        GameUtils.displayMonsters(playground);
    }
}
