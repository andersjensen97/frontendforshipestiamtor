// Do not modify this file!

class Task03Test04 {
    public static void main(String[] args) {
        var playfield = Game.createPlayfield(5, 5);
        playfield[2][2] = 'X';
        playfield[2][3] = '#';

        var moves = new String[] {"right", "right"};

        TestUtils2.testMoves(playfield, moves);
    }
}
