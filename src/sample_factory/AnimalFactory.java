package sample_factory;

public class AnimalFactory {
    public static Animal createAnimal(String name){
        if("Dog".equals(name)){
            return new Dog();
        }
        if("Cat".equals(name)){
            return new Cat();
        }else {
            return null;
        }
    }
}
