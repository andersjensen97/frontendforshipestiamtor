// Do not modify this file!

class Task03Test01 {
    public static void main(String[] args) {
        // The movies in this array are ordered from best to worst
        var movies = new Movie[]{ new Movie("The Thing (1982)", "wicked"),
                                  new Movie("Sisu", "rad"),
                                  new Movie("American Sniper", "legit"),
                                  new Movie("Dune (1984)", "meh"),
                                  new Movie("The Thing (2011)", "rotten") };

        TestUtils.compareMovies(movies);
    }
}
