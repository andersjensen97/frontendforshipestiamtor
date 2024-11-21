// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var arr1 = new int[] {};
        var arr2 = ArrayUtils.deepCopy(arr1);

        System.out.println("Array 1: " + java.util.Arrays.toString(arr1));
        System.out.println("Array 2: " + java.util.Arrays.toString(arr2));
        System.out.print("Are the arrays equal? ");
        System.out.println(ArrayUtils.areEqual(arr1, arr2) ? "Yes" : "No");
        System.out.print("Are 'arr1' and 'arr2' aliases? ");
        System.out.println(arr1 == arr2 ? "Yes" : "No");
    }
}
