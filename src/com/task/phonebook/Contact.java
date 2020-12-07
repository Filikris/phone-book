package com.task.phonebook;

public class Contact {
     private String name;
     private String number;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact:" + name + " " + number;
    }
}
