// Do not modify this file!

class Test09 {
    public static void main(String[] args) {
        var arr = new int[] {4, 79, 22, 3, 6};

        System.out.println("Initial array:");
        System.out.println(java.util.Arrays.toString(arr));

        var shiftedArr = ArrayUtils.rotateLeft(arr, 0);

        System.out.println("Array rotated by 0 positions to the left:");
        System.out.println(java.util.Arrays.toString(shiftedArr));
    }
}
