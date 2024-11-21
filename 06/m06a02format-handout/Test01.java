// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        var arr1 = new int[]{1, 2, 3};
        System.out.println("Array of length " + arr1.length + ":");
        System.out.println(ArrayUtils.format(arr1));

        System.out.println("");

        var arr2 = new int[]{10, 20, 30, 40, 50, 60};
        System.out.println("Array of length " + arr2.length + ":");
        System.out.println(ArrayUtils.format(arr2));
    }
}
