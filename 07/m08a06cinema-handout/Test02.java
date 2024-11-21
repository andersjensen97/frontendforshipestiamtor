// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var rows = new int[] {7, 7, 7, 6, 6};

        var c = new Cinema(rows);

        System.out.println("Number of rows: " + c.rows());

        for (var i = 0; i < c.rows(); i++){
            System.out.println(" - Seats on row " + i + ": " + c.seatsOnRow(i));
        }
    }
}
