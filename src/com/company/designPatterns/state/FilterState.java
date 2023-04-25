package com.company.designPatterns.state;

public interface FilterState {

    void showUserList();

    void filterByName(String name);

    void filterByAge(int age);

}
