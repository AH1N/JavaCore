public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("внесите заметку");
        Note note = new Note();
        AdToFile.writeInFile("fl.txt", note.transform());
        System.out.println("Вот такие данные внесены" + note.transform());
    }
}