// Do not modify this file!

class Task02Test04 {
    public static void main(String[] args) {
        var playfield = Game.createPlayfield(5, 5);
        playfield[2][2] = 'X';

        var moves = new String[] {"right", "right", "right"};

        TestUtils2.testMoves(playfield, moves);
    }
}
