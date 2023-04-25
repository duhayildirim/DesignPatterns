package com.company.designPatterns.mediator;

public class OnSiteStudent extends Student {
    public OnSiteStudent(Mediator mediator, String name) {
        super(mediator, name);
        mediator.addStudent(this);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(this, message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("On-site student " + name + " received message: " + message);
    }
}
