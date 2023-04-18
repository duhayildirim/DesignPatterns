package com.company.designPatterns.factory;

import com.company.designPatterns.builder.Home;

public class HomeWithGarageFactory extends HomeFactory{
    @Override
    public Home createHome() {
        return this.createHomeBuilder().addGarage().getResult();
    }
}
