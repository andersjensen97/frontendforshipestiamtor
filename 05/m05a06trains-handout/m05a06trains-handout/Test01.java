// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        var d = new Departure(10, 25, "Aarhus");
        System.out.println("The train to " + d.destination + " leaves at "
                            + d.hour + ":" + d.minutes);

        d.hour = 12;
        d.minutes = 35;
        System.out.println("The train to " + d.destination + " now leaves at "
                            + d.hour + ":" + d.minutes);
    }
}
