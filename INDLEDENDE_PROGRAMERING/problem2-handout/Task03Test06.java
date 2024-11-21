// Do not modify this file!

class Task03Test06 {
    public static void main(String[] args) {
        var playfield = Game.createPlayfield(5, 5);
        playfield[2][2] = 'X';
        playfield[0][2] = '#';
        playfield[1][2] = '#';
        playfield[3][3] = '#';
        playfield[4][3] = '#';
        playfield[4][1] = '#';

        var moves = new String[] {"up", "up", "right", "down",
                                  "left", "down", "right",
                                  "left", "left", "left", "down",
                                  "right", "right"};

        TestUtils2.testMoves(playfield, moves);
    }
}
