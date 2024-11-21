class Test03 {
    public static void main(String[] args) {
        var d1 = new Date(1998, 6, 19);
        var d2 = new Date(1998, 6, 20);
        var d3 = new Date(1998, 7, 1);
        var d4 = new Date(1999, 1, 1);
        var d5 = new Date(2003, 1, 1);
        var d6 = new Date(2004, 1, 1);
        var d7 = new Date(2005, 1, 1);
        var d8 = new Date(2008, 8, 8);

        System.out.println("There are" + d1.daysUntil(d2) + " day(s) from Date(1998, 6, 19) to Date(1998, 6, 20)");
        System.out.println("There are" + d1.daysUntil(d3) + " day(s) from Date(1998, 6, 19) to Date(1998, 7, 1)");
        System.out.println("There are" + d1.daysUntil(d4) + " day(s) from Date(1998, 6, 19) to Date(1999, 1, 1)");
        System.out.println("There are" + d5.daysUntil(d6) + " day(s) from Date(2003, 1, 1) to Date(2004, 1, 1)");
        System.out.println("There are" + d6.daysUntil(d7) + " day(s) from Date(2004, 1, 1) to Date(2005, 1, 1)");
        System.out.println("There are" + d7.daysUntil(d8) + " day(s) from Date(2005, 1, 1) to Date(2008, 8, 8)");
        System.out.println("There are" + d8.daysUntil(d8) + " day(s) from Date(2008, 8, 8) to Date(2008, 8, 8)");
    }
}
