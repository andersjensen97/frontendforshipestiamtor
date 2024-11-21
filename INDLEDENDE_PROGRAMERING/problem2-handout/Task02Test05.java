// Do not modify this file!

class Task02Test05 {
    public static void main(String[] args) {
        var playfield = Game.createPlayfield(4, 4);
        playfield[2][1] = 'X';

        var moves = new String[] { "left", "left", "down",
                                   "right", "right", "up", "right", "down" };

        TestUtils2.testMoves(playfield, moves);
    }
}
