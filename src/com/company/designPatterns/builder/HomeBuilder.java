package com.company.designPatterns.builder;

public class HomeBuilder implements Builder<Home> {
    private Home home;

    public HomeBuilder() {
        this.reset();
    }

    @Override
    public Builder<Home> addWall() {
        home.setWall(true);
        return this;
    }

    @Override
    public Builder<Home> addDoor() {
        home.setDoors(true);
        return this;
    }

    @Override
    public Builder<Home> addGarage() {
        home.setGarage(true);
        return this;
    }

    @Override
    public Builder<Home> addGarden() {
        home.setGarden(true);
        return this;
    }

    @Override
    public Builder<Home> addChildRoom() {
        home.setChildRoom(true);
        return this;
    }

    @Override
    public Builder<Home> reset() {
        home = new Home();
        return this;
    }

    @Override
    public Home getResult() {
        return this.home;
    }
}
