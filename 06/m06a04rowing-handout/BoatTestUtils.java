// Do not modify this file!

class BoatTestUtils {
    static void testBoat(Member[] boat) {
        var members = new Member[] {
            new Member("Bjarne Balling", 19),
            new Member("Frederik Foss", 18),
            new Member("Mette Madsen", 23)
        };

        System.out.println("");
        for (var m: members) {
            System.out.println("Assigning a member to the boat: " + m + "...");
            if (BoatUtils.assignMember(boat, m)) {
                System.out.println("    - Succeeded");
            } else {
                System.out.print("    - Failed: ");
                if (BoatUtils.isBoatFull(boat)) {
                    System.out.println("the boat is full");
                } else {
                    System.out.println(m + " is already on the boat");
                }
            }
        }

        System.out.println("");
        System.out.println("Boat with a few members sitting in:");
        BoatUtils.printBoat(boat);
    }
}
