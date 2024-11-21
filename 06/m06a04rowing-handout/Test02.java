// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var boat1 = BoatUtils.createBoat(3);
        System.out.println("Newly-created boat:");
        BoatUtils.printBoat(boat1);
        testBoat(boat1);

        System.out.println("");
        var boat2 = BoatUtils.createBoat(5);
        System.out.println("Newly-created boat:");
        BoatUtils.printBoat(boat2);
        testBoat(boat2);
    }

    static void testBoat(Member[] boat) {
        boat[0] = new Member("Bjarne Balling", 19);
        boat[boat.length / 2] = new Member("Frederik Foss", 18);
        boat[boat.length - 1] = new Member("Mette Madsen", 23);

        System.out.println("");
        System.out.println("Boat with a few members sitting in:");
        BoatUtils.printBoat(boat);
        System.out.print("Is the boat full?  ");
        if (BoatUtils.isBoatFull(boat)) {
            System.out.println("Yes.");
        } else {
            System.out.println("No.");
        }
    }
}
