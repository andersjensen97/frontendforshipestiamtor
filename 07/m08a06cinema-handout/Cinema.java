class Cinema {

    private boolean[][] seats;

    public Cinema(int[] seatsOnRows) {
        this.seats = new boolean[seatsOnRows.length][];
        for (int i = 0; i < seatsOnRows.length; i++) {
            this.seats[i] = new boolean[seatsOnRows[i]];
            for (int j = 0; j < seatsOnRows[i]; j++) {
                this.seats[i][j] = false;
            }
        }
    }

    public int rows() {
        return seats.length;
    }

    public int seatsOnRow(int row) {
        if (row < 0 || row >= rows()) {
            return 0;
        }
        return seats[row].length;
    }

    public int seats() {
        int totalSeats = 0;
        for (boolean[] row : seats) {
            totalSeats += row.length;
        }
        return totalSeats;
    }

    public int rowVacancies(int row) {
        if (row < 0 || row >= rows()) {
            return 0;
        }
        int vacancies = 0;
        for (boolean seat : seats[row]) {
            if (!seat) {
                vacancies++;
            }
        }
        return vacancies;
    }

    public int vacancies() {
        int totalVacancies = 0;
        for (int i = 0; i < rows(); i++) {
            totalVacancies += rowVacancies(i);
        }
        return totalVacancies;
    }

    public void book(int row, int column) {
        if (row < 0 || row >= rows() || column < 0 || column >= seatsOnRow(row)) {
            return;
        }
        seats[row][column] = true;
    }

    public void release(int row, int column) {
        if (row < 0 || row >= rows() || column < 0 || column >= seatsOnRow(row)) {
            return;
        }
        seats[row][column] = false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows(); i++) {
            for (int j = 0; j < seatsOnRow(i); j++) {
                sb.append(seats[i][j] ? 'X' : '.');
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}