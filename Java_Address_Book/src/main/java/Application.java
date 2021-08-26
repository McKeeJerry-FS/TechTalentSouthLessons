import java.util.*;

public class Application {

    String firstName;
    String lastName;
    String address;
    String eMail;

    ArrayList<String> addressBookEntry = new ArrayList<>();


    private void addAnEntry() {

        String addAFirstName = "What is the person's First Name?";
        String addALastName = "What is the person's Last Name?";
        String addAnAddress = "What is the person's Address";
        String addAnEMail = "What is the person's E-Mail Address?";
        Scanner scan = new Scanner(System.in);

        System.out.println(addAFirstName);
        firstName = scan.nextLine();
        System.out.println(addALastName);
        lastName = scan.nextLine();
        System.out.println(addAnAddress);
        address = scan.nextLine();
        System.out.println(addAnEMail);
        eMail = scan.nextLine();

        System.out.println("Here is what you have entered:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Address: " + address);
        System.out.println("E-mail: " + eMail);

        int index = 1;
        addressBookEntry.add(index, firstName + " " + lastName + " " + address + " " + eMail);
        index++;
    }

    private void viewAddressBook(List<String> addressBookEntry){

        for (int i = 0; i < addressBookEntry.size(); i++){
            System.out.println(addressBookEntry.get(i));
        }

    }

    private void removeAnEntry() {

    }

    private void searchForAnEntry(){

    }

    private void printAddressBook(){

    }

    private void deleteAddressBook(){

    }
}


