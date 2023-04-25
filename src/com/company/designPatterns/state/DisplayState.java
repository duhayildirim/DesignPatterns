package com.company.designPatterns.state;

public class DisplayState implements FilterState {
    private CurrentState currentState;

    public DisplayState(CurrentState currentState) {
        this.currentState = currentState;
    }

    @Override
    public void displayUserList() {
        System.out.println("All Users:");
        for (User user : currentState.getUserList()) {
            System.out.println(user.toString());
        }
        currentState.setCurrentState(currentState.getUserListDisplayState());
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
