import java.util.*;



public class Menu {

    public void Init() {
        Display(1);
    }

    private void Display(int menuOption) {
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Add an Entry");
        menuItems.add("Remove an Entry");
        menuItems.add("Search for an Entry");
        menuItems.add("Print Address Book");
        menuItems.add("Delete Address Book");

        UI.Header("Main Menu");
        for (String item : menuItems) {
            System.out.println(menuOption + ". " + item);
            menuOption++;
        }

        System.out.println();
        System.out.println("0. Quit");
        System.out.println();
        UI.Separator();
        System.out.println("What would you like to do today?");
        Scanner scan = new Scanner(System.in);
        int userChoice = scan.nextInt();
        Application app = new Application();
        switch (userChoice) {
            case 1: app.addAnEntry();
                break;
            case 2: app.removeAnEntry();
                break;
            case 3: app.searchForAnEntry();
                break;
            case 4: app.printAddressBook();
                break;
            case 5: app.deleteAddressBook();
                break;
            case 0:
               break;
            default:
                System.out.println("Please choose a valid option");
                Menu mainMenu = new Menu();
                mainMenu.Init();
                break;
        }
    }






}




