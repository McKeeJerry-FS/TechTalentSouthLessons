import java.util.*;

public class Main {
    public static void main(String[] args){
        Application add = new Application();
        ArrayList<String> menuItems = new ArrayList<String>();
        menuItems.add("Add an Entry");
        menuItems.add("Remove an Entry");
        menuItems.add("Search");
        menuItems.add("Print Address Book");
        menuItems.add("Delete Address Book");



        Menu mainMenu = new Menu();
        mainMenu.Init("Main Menu", menuItems);
    }

    // Things to do
    // Create an Entry method to the program - List of strings accessed by a switch
    // Add an Entry
    // Remove an Entry
    // Search for a specific entry
    // Print out the address book
    // Delete Book
    // Quit the program

    // Start with creating an entry point



}
