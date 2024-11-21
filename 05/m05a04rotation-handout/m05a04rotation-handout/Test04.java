// Do not modify this file!

class Test04 {
    public static void main(String[] args) {
        var arr = new int[] {5, 1, 2, 3, 4};

        System.out.println("Initial array:");
        System.out.println(java.util.Arrays.toString(arr));

        var shiftedArr = ArrayUtils.rotateLeft(arr, 1);

        System.out.println("Array rotated by 1 position to the left:");
        System.out.println(java.util.Arrays.toString(shiftedArr));
    }
}
