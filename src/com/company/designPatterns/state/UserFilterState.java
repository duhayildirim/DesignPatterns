package com.company.designPatterns.state;

import java.util.List;

public class UserFilterState {
    private List<User> users;
    private List<User> filteredUsers;
    private UserFilter currentFilter;

    public UserFilterState(List<User> users) {
        this.users = users;
        this.filteredUsers = users;
    }

    public void setFilter(UserFilter filter) {
        this.currentFilter = filter;
        this.filteredUsers = filter.filter(users);
    }

    public List<User> getFilteredUsers() {
        return filteredUsers;
    }

    // Diğer yardımcı metodlar buraya eklenebilir.
}
