package com.company.designPatterns.mediator;

public class RemoteStudent extends Student {
    public RemoteStudent(Mediator mediator, String name) {
        super(mediator, name);
        mediator.addStudent(this);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Remote student " + name + " received message: " + message);
    }
}
