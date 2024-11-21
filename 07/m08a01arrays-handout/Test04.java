// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var arr1 = new int[] {};
        var arr2 = new int[] {};

        System.out.println("Array 1: " + java.util.Arrays.toString(arr1));
        System.out.println("Array 2: " + java.util.Arrays.toString(arr2));
        System.out.print("Are the arrays equal? ");
        System.out.println(ArrayUtils.areEqual(arr1, arr2) ? "Yes" : "No");
    }
}
