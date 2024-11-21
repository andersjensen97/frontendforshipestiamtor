// Do not modify this file!

class Test09 {
    public static void main(String[] args) {
        var playground = GameUtils.createPlayground(8, 8);
        playground[3][4] = new Wumpus("Slagstep");
        playground[6][7] = new Wumpus("Thunderscream");
        playground[3][6] = new Owlbear("Toxinpest");
        playground[1][2] = new Owlbear("Umbraface");
        playground[4][5] = new Demogorgon("Chaosscreamer");
        playground[7][2] = new Demogorgon("Emberteeth");

        System.out.println("Playground with monsters:");
        GameUtils.displayPlayground(playground, 0, 0);
        GameUtils.displayMonsters(playground);

        System.out.println();

        System.out.println("Player burns while at row 1, column 0 (damage 20)");
        GameUtils.burn(playground, 1, 0, 20);

        System.out.println();

        System.out.println("Updated playground with monsters:");
        GameUtils.displayPlayground(playground, 0, 0);
        GameUtils.displayMonsters(playground);

        System.out.println();

        System.out.println("Player burns while at row 3, column 5 (damage 60)");
        GameUtils.burn(playground, 3, 5, 60);

        System.out.println();

        System.out.println("Updated playground with monsters:");
        GameUtils.displayPlayground(playground, 0, 0);
        GameUtils.displayMonsters(playground);

        System.out.println();

        System.out.println("Player burns while at row 7, column 1 (damage 80)");
        GameUtils.burn(playground, 7, 1, 80);

        System.out.println();

        System.out.println("Updated playground with monsters:");
        GameUtils.displayPlayground(playground, 0, 0);
        GameUtils.displayMonsters(playground);
    }
}
