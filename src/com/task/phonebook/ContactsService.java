package com.task.phonebook;

public interface ContactsService {
    void add(Contact contact);
    ContactsList getAll();
    void remove(int index);
}
