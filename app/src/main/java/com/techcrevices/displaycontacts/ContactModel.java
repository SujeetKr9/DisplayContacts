package com.techcrevices.displaycontacts;

public class ContactModel {
    String name;
    String mobile;

    public ContactModel(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }
}
