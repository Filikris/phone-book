package com.task.phonebook;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddContactMenuAction implements MenuAction{
    Scanner in;
    ContactsService service;

    public AddContactMenuAction(ContactsService service, Scanner in) {
        this.in = in;
        this.service = service;
    }

    @Override
    public void doAction() {
        System.out.println("Enter name and phone number new contact: ");
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Phone: ");
        String phone = in.nextLine();
        String regex = "(\\+380|380|80|0)(\\d{9})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        if (matcher.matches()) {
            Contact contact = new Contact(name, phone);
            service.add(contact);
        } else {
            System.out.println("Incorrect phone number");
        }
    }

    @Override
    public String getName() {
        return "Add contact";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
