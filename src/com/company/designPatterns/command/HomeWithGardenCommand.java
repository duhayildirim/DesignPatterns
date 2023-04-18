package com.company.designPatterns.command;

import com.company.designPatterns.builder.Home;
import com.company.designPatterns.factory.HomeFactory;
import com.company.designPatterns.factory.HomeWithGardenFactory;

public class HomeWithGardenCommand implements HomeCommand{

    private final HomeFactory homeFactory = new HomeWithGardenFactory();

    @Override
    public Home execute() {
        return this.homeFactory.createHome();
    }
}
