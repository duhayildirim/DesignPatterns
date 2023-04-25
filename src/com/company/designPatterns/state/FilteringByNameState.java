package com.company.designPatterns.state;

public class FilteringByNameState implements FilterState {
    private CurrentState currentState;
    private String name;

    public FilteringByNameState(CurrentState currentState, String name) {
        this.currentState = currentState;
        this.name = name;
    }

    @Override
    public void displayUserList() {
        System.out.println("Users with name containing " + name + ":");
        for (User user : currentState.getUserList()) {
            if (user.getName().contains(name)) {
                System.out.println(user.toString());
            }
        }
        currentState.setCurrentState(currentState.getUserListFilteringByNameState(name));
    }

    @Override
    public void filterByName(String name) {
        currentState.setCurrentState(currentState.getUserListFilteringByNameState(name));
    }

    @Override
    public void filterByAge(int age) {
        currentState.setCurrentState(currentState.getUserListFilteringByAgeState(age));
    }
}
