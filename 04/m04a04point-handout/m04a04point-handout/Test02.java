// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var p = new Point(1, 2.5);
        System.out.println("Coordinates of p: " + p.x + ", " + p.y);

        p.move(-1, 10.5);
        System.out.println("After calling p.move(...)");
        System.out.println("New coordinates of p: " + p.x + ", " + p.y);

        p.move(2.4, -7);
        System.out.println("After calling p.move(...)");
        System.out.println("New coordinates of p: " + p.x + ", " + p.y);
    }
}
