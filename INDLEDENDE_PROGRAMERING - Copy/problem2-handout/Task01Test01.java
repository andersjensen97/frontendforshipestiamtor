// Do not modify this file!

class Task01Test01 {
    public static void main(String[] args) {
        for (var rows = 2; rows < 8; rows = rows + 2) {
            for (var cols = 1; cols < 8; cols = cols + 3) {
                var playfield = Game.createPlayfield(rows, cols);
                System.out.println("Empty playfield of size " + rows + "x" + cols + ":");
                TestUtils.displayplayfield(playfield);
                System.out.println(""); // Skip a line
            }
        }
    }
}
