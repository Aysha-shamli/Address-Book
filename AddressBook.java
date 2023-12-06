package addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Getters and Setters are used to set and get values of the contacts in the Address Book
Address Book consist of Contact details :First Name,Last Name,Address,City,State,Zip,Phone Numberand Email
 UC_1 : Ability to create a Contacts in Address Book
 UC_2 : Add contacts into Address Book
 UC_3 : Edit contact in the Address Book
 */
public class AddressBook {
    private List<Contacts> data;
    public AddressBook() {
        this.data = new ArrayList<>();
    }
    public static void display(){
        System.out.println("Welcome to Address Book Program");
    }
    public void addContact(Contacts contact) {
        data.add(contact);
    }
    public void editContact(String firstName, String lastName) {
        for (Contacts contact : data) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Editing Contact: " + firstName + " " + lastName);
                System.out.print("Enter New Address: ");
                String newAddress = scanner.nextLine();
                System.out.print("Enter New City: ");
                String newCity = scanner.nextLine();
                System.out.print("Enter New State: ");
                String newState = scanner.nextLine();
                System.out.print("Enter New Zip: ");
                String newZip = scanner.nextLine();
                System.out.print("Enter New Phone Number: ");
                String newPhoneNumber = scanner.nextLine();
                System.out.print("Enter New Email: ");
                String newEmail = scanner.nextLine();

                contact.setAddress(newAddress);
                contact.setCity(newCity);
                contact.setState(newState);
                contact.setZip(newZip);
                contact.setPhoneNumber(newPhoneNumber);
                contact.setEmail(newEmail);

                System.out.println("Contact edited successfully!");
                return;
            }
        }
        System.out.println("Contact not found with the given name.");
    }
    public void viewContacts() {
        for (Contacts contact : data) {
            System.out.println("First Name: " + contact.getFirstName());
            System.out.println("Last Name: " + contact.getLastName());
            System.out.println("Address: " + contact.getAddress());
            System.out.println("City: " + contact.getCity());
            System.out.println("State: " + contact.getState());
            System.out.println("Zip: " + contact.getZip());
            System.out.println("Phone Number: " + contact.getPhoneNumber());
            System.out.println("Email: " + contact.getEmail());
        }
    }

    public static void main(String[] args) {

        display();

        Scanner scanner = new Scanner(System.in);

        AddressBook A = new AddressBook();

        System.out.print("Enter the number of contacts to add: ");
        int numberOfContacts = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfContacts; i++) {
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            System.out.print("Enter City: ");
            String city = scanner.nextLine();
            System.out.print("Enter State: ");
            String state = scanner.nextLine();
            System.out.print("Enter Zip: ");
            String zip = scanner.nextLine();
            System.out.print("Enter Phone Number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            Contacts newContact = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, email);
            A.addContact(newContact);
        }

        System.out.print("Enter First Name of the contact to edit: ");
        String editFirstName = scanner.nextLine();
        System.out.print("Enter Last Name of the contact to edit: ");
        String editLastName = scanner.nextLine();
        A.editContact(editFirstName, editLastName);

        A.viewContacts();
    }
}
