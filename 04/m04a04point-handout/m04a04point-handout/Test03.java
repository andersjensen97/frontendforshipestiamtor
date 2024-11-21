// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var p = new Point(0, 0);
        System.out.println("Coordinates of p: " + p.x + ", " + p.y);

        var p2 = p.translate(-1, 10.5);
        System.out.println("After calling p.translate(...)");
        System.out.println("Coordinates of p: " + p.x + ", " + p.y);
        System.out.println("Coordinates of p2: " + p2.x + ", " + p2.y);

        var p3 = p2.translate(5, 7.5);
        System.out.println("After calling p2.translate(...)");
        System.out.println("Coordinates of p: " + p.x + ", " + p.y);
        System.out.println("Coordinates of p2: " + p2.x + ", " + p2.y);
        System.out.println("Coordinates of p3: " + p3.x + ", " + p3.y);
    }
}
