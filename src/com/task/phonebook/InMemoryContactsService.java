package com.task.phonebook;

import java.util.ArrayList;
import java.util.List;

public class InMemoryContactsService implements ContactsService {
    private List <Contact> contactsList;

    public InMemoryContactsService() {
        contactsList = new ArrayList<>();
    }

    @Override
    public void add(Contact contact) {
        contactsList.add(contact);
    }

    @Override
    public List <Contact> getAll() {
        return contactsList;
    }

    @Override
    public void remove(int index) {
        contactsList.remove(index);
    }
}
