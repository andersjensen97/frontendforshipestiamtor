// Do not modify this file!

class Test05 {
    public static void main(String[] args) {
        var rows = new int[] {8, 7, 8, 7, 8, 7, 8, 7};

        var c = new Cinema(rows);

        System.out.println("Number of rows: " + c.rows());

        for (var i = 0; i < c.rows(); i++){
            System.out.println(" - Seats on row " + i + ": " + c.seatsOnRow(i)
                                + " (" + c.rowVacancies(i) + " available)");
        }
        System.out.println("Total number of seats: " + c.seats());

        System.out.println(System.lineSeparator() + "Seats map:");
        System.out.println(c.toString());
        System.out.println("Total number of available seats: " + c.vacancies());
    }
}
