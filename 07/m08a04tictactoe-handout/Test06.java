// Do not modify this file!

class Test06 {
    public static void main(String[] args) {
        for (var n = 1; n < 6; n++) {
            var grid = SuperTicTacToe.createGrid(n);
            TestUtils.editGridRandomly(grid, 308396);

            System.out.println("Grid of size " + n + "x" + n + ":");
            TestUtils.displayGrid(grid);

            System.out.print("Is there a winner? ");
            System.out.println(SuperTicTacToe.hasWinner(grid) ? "Yes" : "No");

            System.out.println(""); // Skip a line
        }
    }
}
