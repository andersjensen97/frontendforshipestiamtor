// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        for (var n = 1; n < 6; n++) {
            var grid = SuperTicTacToe.createGrid(n);
            System.out.println("Empty grid of size " + n + "x" + n + ":");
            TestUtils.displayGrid(grid);
            System.out.println(""); // Skip a line
        }
    }
}
