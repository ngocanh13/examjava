package examjava2;

import java.util.HashMap;

public class AddressBook {
    private HashMap<String, Contact> contacts;

    public AddressBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.put(name, contact);
        System.out.println("Liên lạc đã được thêm thành công.");
    }

    public void findContactByName(String name) {
        Contact contact = contacts.get(name);
        if (contact != null) {
            System.out.println("Số điện thoại của " + name + ": " + contact.getPhoneNumber());
        } else {
            System.out.println("Không tìm thấy liên lạc.");
        }
    }

    public void displayContacts() {
        System.out.println("Sổ địa chỉ\nLiên lạc\t\tSố điện thoại");
        for (Contact contact : contacts.values()) {
            System.out.println(contact);
        }
    }
}