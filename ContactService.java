//Author Name: Fabian Weiand
//Date: 1/23/2021
//Course ID: CS 320
//Description: This code creates the Contact object with a constructor, getters and setters.

package service;

import java.util.ArrayList;

public class ContactService {

    public static ArrayList<Contact> contacts = new ArrayList<>();


    public static void addContact(String contactID, String firstName, String lastName, String phone, String address) {
        for (Contact value : contacts) {
            if (contactID.equals(value.taskID)) {
                throw new IllegalArgumentException("Duplicate ID");
            }
        }
        Contact contact = new Contact(contactID, firstName, lastName, phone, address);
        contacts.add(contact);
        System.out.println("Contact Added");
    }

    public static void deleteContact(String contactID) {
        for(int i=0; i < contacts.size(); i++ ) {
            if (contactID.equals(contacts.get(i).taskID)) {
                contacts.remove(i);
                System.out.println("Contact Removed");
            }
        }
    }

    public static void updateContact(String contactID, String firstName, String lastName, String phone, String address) {
        for (Contact contact : contacts) {
            if (contactID.equals(contact.taskID)) {
                contact.setFirstName(firstName);
                contact.setLastName(lastName);
                contact.setPhone(phone);
                contact.setAddress(address);
                System.out.println("Contact Updated");
            }
        }
    }

    public static void printContacts(){
        for(int i=0; i < contacts.size(); i++ ) {
            System.out.println("CONTACT #" + (i+1));
            System.out.println("Contact ID: " + contacts.get(i).getTaskID());
            System.out.println("Contact First Name: " + contacts.get(i).getFirstName());
            System.out.println("Contact Last Name" + contacts.get(i).getLastName());
            System.out.println("Contact Phone: " + contacts.get(i).getPhone());
            System.out.println("Contact Address: " + contacts.get(i).getAddress());
            System.out.println("");
        }
    }

}

