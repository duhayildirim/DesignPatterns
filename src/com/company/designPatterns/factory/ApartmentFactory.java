package com.company.designPatterns.factory;

import com.company.designPatterns.builder.Home;

public class ApartmentFactory extends HomeFactory{
    @Override
    public Home createHome() {
        return this.createHomeBuilder().getResult();
    }
}
