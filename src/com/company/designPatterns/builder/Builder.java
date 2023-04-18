package com.company.designPatterns.builder;

public interface Builder<T> {
    Builder<T> addWall();
    Builder<T> addDoor();
    Builder<T> addGarage();
    Builder<T> addGarden();
    Builder<T> reset();
    T getResult();

}
