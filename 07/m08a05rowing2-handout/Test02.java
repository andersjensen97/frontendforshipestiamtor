// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var boat1 = new Boat(3);
        System.out.println("Newly-created boat:");
        boat1.print();
        testBoat(boat1);

        System.out.println("");
        var boat2 = new Boat(5);
        System.out.println("Newly-created boat:");
        boat2.print();
        testBoat(boat2);
    }

    static void testBoat(Boat boat) {
        boat.assignMember(new Member("Bjarne Balling", 19));
        boat.assignMember(new Member("Frederik Foss", 18));
        boat.assignMember(new Member("Mette Madsen", 23));

        System.out.println("");
        System.out.println("Boat with a few members sitting in:");
        boat.print();
        System.out.print("Is the boat full?  ");
        if (boat.isFull()) {
            System.out.println("Yes.");
        } else {
            System.out.println("No.");
        }
    }
}
