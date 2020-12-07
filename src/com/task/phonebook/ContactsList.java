package com.task.phonebook;

import java.util.Arrays;

public class ContactsList {
    private Contact [] contacts = new Contact[4];
    private int length = 0;

    public void add (Contact contact) {
        if (length >= contacts.length) {
            int newCapacity = (contacts.length * 3)/2;
            contacts = Arrays.copyOf(contacts, newCapacity);
        }
        contacts[length] = contact;
        length = length+1;
    }

    public Contact get(int index) {
        return contacts[index];
    }

    public void set(int index, Contact contact) {
        this.contacts[index] = contact;
    }

    public int size(){
        return length;
    }

    public void remove(int index) {
        checkExistsIndex(index);
        length = length - 1;
        for (int i = index; i < length; i++) {
            contacts[index] = contacts[index + 1];
        }
        for (int i = length; i < contacts.length; i++) {
            contacts[i] = null;
        }
    }

    private void checkExistsIndex (int index) {
        if (index>= contacts.length || index<0) {
            throw new IndexOutOfBoundsException();
        }
    }
}
