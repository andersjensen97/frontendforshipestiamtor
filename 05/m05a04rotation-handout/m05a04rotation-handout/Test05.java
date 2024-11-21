// Do not modify this file!

class Test05 {
    public static void main(String[] args) {
        var arr = new int[] {5, 6, 7, 1, 2, 3, 4};

        System.out.println("Initial array:");
        System.out.println(java.util.Arrays.toString(arr));

        var shiftedArr = ArrayUtils.rotateLeft(arr, 3);

        System.out.println("Array rotated by 3 positions to the left:");
        System.out.println(java.util.Arrays.toString(shiftedArr));
    }
}
