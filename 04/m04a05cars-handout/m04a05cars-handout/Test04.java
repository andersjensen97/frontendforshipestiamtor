// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var c1 = new Car("Ford", "Fiesta", "AF 54539", "red");
        var c2 = new Car("Ford", "Fiesta", "AF 11111", "red");
        var c3 = new Car("Ford", "Fiesta", "AF " + "1".repeat(5), "red");
        var c4 = new Car("Ford", "Focus", "AF 12345", "red");

        System.out.println("Are c1 and c2 alike? "
                           + (c1.alike(c2) ? "Yes" : "No"));
        System.out.println("Are c2 and c3 alike? "
                           + (c2.alike(c3) ? "Yes" : "No"));
        System.out.println("Are c1 and c3 alike? "
                           + (c1.alike(c3) ? "Yes" : "No"));
        System.out.println("Are c1 and c4 alike? "
                           + (c1.alike(c4) ? "Yes" : "No"));
    }
}
