// Do not modify this file!

public class Test07 {
    public static void main(String[] args) {
        var boat = BoatUtils.createBoat(5);
        boat[1] = new Member("Bjarne Balling", 19);

        System.out.println("Newly-created boat with one member:");
        BoatUtils.printBoat(boat);

        BoatTestUtils.testBoat(boat);
    }
}
