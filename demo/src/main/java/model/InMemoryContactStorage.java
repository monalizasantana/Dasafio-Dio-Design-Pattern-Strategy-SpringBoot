package model;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;


@Component
public class InMemoryContactStorage implements ContactStorageStrategy {

    private List<Contact> contacts = new ArrayList<>();

    @Override
    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contacts;
    }
}
