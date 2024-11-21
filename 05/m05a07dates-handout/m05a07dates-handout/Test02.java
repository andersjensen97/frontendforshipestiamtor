class Test02 {
    public static void main(String[] args) {
        var d1 = new Date(2000, 1, 1);
        var d2 = new Date(2001, 6, 19);
        var d3 = new Date(2002, 20, 20);
        var d4 = new Date(2003, 3, 0);
        var d5 = new Date(2004, 2, 29);
        var d6 = new Date(2005, 2, 29);
        var d7 = new Date(2006, 6, 31);
        var d8 = new Date(2007, 0, 0);
        var d9 = new Date(2008, 10, 50);

        System.out.println("Is Date(2000, 1, 1) valid? " + d1.isValid());
        System.out.println("Is Date(2001, 6, 19) valid? " + d2.isValid());
        System.out.println("Is Date(2002, 20, 20) valid? " + d3.isValid());
        System.out.println("Is Date(2003, 3, 0) valid? " + d4.isValid());
        System.out.println("Is Date(2004, 2, 29) valid? " + d5.isValid());
        System.out.println("Is Date(2005, 2, 29) valid? " + d6.isValid());
        System.out.println("Is Date(2006, 6, 31) valid? " + d7.isValid());
        System.out.println("Is Date(2007, 0, 0) valid? " + d8.isValid());
        System.out.println("Is Date(2008, 10, 50) valid? " + d9.isValid());
    }
}
