public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        //Created New classes that inherit from the animal class.
        Dog d = new Dog();
        print(d.eat()); // overrides animal eat method
        print(d.sleep()); // overrides animal sleep method
        print(d.bark()); // specific to dog class (encapsulation)

        Mouse m = new Mouse();
        print(m.eat());
        print(m.sleep());
        print(m.squeak());

    }

    private static void print(String s) {
        System.out.println(s);
    }
}