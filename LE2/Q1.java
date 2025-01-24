/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Test {
    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.prepareVoice();
    }
}
abstract class Animal {
    abstract void makeSound();
}
class Cow extends Animal {
    void makeSound() {
        System.out.println("Moo");
    }
}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}
class Pig extends Animal {
    void makeSound() {
        System.out.println("Oink");
    }
}
class Goat extends Animal {
    void makeSound() {
        System.out.println("Baa");
    }
}
class Lion extends Animal {
    void makeSound() {
        System.out.println("Roar");
    }
}
class Voice {
    void prepareVoice() {
        Animal[] animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        hear(animals);
    }
    void hear(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeSound();  
        }
    }
}
