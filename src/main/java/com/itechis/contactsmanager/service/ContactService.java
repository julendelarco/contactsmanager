package com.itechis.contactsmanager.service;

import com.itechis.contactsmanager.exception.UserNotFoundException;
import com.itechis.contactsmanager.model.Contact;
import com.itechis.contactsmanager.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    private final ContactRepo contactRepo;

    @Autowired
    public ContactService(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    public Contact addContact(Contact contact) {
        contact.setName("julen");
        return contactRepo.save(contact);
    }

    public List<Contact> findAllContacts() {
        return contactRepo.findAll();
    }

    public Contact updateContact(Contact contact){
        return contactRepo.save(contact);
    }

    public Contact findContactById(Long id){
        return contactRepo.findContactById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deleteContact(Long id){
        contactRepo.deleteContactById(id);
    }
}
