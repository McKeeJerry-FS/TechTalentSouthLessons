public class Pet {

    private String name;
    private int age;
    private String location;
    private String type;

    // Constructor with no-args
    public Pet() { }

    // Constructor with args (Overloaded)
    public Pet (String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    // Methods to get or set information
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Methods associated with the class
    public static void bark() {
        System.out.println("woof woof!");
    }
}
