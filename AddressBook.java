package addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Getters and Setters are used to set and get values of the contacts in the Address Book
Address Book consist of Contact details :First Name,Last Name,Address,City,State,Zip,Phone Numberand Email
 UC_1 : Ability to create a Contacts in Address Book
 UC_2 : Add contacts into Address Book
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
        A.viewContacts();
    }
}
