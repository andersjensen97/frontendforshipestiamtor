// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var rows = new int[] {9, 8, 9, 8, 9, 8};

        var c = new Cinema(rows);

        System.out.println("Number of rows: " + c.rows());

        for (var i = 0; i < c.rows(); i++){
            System.out.println(" - Seats on row " + i + ": " + c.seatsOnRow(i));
        }
        System.out.println("Total number of seats: " + c.seats());

        System.out.println(System.lineSeparator() + "Seats map:");
        System.out.println(c.toString());
    }
}
