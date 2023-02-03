package software;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter {

    public void writeIntoFile(String fileName, String fileContent) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(fileContent);
            writer.close();
            System.out.println("Success! The content is saved!");
        } catch (IOException e) {
            System.out.println("Something went wrong. Please, try again");
            e.printStackTrace();
        }
    }
}
