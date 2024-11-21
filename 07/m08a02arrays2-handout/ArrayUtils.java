class ArrayUtils {
public static int[] deepCopy(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    public static int[][] deepCopy(int[][] arrArr) {
        int[][] copy = new int[arrArr.length][];
        for (int i = 0; i < arrArr.length; i++) {
            if (arrArr[i] != null) {
                copy[i] = deepCopy(arrArr[i]);
            }
        }
        return copy;
    }
}