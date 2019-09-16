public class Mouse extends Animal{
    public Mouse() {
        super();
        System.out.println("I am Deadmau5");
    }

    @Override
    public String sleep() {
        return "A mouse sleeps comfortably...";
    }

    @Override
    public String eat() {
        return "A mouse eats cheese...";
    }

    public String squeak() {
        return "EDM plays...";
    }

}
