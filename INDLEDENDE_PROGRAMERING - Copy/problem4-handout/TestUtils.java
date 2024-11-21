// Do not modify this file!

class TestUtils {
    public static void tryCreateMovie(String[][] titlesOpinions) {
        for (var titleOpinion: titlesOpinions) {
            var title = titleOpinion[0];
            var opinion = titleOpinion[1];

            System.out.println("Creating new Movie with title '"
                               + title + "' and opinion '" + opinion + "'...");
            try {
                var eg = new Movie(title, opinion);
                System.out.println("    - OK: title = '" + eg.getTitle()
                                   + "', opinion = '" + eg.getOpinion() + "'");
            } catch (IllegalArgumentException e) {
                System.out.println("    - Failed! " + e.getMessage());
            }
        }
    }

    public static void trySetTitle(String[] titles) {
        System.out.println("Creating new Movie with title 'Sisu' and opinion 'rad'");
        var eg = new Movie("Sisu", "rad");
        for (var title: titles) {
            System.out.println("Setting the title to '" + title + "'...");
            try {
                eg.setTitle(title);
                System.out.println("    - OK");
            } catch (IllegalArgumentException e) {
                System.out.println("    - Failed! " + e.getMessage());
            }
            System.out.println("    - The Movie object now has: "
                               + "title = '" + eg.getTitle()
                               + "', opinion = '" + eg.getOpinion() + "'");
        }
    }

    public static void trySetOpinion(String[] opinions) {
        System.out.println("Creating new Movie with title 'Sisu' and opinion 'rad'");
        var eg = new Movie("Sisu", "rad");
        for (var opinion: opinions) {
            System.out.println("Setting the opinion to '" + opinion + "'...");
            try {
                eg.setOpinion(opinion);
                System.out.println("    - OK");
            } catch (IllegalArgumentException e) {
                System.out.println("    - Failed! " + e.getMessage());
            }
            System.out.println("    - The Movie object now has: "
                               + "title = '" + eg.getTitle()
                               + "', opinion = '" + eg.getOpinion() + "'");
        }
    }

    public static void compareMovies(Movie[] movies) {
        for (var i = 0; i < movies.length; i++) {
            for (var j = i+1; j < movies.length; j++) {
                var m1 = movies[i];
                var m2 = movies[j];
                System.out.println("Movie 1: '" + m1.getTitle() + "' "
                                   + "(opinion: " + m1.getOpinion() + ")");
                System.out.println("Movie 2: '" + m2.getTitle() + "' "
                                   + "(opinion: " + m2.getOpinion() + ")");
                System.out.println("Movie 1 is better than Movie 2: "
                                  + m1.isBetterThan(m2));
                System.out.println("");
            }
        }
    }
}
