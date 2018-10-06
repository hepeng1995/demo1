package sample_factory;

public class Test {
    public static void main(String[] args) {
       Dog d=(Dog) AnimalFactory.createAnimal("Dog");
       d.eat();
    }
}
