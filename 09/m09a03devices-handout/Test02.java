// Do not modify this file!

import java.util.Arrays;

class Test02 {
    public static void main(String[] args) {
        var players = new MusicPlayer[] {
            new MusicPlayer("ABC Pocket Player",
                            new String[] {"MP3"}),
            new MusicPlayer("Muzak 2.0",
                            new String[] {"MP3", "OGG"}),
            new MusicPlayer("HiFi Player Deluxe",
                            new String[] {"WAV", "FLAC"})
        };

        System.out.println("Music players:");
        for (var p: players) {
            System.out.println("  - " + p.getModel()
                                + "; music formats: "
                                + Arrays.toString(p.getMusicFormats()));
        }
    }
}
