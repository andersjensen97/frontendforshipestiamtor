// Do not modify this file!

class Test06 {
    public static void main(String[] args) {
        System.out.println("Empty playground with 3 rows, 3 columns:");
        var playground1 = GameUtils.createPlayground(3, 3);
        GameUtils.displayPlayground(playground1, 0, 0);

        System.out.println();

        System.out.println("Empty playground with 3 rows, 16 columns:");
        var playground2 = GameUtils.createPlayground(3, 16);
        GameUtils.displayPlayground(playground2, 0, 0);

        System.out.println();

        System.out.println("Empty playground with 8 rows, 2 column:");
        var playground3 = GameUtils.createPlayground(8, 2);
        GameUtils.displayPlayground(playground3, 0, 0);
    }
}
