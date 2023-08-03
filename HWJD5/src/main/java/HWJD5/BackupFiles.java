package HWJD5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class BackupFiles {
    public static void backupDir(String sourceDir, String backupDir){
        try {

            File backupDirFile = new File(backupDir);
            if (!backupDirFile.exists()) {
                backupDirFile.mkdir();
            }


            File[] files = new File(sourceDir).listFiles();


            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        String sourceFilePath = file.getAbsolutePath();
                        String backupFilePath = backupDir + File.separator + file.getName();
                        Path sourcePath = file.toPath();
                        Path backupPath = new File(backupFilePath).toPath();
                        Files.copy(sourcePath, backupPath, StandardCopyOption.REPLACE_EXISTING);
                    }
                }
            }

            System.out.println("Резерв создан в папке './backup'.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка при создании резервной копии.");
        }
    }
}
