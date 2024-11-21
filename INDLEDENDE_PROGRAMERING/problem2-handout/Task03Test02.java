// Do not modify this file!

class Task03Test02 {
    public static void main(String[] args) {
        var playfield = Game.createPlayfield(5, 5);
        playfield[2][2] = 'X';
        playfield[3][2] = '#';

        var moves = new String[] {"down", "down"};

        TestUtils2.testMoves(playfield, moves);
    }
}
