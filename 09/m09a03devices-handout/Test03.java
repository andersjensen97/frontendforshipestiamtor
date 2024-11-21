// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var phones = new Featurephone[] {
            new Featurephone("Denver BAS-18300M", "2G"),
            new Featurephone("Nokia 105", "2G"),
            new Featurephone("Nokia 3310", "2G")
        };

        System.out.println("Featurephones:");
        for (var p: phones) {
            System.out.println("  - " + p.getModel()
                                + " (" + p.getNetworkType() + " network)");
        }
    }
}
