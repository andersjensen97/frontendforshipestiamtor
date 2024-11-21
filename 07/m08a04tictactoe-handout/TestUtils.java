// Do not modify this file!

class TestUtils {
    /**
     * Display the given playing grid.
     * @param grid the grid to display.
     */
    public static void displayGrid(String[][] grid) {
        for (var i = 0; i < grid.length; i++) {
            if (i == 0) {
                // Print top grid delimiter
                System.out.println("+" + "-+".repeat(grid[i].length));
            }
            for (var mark: grid[i]) {
                System.out.print("|" + ((mark == null) ? " " : mark));
            }
            System.out.println("|");
            System.out.println("+" + "-+".repeat(grid[i].length));
        }
    }

    /**
     * Fill part of the given playing grid with pseudo-random marks.
     * @param grid the grid to edit.
     * @param seed pseudo-random number generation seed.
     */
    static void editGridRandomly(String[][] grid, int seed) {
        var rnd = new java.util.Random(seed); // Pseudo-random number generator
        rnd.nextBoolean(); // Discard the first boolean, that is usually true

        var n = grid.length;

        // Fill roughly half the grid with random marks
        for (var i = 0; i < ((n * n) / 2); i++) {
            // Ranmdom coordinates on the grid, between 0 and n-1
            var row = rnd.nextInt(n);
            var col = rnd.nextInt(n);
            // Pick "X" or "O" randomly, and place it on the grid
            grid[row][col] = (rnd.nextBoolean() ? "X" : "O");
        }

        // Maybe place a winning row or column
        if (rnd.nextBoolean()) {
            var mark = rnd.nextBoolean() ? "X" : "O";
            if (rnd.nextBoolean()) {
                // Pick and place a random winning row
                var row = rnd.nextInt(n);
                for (var col = 0; col < grid[row].length; col++) {
                    grid[row][col] = mark;
                }
            } else {
                // Pick and place a random winning column
                var col = rnd.nextInt(n);
                for (var row: grid) {
                    row[col] = mark;
                }
            }
        }
    }
}
