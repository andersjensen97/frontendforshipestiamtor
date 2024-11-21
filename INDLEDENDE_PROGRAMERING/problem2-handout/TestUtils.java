// Do not modify this file!

class TestUtils {
    /**
     * Display the given playfield.
     * @param playfield the playfield to display.
     */
    public static void displayplayfield(char[][] playfield) {
        for (var row: playfield) {
            for (var cell: row) {
                System.out.print(cell);
            }
            System.out.println(""); // End of line
        }
    }
}