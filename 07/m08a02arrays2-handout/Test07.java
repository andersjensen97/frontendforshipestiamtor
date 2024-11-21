// Do not modify this file!

class Test07 {
    public static void main(String[] args) {
        var arr1 = new int[][] {{}};
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

        System.out.print("Are 'arr1' and 'arr2' aliases? ");
        System.out.println(arr1 == arr2 ? "Yes" : "No");

        System.out.print("Are 'arr1[0]' and 'arr2[0]' aliases? ");
        System.out.println(arr1[0] == arr2[0] ? "Yes" : "No");
    }
}
