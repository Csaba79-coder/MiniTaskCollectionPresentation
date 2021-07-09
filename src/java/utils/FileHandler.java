package utils;

import java.io.IOException;


public class FileHandler {


    private static final String sourceDir = "src/resources/"; // src/resources/Class.txt

    public FileHandler() {
    }

    public void readFile(String txt) {
        String fileName = sourceDir + txt;
        try {
            Reader.Buffer(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
