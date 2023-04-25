package com.company.designPatterns.state;

import java.util.ArrayList;
import java.util.List;

public class CurrentState {
    private FilterState currentState;
    private List<User> userList;

    public CurrentState() {
        this.userList = new ArrayList<User>();
        this.currentState = new DisplayState(this);
    }

    public void setCurrentState(FilterState state) {
        this.currentState = state;
    }

    public void showAllUsers() {
        this.currentState.displayUserList();
    }

    public void filterByName(String name) {
        this.currentState.filterByName(name);
    }

    public void filterByAge(int age) {
        this.currentState.filterByAge(age);
    }

    public FilterState getUserListDisplayState() {
        return new DisplayState(this);
    }

    public FilterState getUserListFilteringByNameState(String name) {
        return new FilteringByNameState(this, name);
    }

    public FilterState getUserListFilteringByAgeState(int age) {
        return new FilteringByAgeState(this, age);
    }

    public List<User> getUserList() {
        return userList;
    }

    public void addUser(User user) {
        userList.add(user);
    }
}
