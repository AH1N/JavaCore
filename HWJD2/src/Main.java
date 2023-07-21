import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,4,3,8,4,1,17,5,6,5,8,5};

        String originalText = "Blood For Khorn";
        int key = 3;

        int[] arrShift = {1, 2, 3, 4, 5};
        int n = 2;
        /**
         * 1 задание
         **/
        System.out.println("ПЕРВОЕ ЗАДАНИЕ---------------------------------------------------------------------------");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(CountSort.countSort(arr)));
        /**
         * 2 задание
         **/
        System.out.println("ВТОРОЕ ЗАДАНИЕ---------------------------------------------------------------------------");
        String encryptedText = CeasarCipher.CaesarCipher.caesarCipher(originalText, key, true);
        System.out.println("Зашифрованный текст: " + encryptedText);

        String decryptedText = CeasarCipher.CaesarCipher.caesarCipher(encryptedText, key, false);
        System.out.println("Расшифрованный текст: " + decryptedText);
        /**
         * 3 задание
         **/
        System.out.println("ТРЕТЬЕ ЗАДАНИЕ---------------------------------------------------------------------------");

        System.out.println("Начальный массив: " + Arrays.toString(arr));
        ShiftN.ArrayShift.ShiftN(arr, n);
        System.out.println("После сдвига на " + n + " --> " + Arrays.toString(arr));
    }

}