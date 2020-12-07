package com.task.phonebook;

import java.util.Scanner;

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
        Contact contact = new Contact(name, phone);
        service.add(contact);
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
