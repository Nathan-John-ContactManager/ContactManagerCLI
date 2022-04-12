import java.io.IOException;
import java.util.Scanner;

public class ContactManagerTest {

    public static void main(String[] args) throws IOException {

        ContactManagerMethods utilities = new ContactManagerMethods();

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int userInput;
        String newContact;
        do {System.out.println("1. View Contacts");
            System.out.println("2. Add a New Contact");
            System.out.println("3. Search a Contact By Name");
            System.out.println("4. Delete an Existing Contact by Name");
            System.out.println("5. Edit a Contact");
            System.out.println("Exit");
            System.out.println("Enter an option 1, 2, 3, 4, 5, 6");
            userInput = sc1.nextInt();
            if(userInput == 1) utilities.displayContacts();
            else if (userInput == 2) {
                System.out.println("Please enter your new contacts information.");
                newContact = sc2.nextLine();
                utilities.addContact(newContact);
            }


            else if (userInput == 3) {
                System.out.println("Search contacts");
                utilities.searchContact();
            }
            else if (userInput == 4) {
                utilities.deleteContact();
            }
            else if (userInput == 5){
                utilities.editContact();
            }

        }
        while (userInput != 6);


    }
}