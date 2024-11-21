// Do not modify this file!

class Task03Test02 {
    public static void main(String[] args) {
        // The movies in this array are ordered from worst to best
        var movies = new Movie[]{ new Movie("The Thing (2011)", "rotten"),
                                  new Movie("Dune (1984)", "meh"),
                                  new Movie("American Sniper", "legit"),
                                  new Movie("Sisu", "rad"),
                                  new Movie("The Thing (1982)", "wicked") };

        TestUtils.compareMovies(movies);
    }
}
