// Do not modify this file!

class Test08 {
    public static void main(String[] args) {
        var arr1 = new int[][] {{1, 2, 3}, {4, 5, 6, 7}};
        var arr2 = new int[][] {{1, 2, 3}, {4, 5, 6, 7}};

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
