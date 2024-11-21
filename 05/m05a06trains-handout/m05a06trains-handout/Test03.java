// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var d1 = new Departure(10, 25, "Aarhus");
        var d2 = new Departure(9, 33, "Roskilde");
        var d3 = new Departure(9, 55, "Aalborg");
        var d4 = new Departure(13, 45, "Odense");
        var d5 = new Departure(17, 22, "Esbjerg");

        // Note: to create the strings below, Java automatically calls the
        // methods d1.toString(), d2.toString(), etc.
        System.out.println("'" + d1 + "' leaves before '" + d2 + "': "
                            + d1.leavesBefore(d2));
        System.out.println("'" + d1 + "' leaves before '" + d3 + "': "
                            + d1.leavesBefore(d3));
        System.out.println("'" + d3 + "' leaves before '" + d1 + "': "
                            + d3.leavesBefore(d1));
        System.out.println("'" + d2 + "' leaves before '" + d3 + "': "
                            + d2.leavesBefore(d3));
        System.out.println("'" + d3 + "' leaves before '" + d2 + "': "
                            + d3.leavesBefore(d2));
        System.out.println("'" + d1 + "' leaves before '" + d4 + "': "
                            + d1.leavesBefore(d4));
        System.out.println("'" + d1 + "' leaves before '" + d5 + "': "
                            + d1.leavesBefore(d5));
    }
}
