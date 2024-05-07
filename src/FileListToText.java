import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileListToText {
    public static void main(String[] args) {
        // Specify the path to the directory you want to list files from
        File folder = new File("src/P2OutputFiles");
        // Specify the path to the output text file
        File outputFile = new File("outputfile2.txt");

        try (PrintWriter writer = new PrintWriter(outputFile)) {
            // List the files in the directory
            File[] files = folder.listFiles();

            if (files != null) {
                for (File file : files) {
                    // Write each filename to the output file
                    writer.println(file.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
