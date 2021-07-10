package controller;

import school.Students;
import utils.Reader;

import java.util.ArrayList;
import java.util.List;

public class StudentsController {

    public StudentsController() {
    }

    public void calculateAverage(String name, String subject) {
        Students students = new Students();
        List<Integer> grades = new ArrayList<>() {};
        double counter = 0;
        double sum = 0;
        double average;
        Reader.STUDENTS = Reader.getStudents();
        for (int i = 0; i < (Reader.STUDENTS.size() - 1); i++) {
            if (name.equals(Reader.STUDENTS.get(i).getName()) || subject.equals(Reader.STUDENTS.get(i).getName())) {
                grades.add(Integer.parseInt(String.valueOf(students.getGrade())));
                counter++;
                sum += Reader.getStudents().get(i).getGrade();
            }
        }
        average = (sum/counter);

        System.out.println(name + " has the average grade of " + subject + " is: " + average);
//        int sum = 0;
//        for (int j = 0; j < grades.size(); j++) {
//            sum += grades.get(j);

    }
}

