// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var rows = new int[] {6, 7, 8, 7, 6, 5};

        var c = new Cinema(rows);

        System.out.println("Number of rows: " + c.rows());

        for (var i = 0; i < c.rows(); i++){
            System.out.println(" - Seats on row " + i + ": " + c.seatsOnRow(i));
        }
        System.out.println("Total number of seats: " + c.seats());
    }
}
