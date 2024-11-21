// Do not modify this file!

class Test06 {
    public static void main(String[] args) {
        var rows = new int[] {8, 7, 8, 7, 8};

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

        System.out.println(System.lineSeparator() + "Booking some seats...");
        c.book(0, 0);
        c.book(2, 3);
        c.book(2, 4);
        c.book(2, 5);
        c.book(3, 5);
        c.book(4, 8);

        System.out.println(System.lineSeparator() + "Seats map:");
        System.out.println(c.toString());
        System.out.println("Total number of available seats: " + c.vacancies());
        for (var i = 0; i < c.rows(); i++){
            System.out.println(" - Seats on row " + i + ": " + c.seatsOnRow(i)
                                + " (" + c.rowVacancies(i) + " available)");
        }
    }
}
