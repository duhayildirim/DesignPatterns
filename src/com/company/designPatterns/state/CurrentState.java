package com.company.designPatterns.state;

public class CurrentState {
    private UserListState currentState;
    private List<User> userList;

    public CurrentState() {
        this.userList = new ArrayList<User>();
        this.currentState = new UserListDisplayState(this);
    }

    public void setCurrentState(UserListState state) {
        this.currentState = state;
    }

    public void showAllUsers() {
        // Tüm kullanıcıları listeleme işlemi
    }

    public void filterByName(String name) {
        // İsimle filtreleme işlemi
    }

    public void filterByAge(int age) {
        // Yaşa göre filtreleme işlemi
    }

    public UserListState getUserListDisplayState() {
        return new UserListDisplayState();
    }
}
