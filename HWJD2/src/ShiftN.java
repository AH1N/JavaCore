import java.util.Arrays;

public class ShiftN {
    public class ArrayShift {
        public static void ShiftN(int[] arr, int n) {
            int length = arr.length;

            if (n < 0) {
                n = length - (-n % length);
            }

            n = n % length;

            int[] temp = new int[length];

            for (int i = 0; i < length; i++) {
                int newIndex = (i + n) % length;
                temp[newIndex] = arr[i];
            }

            System.arraycopy(temp, 0, arr, 0, length);
        }
    }

}
