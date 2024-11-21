public class ArrayUtils {

    public static String format(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String format(int[][] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(format(arr[i]));
            if (i < arr.length - 1) {
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
