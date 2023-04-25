package com.company.designPatterns.state;

public interface FilterState {

    void displayUserList();
    void filterByName(String name);
    void filterByAge(int age);

}
