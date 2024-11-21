// Do not modify this file!

class Test12 {
    public static void main(String[] args) {
        var t = new Thing("Mashface");
        var o = new Owlbear("Hoothowl");

        var playground = GameUtils.createPlayground(5, 5);
        playground[1][1] = t;
        playground[3][2] = o;

        GameUtils.playGame(playground);
    }
}
