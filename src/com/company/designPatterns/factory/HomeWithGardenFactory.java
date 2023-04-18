package com.company.designPatterns.factory;

import com.company.designPatterns.builder.Home;

public class HomeWithGardenFactory extends HomeFactory{

    @Override
    public Home createHome() {
        return this.createHomeBuilder().addGarden().getResult();
    }
}
