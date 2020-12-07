package com.task.phonebook;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        Menu menu = new Menu(in);
        ContactsService contactsService = new InMemoryContactsService();

        menu.addAction(new AddContactMenuAction(contactsService, in));
        menu.addAction(new ReadAllContactsMenuAction(contactsService));
        menu.addAction(new RemoveContactMenuAction(contactsService, in));
        menu.addAction(new ExitAction());

        menu.run();

    }
}
