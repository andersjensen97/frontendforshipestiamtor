// Do not modify this file!

class Test07 {
    public static void main(String[] args) {
        System.out.println("Empty playground with 8 rows, 8 columns:");
        var playground = GameUtils.createPlayground(8, 8);
        GameUtils.displayPlayground(playground, 0, 0);

        System.out.println();

        playground[3][3] = new Wumpus("Slagstep");
        playground[5][7] = new Wumpus("Thunderscream");
        playground[0][6] = new Owlbear("Toxinpest");
        playground[6][3] = new Owlbear("Umbraface");
        playground[2][0] = new Demogorgon("Chaosscreamer");
        playground[1][5] = new Demogorgon("Emberteeth");

        System.out.println("Playground with monsters:");
        GameUtils.displayPlayground(playground, 0, 0);
        GameUtils.displayMonsters(playground);
    }
}
