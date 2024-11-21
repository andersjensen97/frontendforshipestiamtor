// Do not modify this file!

class Test01 {
    public static void main(String[] args) {
        var arr = new int[] {4, 1, 2, 3};

        System.out.println("Initial array:");
        System.out.println(java.util.Arrays.toString(arr));

        var shiftedArr = ArrayUtils.rotateLeft(arr);

        System.out.println("Array rotated by 1 position to the left:");
        System.out.println(java.util.Arrays.toString(shiftedArr));
    }
}
