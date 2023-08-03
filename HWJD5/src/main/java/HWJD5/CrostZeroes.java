package HWJD5;

import java.io.*;
import java.util.Arrays;

public class CrostZeroes {

    public int[][] board = new int[3][3];

    public CrostZeroes(int[][] board){
        this.board = board;
    }

    public void saveBoardToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int[] row : this.board) {
                writer.println(Arrays.toString(row).replaceAll("[\\[\\],]", ""));
            }
            System.out.println("Игровое поле успешно сохранено в файл " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при сохранении игрового поля в файл " + fileName);
        }
    }

    public static int[][] loadBoardFromFile(String fileName) {
        int[][] board = new int[3][3];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            for (int i = 0; i < 3; i++) {
                String line = reader.readLine();
                String[] cells = line.split(" ");
                for (int j = 0; j < 3; j++) {
                    board[i][j] = Integer.parseInt(cells[j]);
                }
            }
            System.out.println("Игровое поле успешно загружено из файла " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при загрузке игрового поля из файла " + fileName);
        }
        return board;
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                switch (cell) {
                    case 1 -> System.out.print("X ");
                    case 2 -> System.out.print("O ");
                    case 3 -> System.out.print("• ");
                }
            }
            System.out.println();
        }
    }

}
