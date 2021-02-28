//Author Name: Fabian Weiand
//Date: 1/23/2021
//Course ID: CS 320
//Description: This code creates the Contact object with a constructor, getters and setters.

package service;

public class Contact {

    //The required variables for the contact class
    String taskID;
    String firstName;
    String lastName;
    String phone;
    String address;

    //constructor
    public Contact(String contactID, String firstName, String lastName, String phone, String address) {
        if(contactID == null || contactID.length()>10){
            throw new IllegalArgumentException("Invalid name");
        }
        if(firstName == null || firstName.length()>10){
            throw new IllegalArgumentException("Invalid first name");
        }
        if(lastName == null || lastName.length()>10){
            throw new IllegalArgumentException("Invalid last name");
        }
        if(phone == null || phone.length()!=10){
            throw new IllegalArgumentException("Invalid phone number");
        }
        if(address == null || address.length()>30){
            throw new IllegalArgumentException("Invalid address");
        }

        this.taskID = contactID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;

    }

    //Contact class getters
    public String getTaskID() {
        return taskID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    //Contact Class setters
    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
