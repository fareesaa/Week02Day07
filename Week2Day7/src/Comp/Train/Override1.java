package Comp.Train;

class AnimalOver {
    // method in the superclass
    public void eat() {
        System.out.println("I can eat");
    }
}
// Dog inherits Animal
class DogOver extends AnimalOver {
    // overriding theeat() method
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }
    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}
public class Override1 {
    public static void main(String[] args) {
        // create an object of the subclass
        DogOver labrador = new DogOver();
        // call theeat() method
        labrador.eat();
        labrador.bark();
    }
}

//super Keyword
// Dog inherits Animal
class DogOver2 extends Animal {
    // overriding the eat() method
    @Override
    public void eat() {
        // call method of superclass
        super.eat();
        System.out.println("I eat dog food");
    }

    // new method in subclass
    public void bark() {
        System.out.println("I can bark");
    }
}
class Main {
    public static void main(String[] args) {
        // create an object of the subclass
        DogOver2 labrador = new DogOver2();
        // call the eat() method
        labrador.eat();
        labrador.bark();
    }
}


