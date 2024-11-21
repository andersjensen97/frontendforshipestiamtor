// Do not modify this file!

class Test05 {
    public static void main(String[] args) {
        var phones = new CanMakeCalls[] {
            new Featurephone("Nokia 3310", "2G"),
            new Smartphone("Samsung Galaxy A14", "4G", 50.0,
                            new String[] {"MP3", "OGG", "WAV"}),
            new Featurephone("Nokia 105", "2G"),
            new Smartphone("Motorola Moto E13", "4G", 13.0,
                            new String[] {"MP3", "OGG", "WAV"}),
            new Featurephone("Denver BAS-18300M", "2G"),
            new Smartphone("OnePlus Nord CE 2 Lite", "5G", 64.0,
                            new String[] {"MP3", "OGG", "WAV"})
        };

        System.out.println("Phones:");
        for (var p: phones) {
            System.out.println("  - " + p.getModel()
                                + " (" + p.getNetworkType() + " network)");
        }
    }
}
