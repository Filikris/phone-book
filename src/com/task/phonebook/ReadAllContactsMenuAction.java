package com.task.phonebook;

import java.util.List;

public class ReadAllContactsMenuAction implements MenuAction {
    ContactsService service;

    public ReadAllContactsMenuAction(ContactsService service) {
        this.service = service;
    }

    @Override
    public void doAction() {
        List <Contact> contacts = service.getAll();
        for (int i = 0; i < contacts.size(); i++) {
            System.out.print((i + 1) + " -");
            System.out.println(contacts.get(i));
        }
        System.out.println();
    }

    @Override
    public String getName() {
        return "Read contacts";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
