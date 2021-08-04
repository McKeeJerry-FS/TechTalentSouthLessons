import java.util.Locale;
import java.util.Scanner;

public class Aquarium {

    // Variables
    private String aquariumType;
    private int volume;
    private boolean setup;

    // Constructor no-args
    public Aquarium () {

    }
    // Constructor w/args (Overloaded)
    public Aquarium (String aquariumType, int volume, boolean setup) {
        this.aquariumType = aquariumType;
        this.volume = volume;
        this.setup = setup;
    }

    // Constructor with two of three args (Overloaded)
    public Aquarium(String aquariumType, int Volume) {
        this.aquariumType = aquariumType;
        this.volume = volume;
    }

    // get information from variables
    public String getAquariumType() {
        return aquariumType;
    }
    public int getVolume(int volume) {
        return volume;
    }
    public boolean getSetup(boolean setup) {
        return setup;
    }

    // set information to variables
    public void setAquariumType() {
        this.aquariumType = aquariumType;
    }
    public void setVolume() {
        this.volume = volume;
    }
    public void setSetup() {
        this.setup = setup;
    }

    // Methods tied to the class
    public void isSetup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is this aquarium setup?");
        String aquariumSetAnswer = scanner.nextLine().toUpperCase();
        if (aquariumSetAnswer == "Y") {
            System.out.println("Great! In a few days we can add some fish and invertibrates.");
        } else if (aquariumSetAnswer == "N") {
            System.out.println("Well, there's no time like today to set it up.");
        }

    }




}
