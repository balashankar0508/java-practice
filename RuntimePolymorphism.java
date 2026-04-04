public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Output: Dog barks
        myCat.sound(); // Output: Cat meows
    }
}
//Method Overriding - Runtime Polymorphism
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}


class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
