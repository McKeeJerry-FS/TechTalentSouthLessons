public class UI {

    // reuseable methods to create a UI for the terminal
    public static void Header(String text){
        System.out.println("======================================");
        System.out.println(text.toUpperCase());
        System.out.println("======================================");

    }

    public static void Separator(){
        System.out.println("**************************************");
        System.out.println();
    }
}

