class ArrayUtils {
 /**
     * Checks if two arrays of ints are equal.
     *
     * @param arr1 The first array.
     * @param arr2 The second array.
     * @return True if the two arrays are equal, false otherwise.
     */
    public static boolean areEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks if two arrays of arrays of ints are equal.
     *
     * @param arrArr1 The first array of arrays.
     * @param arrArr2 The second array of arrays.
     * @return True if the two arrays of arrays are equal, false otherwise.
     */
    public static boolean areEqual(int[][] arrArr1, int[][] arrArr2) {
        if (arrArr1.length != arrArr2.length) {
            return false;
        }

        for (int i = 0; i < arrArr1.length; i++) {
            if (!areEqual(arrArr1[i], arrArr2[i])) {
                return false;
            }
        }

        return true;
    }
}