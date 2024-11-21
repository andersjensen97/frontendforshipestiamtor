// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        var cameras = new Camera[] {
            new Camera("Sony A7 Alpha 7 Mark II", 24.3),
            new Camera("Canon EOS M50 Mk II", 24.1),
            new Camera("Nikon Z f", 24.5)
        };

        System.out.println("Cameras:");
        for (var c: cameras) {
            System.out.println("  - " + c.getModel()
                                + " (" + c.getMegapixels() + " megapixels)");
        }
    }
}
