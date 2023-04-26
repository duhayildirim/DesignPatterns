package com.company.designPatterns.state;

import java.util.ArrayList;
import java.util.List;

public class NameFilter implements UserFilter {
    private String prefix;

    public NameFilter(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public List<User> filter(List<User> users) {
        List<User> filteredUsers = new ArrayList<>();

        for (User user : users) {
            if (user.getName().startsWith(prefix)) {
                filteredUsers.add(user);
            }
        }

        return filteredUsers;
    }
}
