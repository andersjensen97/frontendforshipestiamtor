// Do not modify this file!

class Test11 {
    public static void main(String[] args) {
        var w = new Wumpus("Grimjaw");
        var o = new Owlbear("Moonstalker");
        var d = new Demogorgon("Flamewrath");

        var playground = GameUtils.createPlayground(10, 10);
        playground[1][1] = w;
        playground[4][3] = o;
        playground[6][5] = d;
        GameUtils.displayPlayground(playground, 0, 0);

        System.out.println("Player eaten at 0,0? "
                           + GameUtils.playerEaten(playground, 0, 0));
        System.out.println("Player eaten at 4,3? "
                           + GameUtils.playerEaten(playground, 4, 3));
        System.out.println("Player eaten at 6,5? "
                           + GameUtils.playerEaten(playground, 6, 5));

        System.out.println(System.lineSeparator() + "Burning monsters...");
        w.burn(9999);
        o.burn(9999);
        d.burn(9999);

        System.out.println("Player eaten at 6,5? "
                           + GameUtils.playerEaten(playground, 6, 5));
        System.out.println("Player eaten at 1,1? "
                           + GameUtils.playerEaten(playground, 1, 1));

        System.out.println(System.lineSeparator() + "Healing monster at 1,1...");
        w.heal(9999);
        System.out.println("Player eaten at 1,1? "
                           + GameUtils.playerEaten(playground, 1, 1));
    }
}
