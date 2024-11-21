// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var trucks = new Truck[] {
            new Truck("Ford F-150", "DF 41 344", 960.0),
            new Truck("Honda Ridgeline", "DA 34 233", 718.0),
            new Truck("Tata Ace", "EV 64 216", 750)
        };

        System.out.println("Trucks:");
        for (var t: trucks) {
            System.out.println("  - " + t.getModel()
                                + " [" + t.getRegistrationPlate()+ "]"
                                + " (max load: " + t.maxLoad + ")");
        }
    }
}
