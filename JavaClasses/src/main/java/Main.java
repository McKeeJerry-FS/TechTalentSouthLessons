public class Main {

    public static void main(String[]Args) {

        // Using the Pet Class
        Pet dog = new Pet("Perri", 1, "Home", "dog");
        dog.getName();
        dog.setAge(2);
        System.out.println("My dog is " + dog.getAge() + " years old.");

        // Using the Aquarium Class
        Aquarium freshwater = new Aquarium("freshwater", 10, true);
        System.out.println(freshwater.isSetup(false));
    }


}
