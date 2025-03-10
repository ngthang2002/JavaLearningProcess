import java.util.ArrayList;

public class Exercise_44 {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("123456789");
        Contact contact1 = Contact.createContact("John Doe", "123456789");
        Contact contact2 = Contact.createContact("Jane Smith", "987654321");
        Contact contact3 = Contact.createContact("Alice Johnson", "555555555");
        Contact contact4 = Contact.createContact("Bob Brown", "444444444");
        Contact contact5 = Contact.createContact("Charlie Black", "333333333");
        Contact contact6 = Contact.createContact("David White", "222222222");
        Contact contact7 = Contact.createContact("Eve Green", "111111111");

        //add contact
        System.out.println("Adding contacts:");
        mobilePhone.addContact(contact1);
        mobilePhone.addContact(contact2);
        mobilePhone.addContact(contact3);
        mobilePhone.addContact(contact4);

        //update contact
        System.out.println("\n\nUpdating contacts:");
        mobilePhone.updateContact(contact1, contact5);
        mobilePhone.updateContact(contact2, contact6);
        mobilePhone.updateContact(contact3, contact7);
        mobilePhone.updateContact(contact4, contact1);

        //remove contact
        System.out.println("\n\nRemoving contacts:");
        mobilePhone.removeContact(contact1);
        mobilePhone.removeContact(contact2);
        mobilePhone.removeContact(contact3);
        mobilePhone.removeContact(contact4);

        //query contact
        System.out.println("\n\nQuerying contacts:");
        System.out.println("Querying contact: " + mobilePhone.queryContact("John Doe"));
        System.out.println("Querying contact: " + mobilePhone.queryContact("David White"));
        System.out.println("Querying contact: " + mobilePhone.queryContact("Alice Johnson"));

        //print contact
        System.out.println("\n\nPrinting contacts:");
        mobilePhone.printContacts();

    }

}

class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact) >= 0) {
            System.out.println("Contact already exists.");
            return false;
        }
        myContacts.add(contact);
        System.out.println("Contact added: " + contact.getName());
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index >= 0) {
            myContacts.set(index, newContact);
            System.out.println("Contact updated: " + oldContact.getName() + " to " + newContact.getName());
            return true;
        }
        System.out.println("Contact not found.");
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) >= 0) {
            System.out.println("Contact removed: " + contact.getName());
            myContacts.remove(contact);
            return true;
        }
        System.out.println("Contact not found.");
        return false;
    }

    private int findContact(Contact contact) {
        int index = myContacts.indexOf(contact);
        return index >= 0 ? index : -1;
    }

    private int findContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index >= 0) {
            return myContacts.get(index);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " - " + myContacts.get(i).getPhoneNumber());
        }
    }
}

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}