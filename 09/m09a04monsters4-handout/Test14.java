// Do not modify this file!

class Test14 {
    public static void main(String[] args) {
        var d = new Demogorgon("Hellsoul");
        var d1 = new Demogorgon("Hellsoul's illusion 1");
        var d2 = new Demogorgon("Hellsoul's illusion 2");
        var d3 = new Demogorgon("Hellsoul's illusion 3");
        var d4 = new Demogorgon("Hellsoul's illusion 4");
        var d5 = new Demogorgon("Hellsoul's illusion 5");
        var t = new Thing("Mashface");
        var s = new Monster("skeleton", "Skinnyguy", 42, 2.0, 1.0);

        var playground = GameUtils.createPlayground(10, 10);
        playground[0][1] = d;
        playground[1][1] = d1;
        playground[1][0] = d2;
        playground[0][2] = d3;
        playground[1][2] = d4;
        playground[2][2] = d5;
        playground[2][1] = t;
        playground[2][0] = s;

        GameUtils.playGame(playground);
    }
}
