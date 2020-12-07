package com.task.phonebook;

import java.util.Scanner;

public class RemoveContactMenuAction implements MenuAction {

    ContactsService service;
    Scanner in;

    public RemoveContactMenuAction(ContactsService service, Scanner in) {
        this.service = service;
        this.in = in;
    }

    @Override
    public void doAction() {
        System.out.println("Choose contact to remove: ");
        new ReadAllContactsMenuAction(service).doAction();

        System.out.println("Enter contact's number: ");
        int ch = in.nextInt();
        in.nextLine();

        int index = ch - 1;

        if (index >= 0 && index < service.getAll().size()) {
            service.remove(index);
        }

    }

    @Override
    public String getName() {
        return "Remove contact";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
