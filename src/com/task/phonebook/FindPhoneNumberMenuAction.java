package com.task.phonebook;

import java.util.Scanner;

public class FindPhoneNumberMenuAction implements MenuAction {
    ContactsService service;
    Scanner in;

    public FindPhoneNumberMenuAction(ContactsService service, Scanner in) {
        this.service = service;
        this.in = in;
    }

    @Override
    public void doAction() {
        System.out.println("Enter phone number or part of number: ");
        String phone = in.nextLine();
        ContactsList contacts = service.getAll();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getNumber().contains(phone)) {
                System.out.print((i + 1) + " -");
                System.out.println(contacts.get(i));
            }
        }
        System.out.println();
    }

    @Override
    public String getName() {
        return "Find phone number";
    }

    @Override
    public boolean closeAfter() {
        return false;
    }
}
