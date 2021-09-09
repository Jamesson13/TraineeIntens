package com.example.trainee.beans;

import java.util.Objects;

public class User implements Comparable<User> {
    int userId;
    String firstName;
    String lastName;
    int userAge;


    public User(int userId, String firstName, String lastName, int userAge) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userAge = userAge;
    }

    public User(String firstName, String lastName, int userAge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userAge = userAge;
    }

    public int getUserId() {
        return userId;
    }

    public int getUserAge() {
        return userAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(User user) {
        return user.getUserId();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getUserId() == user.getUserId()
                && getUserAge() == user.getUserAge()
                && getFirstName().equals(user.getFirstName())
                && getLastName().equals(user.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getFirstName(), getLastName(), getUserAge());
    }
}
