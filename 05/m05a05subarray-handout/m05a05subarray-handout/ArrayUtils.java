class ArrayUtils {
    public static boolean contains(int[] arr1, int[] arr2) {
        if (arr2.length == 0) {
          return true;
        }

        if (arr1.length == 0) {
          return false;
        }

        if (arr1.length < 1) {
          return false;
        }

        int i = 0;
        int j = 0;
      
        while (i < arr1.length) {
          if (arr1[i] == arr2[j]) {
            i++;
            j++;
            if (j == arr2.length) {
              return true;
            }
          } else {
            j = 0;
          }
        }
      
        return false;
      }
      
}
