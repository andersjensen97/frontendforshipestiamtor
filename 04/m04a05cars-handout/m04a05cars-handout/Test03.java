// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var c1 = new Car("Ford", "Fiesta", "AF 54539", "red");
        var c2 = new Car("Ford", "Fiesta", "AF 11111", "red");
        var c3 = new Car("Ford", "Fiesta", "AF " + "1".repeat(5), "red");
        var c4 = new Car("Ford", "Focus", "AF 12345", "red");

        System.out.println("Are c1 and c2 equal? "
                           + (c1.equals(c2) ? "Yes" : "No"));
        System.out.println("Are c2 and c3 equal? "
                           + (c2.equals(c3) ? "Yes" : "No"));
        System.out.println("Are c1 and c3 equal? "
                           + (c1.equals(c3) ? "Yes" : "No"));
        System.out.println("Are c1 and c4 equal? "
                           + (c1.equals(c4) ? "Yes" : "No"));
    }
}
