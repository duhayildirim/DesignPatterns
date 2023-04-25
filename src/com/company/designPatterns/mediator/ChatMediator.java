package com.company.designPatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {
    private List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void sendMessage(Student sender, String message) {
        for (Student student : students) {
            if (student != sender) {
                student.receiveMessage(message);
            }
        }
    }
}
