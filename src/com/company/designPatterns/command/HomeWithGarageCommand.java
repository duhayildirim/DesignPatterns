package com.company.designPatterns.command;

import com.company.designPatterns.builder.Home;
import com.company.designPatterns.factory.HomeFactory;
import com.company.designPatterns.factory.HomeWithGarageFactory;

public class HomeWithGarageCommand implements HomeCommand {

    private final HomeFactory homeFactory = new HomeWithGarageFactory();

    @Override
    public Home execute() {
        return this.homeFactory.createHome();
    }
}
