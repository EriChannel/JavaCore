public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //Upcasting
        Animal animal = new Cat();
        animal.sound();
        //animal.eat(); //Loi

        //Downcasting
        Animal animal2 = new Dog();
        //Dog dog = (Dog) animal2;

        animal2.sound();
        ((Dog) animal2).eat();
    }
}
