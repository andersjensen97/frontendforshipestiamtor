// Do not modify this file!

class Test06 {
    public static void main(String[] args) {
        var arr = new int[] {5, 12, 44, 3, 7};

        System.out.println("Initial array:");
        System.out.println(java.util.Arrays.toString(arr));

        var shiftedArr = ArrayUtils.rotateLeft(arr, 42);

        System.out.println("Array rotated by 42 positions to the left:");
        System.out.println(java.util.Arrays.toString(shiftedArr));
    }
}
