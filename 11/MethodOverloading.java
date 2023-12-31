/*Method overriding in Java is a mechanism that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. This is done to provide a specialized behavior for that method in the subclass. Here's an illustration of method overriding in Java:*/

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        genericAnimal.makeSound(); // Output: Animal makes a sound
        dog.makeSound();            // Output: Dog barks
        cat.makeSound();            // Output: Cat meows
    }
}

/*
In this example:

1. We have a base class `Animal` with a method `makeSound()`.

2. We create two subclasses, `Dog` and `Cat`, which extend the `Animal` class. These subclasses override the `makeSound()` method with their own specific implementations.

3. In the `main` method, we create instances of `Animal`, `Dog`, and `Cat`. When we call the `makeSound()` method on each of these objects, the overridden method in the respective subclass is invoked, providing specialized behavior.

This demonstrates how method overriding allows you to provide different implementations of the same method in different subclasses, achieving polymorphism and runtime binding in Java.
*/
