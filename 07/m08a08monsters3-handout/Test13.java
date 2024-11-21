// Do not modify this file!

class Test13 {
    public static void main(String[] args) {
        var w = new Wumpus("Vileling");
        var o = new Owlbear("Blackfur");
        var d = new Demogorgon("Darkterror");

        var playground = GameUtils.createPlayground(10, 10);
        playground[2][2] = w;
        playground[3][4] = o;
        playground[8][7] = d;

        GameUtils.playGame(playground);
    }
}
