public class TestUtils2 {
    /**
     * Try moving the player around the given playfield and display the result.
     * 
     * @param playfield the playfield for testing the player movements
     * @param moves array of moves to try
     */
    public static void testMoves(char[][] playfield, String[] moves) {
        System.out.println("Playfield:");
        TestUtils.displayplayfield(playfield);

        for (var move: moves) {
            System.out.println("");
            System.out.print("Game.move(..., \"" + move + "\") returns: ");
            var result = Game.move(playfield, move);
            if (result) {
                System.out.println("true :-)");
            } else {
                System.out.println("false :-(");
            }
            System.out.println("The playfield is now:");
            TestUtils.displayplayfield(playfield);
        }
    }
}
