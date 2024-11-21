// Do not modify this file!

class Test03 {
    public static void main(String[] args) {
        var arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        var dim1 = arr1.length + " x " + arr1[0].length;
        System.out.println("Array of arrays of dimensions " + dim1 + ":");
        System.out.println(ArrayUtils.format(arr1));

        System.out.println("");

        var arr2 = new int[][]{{10, 20}, {40, 50}, {60, 70}};
        var dim2 = arr2.length + " x " + arr2[0].length;
        System.out.println("Array of arrays of dimensions " + dim2 + ":");
        System.out.println(ArrayUtils.format(arr2));
    }
}
