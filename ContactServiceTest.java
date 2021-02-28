//Author Name: Fabian Weiand
//Date: 1/23/2021
//Course ID: CS 320
//Description: This code creates the Contact object with a constructor, getters and setters.

package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.ContactService;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactServiceTest {

    // Testing to see if contacts can bee added and if non-unique Id throws exception
    @Test
    void testAddContact() {
        ContactService.addContact("1234567890", "Fabian", "Weiand", "5558675309", "Hollywood");
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getTaskID().equals("1234567890"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getFirstName().equals("Fabian"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getLastName().equals("Weiand"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getPhone().equals("5558675309"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getAddress().equals("Hollywood"));

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ContactService.addContact("1234567890", "John", "Smith", "5554138282", "Vegas");});

        ContactService.deleteContact("1234567890");
    }

    // Testing to see if an added contact can be removed using contact ID
    @Test
    void testDeleteContact(){
        ContactService.addContact("1234567890", "Fabian", "Weiand", "5558675309", "Hollywood");
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getTaskID().equals("1234567890"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getFirstName().equals("Fabian"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getLastName().equals("Weiand"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getPhone().equals("5558675309"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getAddress().equals("Hollywood"));

        ContactService.deleteContact("1234567890");
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            ContactService.contacts.get(ContactService.contacts.size()-1).getTaskID().equals("1234567890");});
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            ContactService.contacts.get(ContactService.contacts.size()-1).getFirstName().equals("Fabian");});
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            ContactService.contacts.get(ContactService.contacts.size()-1).getLastName().equals("Weiand");});
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            ContactService.contacts.get(ContactService.contacts.size()-1).getPhone().equals("5558675309");});
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            ContactService.contacts.get(ContactService.contacts.size()-1).getAddress().equals("Hollywood");});
    }

    // Testing to see if an added contact can be updated with new values
    @Test
    void testUpdateContact(){
        ContactService.addContact("1234567890", "Fabian", "Weiand", "5558675309", "Hollywood");
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getTaskID().equals("1234567890"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getFirstName().equals("Fabian"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getLastName().equals("Weiand"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getPhone().equals("5558675309"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getAddress().equals("Hollywood"));

        ContactService.updateContact("1234567890", "John", "Smith", "5554138282", "Vegas");
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getTaskID().equals("1234567890"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getFirstName().equals("John"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getLastName().equals("Smith"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getPhone().equals("5554138282"));
        assertTrue(ContactService.contacts.get(ContactService.contacts.size()-1).getAddress().equals("Vegas"));

        ContactService.deleteContact("1234567890");
    }

}