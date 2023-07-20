import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 */
public class AdToFile {

    /**
     * @param fileName
     * @param data
     * @throws IOException
     */
    private static void writeF(String fileName, String data) throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.newLine();
        writer.write(data);
        writer.close();
        System.out.println("Данные успешно записаны в файл.");
    }

    /**
     * @param fileName
     * @param data
     */
    public static void writeInFile(String fileName, String data) {

        try {
            writeF(fileName, data);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
            writeInFile(Input.inPut(), data);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
