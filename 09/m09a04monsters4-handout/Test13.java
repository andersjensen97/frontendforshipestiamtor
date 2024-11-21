// Do not modify this file!

class Test13 {
    public static void main(String[] args) {
        var w = new Wumpus("Vileling");
        var o = new Owlbear("Blackfur");
        var s = new Monster("skeleton", "Skinnyguy", 20, 2.0, 0.5);

        var playground = GameUtils.createPlayground(10, 10);
        playground[2][2] = o;
        playground[3][4] = s;
        playground[8][7] = w;

        GameUtils.playGame(playground);
    }
}
