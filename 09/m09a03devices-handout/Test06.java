// Do not modify this file!

class Test06 {
    public static void main(String[] args) {
        var devices = new Device[] {
            new MusicPlayer("Muzak 2.0",
                            new String[] {"MP3", "OGG"}),
            new Camera("Canon EOS M50 Mk II", 24.1),
            new Featurephone("Nokia 3310", "2G"),
            new Smartphone("Samsung Galaxy A14", "4G", 50.0,
                            new String[] {"MP3", "OGG", "WAV"}),
            new Featurephone("Nokia 105", "2G"),
            new Camera("Sony A7 Alpha 7 Mark II", 24.3),
            new MusicPlayer("ABC Pocket Player",
                            new String[] {"MP3"}),
            new Smartphone("Motorola Moto E13", "4G", 13.0,
                            new String[] {"MP3", "OGG", "WAV"}),
            new Featurephone("Denver BAS-18300M", "2G"),
            new Camera("Nikon Z f", 24.5),
            new Smartphone("OnePlus Nord CE 2 Lite", "5G", 64.0,
                            new String[] {"MP3", "OGG", "WAV"}),
            new MusicPlayer("HiFi Player Deluxe",
                            new String[] {"WAV", "FLAC"})
        };

        System.out.println("Devices:");
        for (var d: devices) {
            System.out.println("  - " + d.getModel());
        }
    }
}
