package com.company.designPatterns.mediator;

public interface Mediator {
    void addStudent(Student student);
    void sendMessage(Student sender, String message);
}
