package com.company.designPatterns.mediator;

public class ChatMain {
    //    Mediator pattern:
//    You will have a system that organize the communication between students and lecturers. There will
//    be two different students which are on-site student and remote students. The features of classes up
//    to you. Those students will send a message to each other on the other words this app will be like
//    messaging app. You will have Mediator which coordinates messages.s
//    Example of box:
//            — On-site Student A sends: Hi remote, how is going?
//            — All On-site Students receive: Hi remote, how is going?
//            — All Remote Students receive: Hi remote, how is going?
//            — Remote Student A : Hi, great. I have lots of things to do, how about you?
//            — All On-site Students receive: Hi, great. I have lots of things to do, how about you?
//            — All Remote Students receive: Hi, great. I have lots of things to do, how about you?
//            — On-site Student B : It similar :(.
//    One should think this app like whatsapp group.
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediator();
        Student onsiteStudentA = new OnSiteStudent(chatMediator, "On-site student A");
        Student remoteStudentA = new RemoteStudent(chatMediator, "Remote student A");
        Student onsiteStudentB = new OnSiteStudent(chatMediator, "Onsite Student B");

        onsiteStudentA.sendMessage("Hi remote, how is going?");
        remoteStudentA.sendMessage("Hi, great. I have lots of things");
        onsiteStudentB.sendMessage("It's similar :(");
        chatMediator.sendMessage(null, "Hello everyone, I'm doing great. I have lots of things to do, how about you?");

    }
}
