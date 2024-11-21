// Do not modify this file!

class Test07 {
    public static void main(String[] args) {
        var arr = new int[] {33};

        System.out.println("Initial array:");
        System.out.println(java.util.Arrays.toString(arr));

        var shiftedArr = ArrayUtils.rotateLeft(arr, 7);

        System.out.println("Array rotated by 7 positions to the left:");
        System.out.println(java.util.Arrays.toString(shiftedArr));
    }
}
