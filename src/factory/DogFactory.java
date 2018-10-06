package factory;

public class DogFactory implements Factory{
    @Override
    public Animal CreateAnimal() {
        return new Dog();
    }
}
