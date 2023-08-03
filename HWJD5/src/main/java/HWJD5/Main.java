package HWJD5;

import static HWJD5.BackupFiles.backupDir;
import static HWJD5.CrostZeroes.loadBoardFromFile;
import static HWJD5.CrostZeroes.printBoard;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[][] tmpBoard = new int[][]{
                {1, 0, 2},
                {2, 1, 0},
                {0, 2, 1}
        };
        CrostZeroes board = new CrostZeroes(tmpBoard);



        System.out.println("Вот наше поле");
        printBoard(tmpBoard);
        System.out.println("Кладём его в файл: --> File.txt");
        board.saveBoardToFile("TST/File.txt");
        System.out.println("Делаем бэкап: --> File.txt");
        backupDir("./TST", "./backup");
        printBoard(loadBoardFromFile("TST/File.txt"));
        System.out.println("Печатаем файл из бэкапа");
        printBoard(loadBoardFromFile("backup/File.txt"));





    }
}