import java.util.*;

public class Application {

    // Fields
    String firstName;
    String lastName;
    String address;
    String eMail;

    ArrayList<String> addressBookEntry= addAnEntry();


    public ArrayList<String> addAnEntry() {
        // variables
        String addAFirstName = "What is the person's First Name?";
        String addALastName = "What is the person's Last Name?";
        String addAnAddress = "What is the person's Address";
        String addAnEMail = "What is the person's E-Mail Address?";

        Scanner scan = new Scanner(System.in);

        String firstName;
        String lastName;
        String address;
        String eMail;

        // Address Entry
        UI.Header("Add An Entry");
        System.out.println(addAFirstName);
        firstName = scan.nextLine();
        UI.Separator();
        System.out.println(addALastName);
        lastName = scan.nextLine();
        UI.Separator();
        System.out.println(addAnAddress);
        address = scan.nextLine();
        UI.Separator();
        System.out.println(addAnEMail);
        eMail = scan.nextLine();
        UI.Separator();

        // Entry Confirmation
        System.out.println("Here is what you have entered:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("E-mail: " + eMail);
        UI.Separator();

        // Continuation of the application - adding entry to ArrayList
        System.out.println("Please press any key to continue");
        scan.next();
        //ArrayList<String> addressBookEntry = new ArrayList<>();
        int index = 0;
        addressBookEntry.add(index, firstName + " " + lastName + " " + address + " " + eMail);
        index++;

        // Return to Main Menu
        System.out.println(4);
        Menu main = new Menu();
        System.out.println(5);
        main.Init();
        System.out.println(6);
        return addressBookEntry;
    }

    public void viewAddressBook(ArrayList<String> addressBookEntry){

        for (int i = 0; i < addressBookEntry.size(); i++){
            System.out.println(addressBookEntry.get(i));
        }

    }

    public void removeAnEntry() {
        UI.Header("Remove An Entry");
        // printAddressBook(addressBookEntry);
        Scanner scan = new Scanner(System.in);
        System.out.println("Press RETURN to continue");
        scan.next();
        Menu mainMenu = new Menu();
        mainMenu.Init();
    }

    public void searchForAnEntry(){
        UI.Header("Search for An Entry");
        Scanner scan = new Scanner(System.in);
        System.out.println("Press RETURN to continue");
        scan.next();
        Menu mainMenu = new Menu();
        mainMenu.Init();
    }

    public void printAddressBook(){
        UI.Header("Print the Address Book");
        viewAddressBook(addressBookEntry);
        Scanner scan = new Scanner(System.in);
        System.out.println("Press RETURN to continue");
        scan.next();
        Menu mainMenu = new Menu();
        mainMenu.Init();
    }

    public void deleteAddressBook(){
        UI.Header("Delete the Address Book");
        System.out.println("ARE YOU SURE YOU WANT TO DELETE THE ADDRESS BOOK?");
        UI.Separator();
        System.out.println("Press 1 to DELETE");
        System.out.println("Press 2 to return to the Main Menu");
        Scanner scan = new Scanner(System.in);
        int userChoice = scan.nextInt();
        if (userChoice == 1) {
            addressBookEntry.clear();
            System.out.println("The Address Book has been DELETED!!!");
            UI.Separator();
            System.out.println("Press any key to return to the main menu.");
            scan.next();
            Menu main = new Menu();
            main.Init();
        } else if (userChoice == 2){
            System.out.println("Returning to the main menu");
            UI.Separator();
            System.out.println("Press any key to continue");
        } else {
            System.out.println("Please choose a valid option");
            UI.Separator();
            System.out.println("Press any key to continue");
            scan.next();
            deleteAddressBook();
        }

    }
}


