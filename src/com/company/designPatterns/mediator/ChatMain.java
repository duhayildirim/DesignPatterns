package com.company.designPatterns.mediator;

public class ChatMain {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediator();
        OnSiteStudent onsiteStudentA = new OnSiteStudent(chatMediator, "On-site student A");
        OnSiteStudent onsiteStudentB = new OnSiteStudent(chatMediator, "On-site student B");
        RemoteStudent remoteStudentA = new RemoteStudent(chatMediator, "Remote student A");
        RemoteStudent remoteStudentB = new RemoteStudent(chatMediator, "Remote student B");

        onsiteStudentA.sendMessage("Hi remote, how is going?");
        remoteStudentA.sendMessage("Hi, great. I have lots of things");
    }
}
