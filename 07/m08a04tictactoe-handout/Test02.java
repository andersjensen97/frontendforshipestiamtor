// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        for (var n = 1; n < 6; n++) {
            var grid = SuperTicTacToe.createGrid(n);
            TestUtils.editGridRandomly(grid, 42);

            System.out.println("Grid of size " + n + "x" + n + ":");
            TestUtils.displayGrid(grid);
            System.out.println(""); // Skip a line
        }
    }
}
