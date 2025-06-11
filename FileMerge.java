import java.io.*;

public class FileMerge {
    public static void main(String[] args) {
        String sourceFile = "students.csv";
        String destFile = "students_copy.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File berhasil disalin ke " + destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
