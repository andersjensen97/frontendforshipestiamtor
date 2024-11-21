// Do not modify this file!

class Test05 {
    public static void main(String[] args) {
        var boat = BoatUtils.createBoat(4);
        boat[1] = new Member("Bjarne Balling", 21);

        System.out.println("Newly-created boat with one member:");
        BoatUtils.printBoat(boat);
        
        BoatTestUtils.testBoat(boat);
    }
}
