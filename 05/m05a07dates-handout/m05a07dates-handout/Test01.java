class Test01 {
    public static void main(String[] args) {
        var d1 = new Date(1970, 1, 1);
        var d2 = new Date(1998, 6, 19);
        var d3 = new Date(2023, 10, 5);
        var d4 = new Date(1912, 6, 23);
        var d5 = new Date(1843, 12, 24);

        System.out.println("Date(1970, 1, 1) in ISO format: " + d1.toISO());
        System.out.println("Date(1998, 6, 19) in ISO format: " + d2.toISO());
        System.out.println("Date(2023, 10, 5) in ISO format: " + d3.toISO());
        System.out.println("Date(1912, 6, 23) in ISO format: " + d4.toISO());
        System.out.println("Date(1843, 12, 24) in ISO format: " + d5.toISO());
    }
}
