package factory;

public class Test {
    public static void main(String[] args) {
        DogFactory df=new DogFactory();
        Dog d=(Dog) df.CreateAnimal();
        d.eat();
    }
}
