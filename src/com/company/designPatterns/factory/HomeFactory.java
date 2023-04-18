package com.company.designPatterns.factory;

import com.company.designPatterns.builder.Builder;
import com.company.designPatterns.builder.Home;
import com.company.designPatterns.builder.HomeBuilder;

public abstract class HomeFactory {
    HomeBuilder HOME_BUILDER = new HomeBuilder();

    Builder<Home> createHomeBuilder(){
        return HOME_BUILDER.addDoor().addWall();
    }

    public abstract Home createHome();
}
