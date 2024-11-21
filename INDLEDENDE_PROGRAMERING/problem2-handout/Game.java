public class Game {
    public static char[][] createPlayfield(int rows, int columns) {
        char[][] playfield = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                playfield[i][j] = '.';
            }
        }
        return playfield;
    }

    public static boolean move(char[][] playfield, String direction) {
        int playerRow = -1, playerColumn = -1;
        for (int i = 0; i < playfield.length; i++) {
            for (int j = 0; j < playfield[i].length; j++) {
                if (playfield[i][j] == 'X') {
                    playerRow = i;
                    playerColumn = j;
                    break;
                }
            }
        }

        int newRow = playerRow, newColumn = playerColumn;
        switch (direction) {
            case "up":
                newRow--;
                break;
            case "down":
                newRow++;
                break;
            case "left":
                newColumn--;
                break;
            case "right":
                newColumn++;
                break;
        }

        if (newRow >= 0 && newRow < playfield.length && newColumn >= 0 && newColumn < playfield[0].length) {
            if (playfield[newRow][newColumn] == '.') {
                playfield[playerRow][playerColumn] = '.';
                playfield[newRow][newColumn] = 'X';
                return true;
            } else if (playfield[newRow][newColumn] == '#') {
                int boulderRow = newRow, boulderColumn = newColumn;
                switch (direction) {
                    case "up":
                        boulderRow--;
                        break;
                    case "down":
                        boulderRow++;
                        break;
                    case "left":
                        boulderColumn--;
                        break;
                    case "right":
                        boulderColumn++;
                        break;
                }

                if (boulderRow >= 0 && boulderRow < playfield.length && boulderColumn >= 0 && boulderColumn < playfield[0].length && playfield[boulderRow][boulderColumn] == '.') {
                    playfield[playerRow][playerColumn] = '.';
                    playfield[newRow][newColumn] = 'X';
                    playfield[boulderRow][boulderColumn] = '#';
                    return true;
                }
            }
        }

        return false;
    }
}