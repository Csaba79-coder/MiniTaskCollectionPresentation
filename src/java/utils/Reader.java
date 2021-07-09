package utils;

import school.Students;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static final List<Students> STUDENTS = new ArrayList<>();

    public Reader() {
    }

    public static void Buffer(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        for (String line; (line = bufferedReader.readLine()) != null; ) {
            String[] parts = line.split(",");
            STUDENTS.add(new Students(parts[0], parts[1], Integer.parseInt(parts[2])));
            System.out.println(line);
        }
    }

    public static List<Students> getStudents() {
        return STUDENTS;
    }

}


