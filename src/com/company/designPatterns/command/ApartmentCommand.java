package com.company.designPatterns.command;

import com.company.designPatterns.builder.Home;
import com.company.designPatterns.factory.ApartmentFactory;
import com.company.designPatterns.factory.HomeFactory;

public class ApartmentCommand implements HomeCommand {

    private final HomeFactory homeFactory = new ApartmentFactory();

    @Override
    public Home execute() {
        return this.homeFactory.createHome();
    }
}
