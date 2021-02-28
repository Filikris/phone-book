package com.task.phonebook;

import java.util.List;

public interface ContactsService {
    void add(Contact contact);
    List<Contact> getAll();
    void remove(int index);
}
