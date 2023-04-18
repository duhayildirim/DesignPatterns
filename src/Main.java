package com.company.designPatterns;

import com.company.designPatterns.command.CommandMain;
import com.company.designPatterns.command.HomeCommandType;

public class Main {
    public static void main(String[] args) {
        CommandMain commandMain = new CommandMain();
        System.out.println(commandMain.main(HomeCommandType.CREATE_HOME_WITH_GARAGE));
        System.out.println(commandMain.main(HomeCommandType.CREATE_HOME_WITH_GARDEN));
        System.out.println(commandMain.main(HomeCommandType.CREATE_APARTMENT));
    }
}