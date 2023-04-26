package com.company.designPatterns.state;

import java.util.List;

public interface UserFilter {
    List<User> filter(List<User> users);
}
