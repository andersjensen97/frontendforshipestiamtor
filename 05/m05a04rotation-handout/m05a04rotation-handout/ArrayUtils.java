class ArrayUtils {

    public static int[] rotateLeft(int[] arr) {
        // Check if the array is empty.
        if (arr.length == 0) {
            return arr;
        }

        // Create a new array to store the rotated elements.
        int[] rotatedArr = new int[arr.length];

        // Rotate the elements of the array to the left by one position.
        for (int i = 0; i < arr.length; i++) {
            rotatedArr[i] = arr[(i + 1) % arr.length];
        }

        return rotatedArr;
    }

    public static int[] rotateLeft(int[] arr, int n) {
        // Check if the array is empty.
        if (arr.length == 0) {
            return arr;
        }

        // Rotate the elements of the array to the left by n positions.
        for (int i = 0; i < n; i++) {
            arr = rotateLeft(arr);
        }

        return arr;
    }
}
