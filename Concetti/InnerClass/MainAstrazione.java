package Concetti.InnerClass;
abstract class Animal{
    public abstract void animalSound();
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("the pig says wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("the dog says bow");
    }
}

public class MainAstrazione {
    public static void main(String[] args){
        //Animal myAnimal = new Animal();
        Animal mypig = new Pig();
        Animal mydog = new Dog();
        //myAnimal.animalSound();
        mypig.animalSound();
        mydog.animalSound();
    }
}
