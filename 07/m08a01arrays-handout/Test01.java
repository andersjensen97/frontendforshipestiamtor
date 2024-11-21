// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        var arr1 = new int[] {1, 2, 3};
        var arr2 = new int[] {1, 2};

        System.out.println("Array 1: " + java.util.Arrays.toString(arr1));
        System.out.println("Array 2: " + java.util.Arrays.toString(arr2));
        System.out.print("Are the arrays equal? ");
        System.out.println(ArrayUtils.areEqual(arr1, arr2) ? "Yes" : "No");
    }
}
