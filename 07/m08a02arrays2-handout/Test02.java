// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var arr1 = new int[] {1, 2, 3, 4, 5};
        var arr2 = ArrayUtils.deepCopy(arr1);

        System.out.println("Array 1: " + java.util.Arrays.toString(arr1));
        System.out.println("Array 2: " + java.util.Arrays.toString(arr2));
        System.out.print("Are the arrays equal? ");
        System.out.println(ArrayUtils.areEqual(arr1, arr2) ? "Yes" : "No");

        System.out.println(System.lineSeparator() + "Modifying array 1...");
        arr1[3] = 999;

        System.out.println("Array 1: " + java.util.Arrays.toString(arr1));
        System.out.println("Array 2: " + java.util.Arrays.toString(arr2));
        System.out.print("Are the arrays equal? ");
        System.out.println(ArrayUtils.areEqual(arr1, arr2) ? "Yes" : "No");
    }
}
