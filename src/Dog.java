public class Dog extends Animal{

    public Dog() {
        super();
        System.out.println("Dog runs excitedly!");
    }

    @Override
    public String sleep() {
        return "A dog sleeps loudly...";
    }

    @Override
    public String eat() {
        return "A dog eats anything...";
    }

    public String bark() {
        return "A dog barks at you...";
    }

}
