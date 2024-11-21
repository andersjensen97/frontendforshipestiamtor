// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        var boat = BoatUtils.createBoat(4);

        System.out.println("Newly-created boat:");
        BoatUtils.printBoat(boat);

        boat[1] = new Member("Bjarne Balling", 19);
        boat[2] = new Member("Mette Madsen", 23);

        System.out.println();
        System.out.println("Boat with a few members sitting in:");
        BoatUtils.printBoat(boat);
    }
}
