package com.company.designPatterns.builder;

public class BuilderMain {
    private static HomeBuilder homeBuilder;
    private static Home home;

    public static void main(String[] args) {
        homeBuilder = new HomeBuilder();
        home = homeBuilder.addDoor().addGarage().addWall().addGarden().getResult();
        System.out.println(home);
    }
}
