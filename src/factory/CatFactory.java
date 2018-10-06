package factory;

public class CatFactory implements Factory{
    @Override
    public Animal CreateAnimal() {
        return new Cat();
    }
}
