package com.company.designPatterns.state;

public class FilteringByAgeState implements FilterState {
    private CurrentState currentState;
    private int age;

    public FilteringByAgeState(CurrentState currentState, int age) {
        this.currentState = currentState;
        this.age = age;
    }

    @Override
    public void displayUserList() {
        System.out.println("Users with age greater than " + age + ":");
        for (User user : currentState.getUserList()) {
            if (user.getAge() > age) {
                System.out.println(user.toString());
            }
        }
        currentState.setCurrentState(currentState.getUserListFilteringByAgeState(age));
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
