// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var boat = BoatUtils.createBoat(3);

        System.out.println("Newly-created boat:");
        BoatUtils.printBoat(boat);

        BoatTestUtils.testBoat(boat);
    }
}
