public class CeasarCipher {
    public class CaesarCipher {
        public static String caesarCipher(String text, int key, boolean encrypt) {
            StringBuilder result = new StringBuilder();

            for (char ch : text.toCharArray()) {
                if (Character.isLetter(ch)) {
                    char base = Character.isUpperCase(ch) ? 'A' : 'a';

                    char shiftedChar = (char) ((ch - base + (encrypt ? key : -key) + 26) % 26 + base);

                    result.append(shiftedChar);
                } else {
                    result.append(ch);
                }
            }

            return result.toString();
        }

    }

}
