// Do not modify this file!

class Test05 {
    public static void main(String[] args) {
        var w = new Wumpus("Slagstep");
        var o = new Owlbear("Toxinpest");
        var d = new Demogorgon("Emberteeth");
        var t = new Thing("Rotthing");
        var m1 = new Monster("monster", "Test monster", 100, 2.0, 1.0);
        var m2 = new Monster("skeleton", "Test monster 2", 42, 1.0, 2.0);
        var m3 = new Monster("beholder", "Test monster 3", 70, 1.0, 2.0);

        System.out.println("Monster symbols:");
        System.out.println("Wumpus: " + w.getSymbol());
        System.out.println("Owlbear: " + o.getSymbol());
        System.out.println("Demogorgon: " + d.getSymbol());
        System.out.println("Thing: " + t.getSymbol());
        System.out.println("Custom monster 1: " + m1.getSymbol());
        System.out.println("Custom monster 2: " + m2.getSymbol());
        System.out.println("Custom monster 3: " + m3.getSymbol());
    }
}
