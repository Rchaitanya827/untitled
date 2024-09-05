package org.example.java8;

import java.util.List;

public class User {
    private String name;
    private String phoneNumber;
    private List<String> email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public User(String name, String phoneNumber, List<String> email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
