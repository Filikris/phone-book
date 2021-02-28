package com.task.phonebook;

import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

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
        List<Contact> contacts = service.getAll();
        IntStream.range(0, contacts.size())
            .filter(i -> contacts.get(i).getNumber().contains(phone))
            .forEach(i -> {
                System.out.print((i + 1) + " -");
                System.out.println(contacts.get(i));
            });
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
