// Do not modify this file!

class Task02Test03 {
    public static void main(String[] args) {
        var playfield = Game.createPlayfield(5, 5);
        playfield[2][2] = 'X';

        var moves = new String[] {"left", "left", "left"};

        TestUtils2.testMoves(playfield, moves);
    }
}
