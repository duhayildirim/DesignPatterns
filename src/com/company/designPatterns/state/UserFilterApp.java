package com.company.designPatterns.state;

import java.util.Arrays;
import java.util.List;

public class UserFilterApp {
    public static void main(String[] args) {
        // Örnek kullanıcı listesi
        List<User> users = Arrays.asList(
                new User("Ali", 30),
                new User("Ahmet", 25),
                new User("Mehmet", 40),
                new User("Can", 20)
        );

        // Durum nesnesini oluştur
        UserFilterState state = new UserFilterState(users);

        // Filtreleme işlevini çağır
        state.setFilter(new AgeFilter(30));

        // Filtrelenmiş kullanıcıları al
        List<User> filteredUsers = state.getFilteredUsers();

        // Filtrelenmiş kullanıcıları yazdır
        for (User user : filteredUsers) {
            System.out.println(user.getName() + " - " + user.getAge());
        }
    }
}
