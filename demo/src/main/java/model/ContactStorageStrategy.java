package model;

import java.util.List;

public interface ContactStorageStrategy {
    void addContact(String name, String phoneNumber);
    List<Contact> getAllContacts();
}
