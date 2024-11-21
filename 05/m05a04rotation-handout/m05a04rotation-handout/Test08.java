// Do not modify this file!

class Test08 {
    public static void main(String[] args) {
        var arr = new int[] {};

        System.out.println("Initial array:");
        System.out.println(java.util.Arrays.toString(arr));

        var shiftedArr = ArrayUtils.rotateLeft(arr, 7);

        System.out.println("Array rotated by 7 positions to the left:");
        System.out.println(java.util.Arrays.toString(shiftedArr));
    }
}
