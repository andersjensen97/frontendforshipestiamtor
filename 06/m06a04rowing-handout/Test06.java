// Do not modify this file!

class Test06 {
    public static void main(String[] args) {
        var boat = BoatUtils.createBoat(5);
        boat[1] = new Member("Bjarne Barfod", 19);

        System.out.println("Newly-created boat with one member:");
        BoatUtils.printBoat(boat);
        
        BoatTestUtils.testBoat(boat);
    }
}
