// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        var vans = new Minivan[] {
            new Minivan("Volkswagen Touran", "AG 43 205", 7),
            new Minivan("Peugeot e-Rifter", "BF 64 232", 7),
            new Minivan("FIAT Ducato Combi", "CE 34 909", 9)
        };

        System.out.println("Vans:");
        for (var v: vans) {
            System.out.println("  - " + v.getModel()
                                + " [" + v.getRegistrationPlate()+ "]"
                                + " (seats: " + v.seats + ")");
        }
    }
}
