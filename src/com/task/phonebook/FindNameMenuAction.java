package com.task.phonebook;

import java.util.List;
import java.util.Scanner;

public class FindNameMenuAction implements MenuAction {
    ContactsService service;
    Scanner in;

    public FindNameMenuAction(ContactsService service, Scanner in) {
        this.service = service;
        this.in = in;
    }

    @Override
    public void doAction() {
        System.out.println("Enter name or part of name: ");
        String name = in.nextLine();
        List<Contact> contacts = service.getAll();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().startsWith(name)) {
                System.out.print((i + 1) + " -");
                System.out.println(contacts.get(i));
            }
        }
        System.out.println();
    }

    @Override
    public String getName() {
        return "Find name contact";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
