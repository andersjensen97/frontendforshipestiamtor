// Do not modify this file!

class Task01Test01 {
    public static void main(String[] args) {
        var titlesOpinions = new String[][] { {"Sisu", "rad"},
                                             {"The Thing (1982)", "wicked"},
                                             {"The Thing (2011)", "rotten"},
                                             {"The Room", "rotten"},
                                             {"American Sniper", "legit"},
                                             {"Dune (1984)", "meh"},
                                             {"Dune (2021)", "wicked"},
                                             {"Galaxy Quest", "rad"},
                                             {"", "rotten"},
                                             {" Cinderella", "wicked"},
                                             {"Snow White (1937) ", "legit"},
                                             {null, "wicked"},
                                             {"John  Wick: Chapter 4", "legit"} };

        TestUtils.tryCreateMovie(titlesOpinions);
    }
}
