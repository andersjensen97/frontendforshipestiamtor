// Do not modify this file!

class Task03Test01 {
    public static void main(String[] args) {
        var playfield = Game.createPlayfield(5, 5);
        playfield[2][2] = 'X';
        playfield[1][2] = '#';

        var moves = new String[] {"up", "up"};

        TestUtils2.testMoves(playfield, moves);
    }
}
