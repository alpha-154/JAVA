package basics_07;



// Superclass (Parent Class)

//1st pair ->  Basic Inheritance Example
class Animal {
    // Field
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public void eat() {
        System.out.println(name + " is eating.");
    }

  
}

// Subclass (Child Class) that inherits from Animal
class Dog extends Animal {

    // Constructor calls the superclass constructor using super()
    public Dog(String name) {
        super(name); // Calls the Animal constructor
    }

    // Additional method specific to Dog
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

//2nd pair  ->> Method Overriding Example
class Animal1 {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Cat extends Animal1 {
    // Override the sound() method
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}


//3rd pair ->> Multilevel Inheritance Example

//Java does not support multiple inheritance directly to avoid complexity 
//and ambiguity. However, it can be achieved using interfaces.
class Animal3 {
    public void breathe() {
        System.out.println("Animal is breathing.");
    }
}

// Mammal inherits Animal
class Mammal extends Animal3 {
    public void feedMilk() {
        System.out.println("Mammal feeds milk.");
    }
}

// Dog inherits Mammal (and indirectly Animal)
class Tiger extends Mammal {
    public void eats() {
        System.out.println("Tiger eats.");
    }
}


// 4th pair ->>  Using `super` to Call Superclass Methods and Constructors
//The `super` keyword is used in the `subclass` to refer to `superclass` methods and constructors.
class Animal4 {
    String name;

    // Constructor
    public Animal4(String name) {
        this.name = name;
    }

    // Method
    public void display() {
        System.out.println("Animal name: " + name);
    }
}

class Dog1 extends Animal4 {
    int age;

    // Constructor using super to call the superclass constructor
    public Dog1(String name, int age) {
        super(name); // Calls Animal(String name)
        this.age = age;
    }

    // Method that calls the superclass method
    public void display() {
        super.display(); // Calls Animal's display()
        System.out.println("Dog's age: " + age);
    }
}

//`final` keyword can prevent inheritance.
// `Abstract Classes` and `Interfaces` offer templates and contracts for subclasses to follow.

// Main class to test inheritance
public class Inheritance {
    public static void main(String[] args) {

        //for pair 1
          // Create a Dog object
          Dog dog = new Dog("Buddy");

          // Access inherited method
          dog.eat(); // Output: Buddy is eating.
  
          // Access Dog-specific method
          dog.bark(); // Output: Buddy is barking.

          //for pair 2
          Cat cat = new Cat();
          cat.sound(); // Output: Cat meows.

          //for pair 3
          Tiger tiger = new Tiger();
          tiger.breathe(); // Output: Animal is breathing.
          tiger.feedMilk(); // Output: Mammal feeds milk.
          tiger.eats(); // Output: Tiger eats.

          //for pair 4
          Dog1 dog1 = new Dog1("Buddy", 3);
        dog1.display();

    }
}
