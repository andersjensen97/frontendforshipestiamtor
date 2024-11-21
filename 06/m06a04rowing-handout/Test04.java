// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var boat = BoatUtils.createBoat(2);

        System.out.println("Newly-created boat:");
        BoatUtils.printBoat(boat);

        BoatTestUtils.testBoat(boat);
    }
}
