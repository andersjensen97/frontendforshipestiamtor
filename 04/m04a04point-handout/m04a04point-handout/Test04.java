// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var p = new Point(1, 1);
        System.out.println("Coordinates of p: " + p.x + ", " + p.y);

        var p2 = p.translate(-4, 5.5);
        System.out.println("After calling p.translate(...)");
        System.out.println("Coordinates of p: " + p.x + ", " + p.y);
        System.out.println("Coordinates of p2: " + p2.x + ", " + p2.y);

        p2.move(5, 7.5);
        System.out.println("After calling p2.move(...)");
        System.out.println("Coordinates of p: " + p.x + ", " + p.y);
        System.out.println("Coordinates of p2: " + p2.x + ", " + p2.y);
    }
}
