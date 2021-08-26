import java.util.*;

public class Application {

    String firstName;
    String lastName;
    String address;
    String eMail;

    ArrayList<String> addressBookEntry = new ArrayList<>();


    public void addAnEntry() {

        String addAFirstName = "What is the person's First Name?";
        String addALastName = "What is the person's Last Name?";
        String addAnAddress = "What is the person's Address";
        String addAnEMail = "What is the person's E-Mail Address?";
        Scanner scan = new Scanner(System.in);

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
        System.out.println("Here is what you have entered:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("E-mail: " + eMail);
        UI.Separator();
        int index = 1;
        addressBookEntry.add(index, firstName + " " + lastName + " " + address + " " + eMail);
        index++;
        Menu mainMenu = new Menu();
        mainMenu.Init();
    }

    public void printAddressBook(List<String> addressBookEntry){

        for (int i = 0; i < addressBookEntry.size(); i++){
            System.out.println(addressBookEntry.get(i));
        }

    }

    public void removeAnEntry() {
        UI.Header("Remove An Entry");
    }

    public void searchForAnEntry(){
        UI.Header("Search for An Entry");
    }

    public void printAddressBook(){
        UI.Header("Print the Address Book");
    }

    public void deleteAddressBook(){
        UI.Header("Delete the Address Book");
    }
}


