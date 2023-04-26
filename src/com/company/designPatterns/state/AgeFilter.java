package com.company.designPatterns.state;

import java.util.ArrayList;
import java.util.List;

public class AgeFilter implements UserFilter {
    private int minAge;

    public AgeFilter(int minAge) {
        this.minAge = minAge;
    }

    @Override
    public List<User> filter(List<User> users) {
        List<User> filteredUsers = new ArrayList<>();

        for (User user : users) {
            if (user.getAge() >= minAge) {
                filteredUsers.add(user);
            }
        }

        return filteredUsers;
    }
}
