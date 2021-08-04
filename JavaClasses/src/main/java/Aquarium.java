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





}
