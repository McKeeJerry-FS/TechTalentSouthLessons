import java.util.*;



public class Menu {
    String title;
    ArrayList<String> menuItems;


    public void Init(String title, ArrayList<String> _menuItems) {
        Display(1);
    }

    private void Display(int menuOption) {
        UI.Header(title);
        for (String item : menuItems) {
            System.out.println(menuOption + ". " + item);
            menuOption++;
        }

        System.out.println();
        System.out.println("0. Quit");
    }






}




