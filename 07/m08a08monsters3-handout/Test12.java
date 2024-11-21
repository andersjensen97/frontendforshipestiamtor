// Do not modify this file!

class Test12 {
    public static void main(String[] args) {
        var w = new Wumpus("Mashface");
        var o = new Owlbear("Hoothowl");

        var playground = GameUtils.createPlayground(5, 5);
        playground[1][1] = w;
        playground[3][2] = o;

        GameUtils.playGame(playground);
    }
}
