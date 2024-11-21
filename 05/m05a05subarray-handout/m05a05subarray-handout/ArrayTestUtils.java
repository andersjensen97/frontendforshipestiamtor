// Do not modify this file!

class ArrayTestUtils {
    public static void test(int[] arr1, int[] arr2) {
        System.out.println("Array 1:");
        System.out.println(java.util.Arrays.toString(arr1));
        System.out.println("Array 2:");
        System.out.println(java.util.Arrays.toString(arr2));

        System.out.println("Does Array 1 contain the values of Array 2?");
        if (ArrayUtils.contains(arr1, arr2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
