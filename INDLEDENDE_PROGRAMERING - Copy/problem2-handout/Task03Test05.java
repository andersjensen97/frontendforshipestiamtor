// Do not modify this file!

class Task03Test05 {
    public static void main(String[] args) {
        var playfield = Game.createPlayfield(5, 5);
        playfield[2][2] = 'X';
        playfield[2][3] = '#';
        playfield[2][4] = '#';
        playfield[3][2] = '#';
        playfield[4][0] = '#';
        playfield[1][2] = '#';

        var moves = new String[] {"right", "down", "down",
                                  "right", "down", "left", "left", "left",
                                  "up", "up", "up", "up"};

        TestUtils2.testMoves(playfield, moves);
    }
}
