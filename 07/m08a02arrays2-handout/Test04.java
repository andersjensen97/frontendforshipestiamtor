// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var arr1 = new int[][] {{1, 2, 3}, {4, 5, 6}};
        var arr2 = ArrayUtils.deepCopy(arr1);

        System.out.println("Array 1:");
        for (var row: arr1) {
            System.out.println("    " + java.util.Arrays.toString(row));
        }
        System.out.println("Array 2:");
        for (var row: arr2) {
            System.out.println("    " + java.util.Arrays.toString(row));
        }
        System.out.print("Are the arrays equal? ");
        System.out.println(ArrayUtils.areEqual(arr1, arr2) ? "Yes" : "No");

        System.out.println(System.lineSeparator() + "Modifying array 1...");
        arr1[1][0] = 999;

        System.out.println("Array 1:");
        for (var row: arr1) {
            System.out.println("    " + java.util.Arrays.toString(row));
        }
        System.out.println("Array 2:");
        for (var row: arr2) {
            System.out.println("    " + java.util.Arrays.toString(row));
        }
        System.out.print("Are the arrays equal? ");
        System.out.println(ArrayUtils.areEqual(arr1, arr2) ? "Yes" : "No");
    }
}
