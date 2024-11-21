// Do not modify this file!

import java.util.Arrays;

class Test04 {
    public static void main(String[] args) {
        var phones = new Smartphone[] {
            new Smartphone("Motorola Moto E13", "4G", 13.0,
                            new String[] {"MP3", "OGG", "WAV"}),
            new Smartphone("Samsung Galaxy A14", "4G", 50.0,
                            new String[] {"MP3", "OGG", "WAV"}),
            new Smartphone("OnePlus Nord CE 2 Lite", "5G", 64.0,
                            new String[] {"MP3", "OGG", "WAV"})
        };

        System.out.println("Smartphones:");
        for (var p: phones) {
            System.out.println("  - " + p.getModel()
                                + " (" + p.getNetworkType()
                                + ", megapixels: " + p.getMegapixels()
                                + ") " + Arrays.toString(p.getMusicFormats()));
        }
    }
}
