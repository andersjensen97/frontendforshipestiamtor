// Do not modify this file!

class Test02 {
    public static void main(String[] args) {
        var arr = new int[] {42};

        System.out.println("Initial array:");
        System.out.println(java.util.Arrays.toString(arr));

        var shiftedArr = ArrayUtils.rotateLeft(arr);

        System.out.println("Array rotated by 1 position to the left:");
        System.out.println(java.util.Arrays.toString(shiftedArr));
    }
}
