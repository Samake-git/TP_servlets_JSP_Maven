package com.odk.contacts.app;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    private List<Contact> contacts = new ArrayList<>();
    private int nextId = 1;

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contact.setId(nextId++);
        contacts.add(contact);
    }

    public void deleteContact(int id) {
        contacts.removeIf(contact -> contact.getId() == id);
    }

    public void updateContact(Contact updatedContact) {
        for (Contact contact : contacts) {
            if (contact.getId() == updatedContact.getId()) {
                contact.setNom(updatedContact.getNom());
                contact.setPrenom(updatedContact.getPrenom());
                contact.setNumero(updatedContact.getNumero());
                contact.setCompetence(updatedContact.getCompetence());
                break;
            }
            else{
                System.out.println("Une erreur c'est produit");
            }
        }
    }
}
