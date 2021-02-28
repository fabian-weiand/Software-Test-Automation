//Author Name: Fabian Weiand
//Date: 1/23/2021
//Course ID: CS 320
//Description: This code Test the contact class for specifications based on customer requirements

package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.Contact;

public class ContactTest {

    //Testing  ID For size and null
    @Test
    void testContactIDTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Fabian", "Weiand", "5558675309", "Hollywood" );});
    }
    @Test
    void testContactIDNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Fabian", "Weiand", "5558675309", "Hollywood" );});
    }

    //Testing First Name for size and null
    @Test
    void testContactFirstNameTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Fabian12345", "Weiand", "5558675309", "Hollywood" );});
    }
    @Test
    void testContactFirstNameNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", null, "Weiand", "5558675309", "Hollywood" );});
    }

    //Testing Last Name for size and null
    @Test
    void testContactLastNameTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Fabian", "Weiand12345", "5558675309", "Hollywood" );});
    }
    @Test
    void testContactLastNameNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Fabian", null, "5558675309", "Hollywood" );});
    }

    //Testing Phone for size and null
    @Test
    void testContactPhoneTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Fabian", "Weiand", "5558675309", "Hollywood" );});
    }
    @Test
    void testContactPhoneTooShort() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Fabian", "Weiand", "5558675", "Hollywood" );});
    }
    @Test
    void testContactPhoneNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Fabian", "Weiand", null, "Hollywood" );});
    }

    //Testing Address for size and null
    @Test
    void testContactAddressTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Fabian", "Weiand", "5558675309", "ASmallStreetSomewhereInTheMiddleOfHollywood" );});
    }
    @Test
    void testContactAddressNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Fabian", "Weiand", "5558675309", null);});
    }
}
