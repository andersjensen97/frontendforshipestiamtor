class SuperTicTacToe {

    public static String[][] createGrid(int n) {
        String[][] grid = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = null;
            }
        }
        return grid;
    }

    public static boolean hasWinner(String[][] grid) {
        // Check for winning rows.
        for (int i = 0; i < grid.length; i++) {
            String mark = grid[i][0];
            if (mark != null) {
                boolean allEqual = true;
                for (int j = 1; j < grid[i].length; j++) {
                    if (!grid[i][j].equals(mark)) {
                        allEqual = false;
                        break;
                    }
                }
                if (allEqual) {
                    return true;
                }
            }
        }

        // Check for winning columns.
        for (int j = 0; j < grid[0].length; j++) {
            String mark = grid[0][j];
            if (mark != null) {
                boolean allEqual = true;
                for (int i = 1; i < grid.length; i++) {
                    if (!grid[i][j].equals(mark)) {
                        allEqual = false;
                        break;
                    }
                }
                if (allEqual) {
                    return true;
                }
            }
        }

        // Return false if there is no winner.
        return false;
    }
}
