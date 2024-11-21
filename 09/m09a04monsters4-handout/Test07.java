// Do not modify this file!

class Test07 {
    public static void main(String[] args) {
        System.out.println("Empty playground with 8 rows, 8 columns:");
        var playground = GameUtils.createPlayground(8, 8);
        GameUtils.displayPlayground(playground, 0, 0);

        System.out.println();

        playground[3][3] = new Wumpus("Slagstep");
        playground[5][7] = new Thing("Thunderscream");
        playground[0][6] = new Owlbear("Toxinpest");
        playground[4][4] = new Monster("dragon", "Despayr", 1000, 0.5, 0.5);
        playground[2][2] = new Demogorgon("Chaosscreamer");
        playground[7][5] = new Monster("skeleton", "Skinnyguy", 42, 2.0, 1.0);

        System.out.println("Playground with monsters:");
        GameUtils.displayPlayground(playground, 0, 0);
        GameUtils.displayMonsters(playground);
    }
}
