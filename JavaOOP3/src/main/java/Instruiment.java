public abstract class Instruiment {

    private String name;
    private String type;

    public abstract void createSound();

    public void doThing(){
        System.out.println("This instrument did a thing");
    }
}
