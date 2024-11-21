// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var vehicles = new Vehicle[] {
            new Minivan("FIAT Ducato Combi", "CE 34 909", 9),
            new Truck("Honda Ridgeline", "DA 34 233", 718.0),
            new Truck("Ford F-150", "DF 41 344", 960.0),
            new Minivan("Volkswagen Touran", "AG 43 205", 7),
            new Truck("Tata Ace", "EV 64 216", 750.0),
            new Minivan("Peugeot e-Rifter", "BF 64 232", 7),
        };

        System.out.println("Vehicles fleet:");
        for (var v: vehicles) {
            System.out.println("  - " + v.getModel()
                                + " [" + v.getRegistrationPlate()+ "]");
        }
    }
}
