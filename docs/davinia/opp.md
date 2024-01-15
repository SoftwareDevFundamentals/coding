# Object-Oriented Programming (OOP) Pillars
Object-Oriented Programming (OOP) is a programming paradigm that relies on the concept of "objects" to organize and structure code. Instead of focusing on procedures or functions, OOP centers around the interaction between objects, which are instances of classes.

![](C:\Users\GAMING\IdeaProjects\coding\docs\davinia\Images\opp.png)

OOP is based on four fundamental concepts:


## 1. Encapsulation:
   Encapsulation is a core principle of Object-Oriented Programming (OOP) in Java. It involves combining an object's data (attributes) and behaviors (methods) into a single unit known as a class. Furthermore, encapsulation enables control over access to these data and methods, permitting only regulated interactions from external sources.

By encapsulating, the internal complexities of a class are hidden, presenting a controlled interface for interacting with class objects. This enhances the security and integrity of the data by restricting modifications to specific class methods, thereby facilitating proper validation before any changes are made.

### Advantages
- Encapsulation links data with its related functionalities.
- It keeps variables and methods in one place, which is the "class."
- User actions can be controlled internally.
### Example
```
    public class Person {
    // Private attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to set the name
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the age
    public int getAge() {
        return age;
    }

    // Method to set the age
    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John Doe", 30);

        // Access data through methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modify data through access methods
        person.setAge(31);
        System.out.println("New age: " + person.getAge());
    }
```
In this example, the Person class encapsulates the name and age data and provides public methods to access and modify this data in a controlled way.
## 2. Inheritance:
   Inheritance allows new classes to be defined based on existing ones to reuse code, generating a hierarchy of classes within an application. If a class derives from another, it inherits its attributes and methods and can add new attributes, methods, or redefine inherited ones.


### Advantages
- Code reuse: Allows classes to inherit attributes and methods from a base class.
- Promotes coherence and consistency: By grouping common features into a base class, you ensure that all derived classes maintain a consistent structure and behavior.
- Facilitates extensibility: You can extend an existing class to create a new class that inherits all the features of the base class and then add or modify your own features.
### Example
```
public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog is barking.");
    }
}
```
Using inheritance: You can now create objects of the derived class and access the attributes and methods of both the derived class and the base class.
## 3. Abstraction:
   Abstraction is the process of hiding the details of the implementation from the user, showing only the functionality. In Java, this is done by implementing abstract classes and interfaces.

### Advantages
- Provides a structured way to organize and reuse code.
- Allows multiple inheritance, allowing programmers to work with multiple parent classes and multiple levels of inheritance.
- Helps programmers control access to data, avoiding logic errors and security errors.
- Allows for maximum modularity, making it easier to create and maintain code.
### Example
```
// File: Animal.java
public abstract class Animal {
    public abstract void makeNoise();
    
    public void sleep() {
        System.out.println("Zzzzzz");
    }
}

// File: Cat.java
public class Cat extends Animal {
    public void makeNoise() {
        System.out.println("Meoooowwwww");
    }
}

// File: Dog.java
public class Dog extends Animal {
    public void makeNoise() {
        System.out.println("Woooooof");
    }
}
```
The Animal class is declared as an abstract class and has an abstract method, makeNoise, which was implemented by the subclasses, Dog and Cat.
## 4. Polymorphism:
   Polymorphism refers to the ability of an object to be represented and behave in multiple different ways. It allows objects of different classes to be treated uniformly through a common interface.

Polymorphism allows objects to behave in different ways depending on the context in which they are used. This provides flexibility in the design and implementation of the code, allowing it to be adapted to different situations.

### Advantages
- Allows objects to behave in different ways depending on the context in which they are used, providing flexibility in code design.
- Code simplicity and clarity: By using interfaces or abstract base classes that define a common set of methods, polymorphism helps simplify code logic, improving readability and clarity by focusing on what an object does, not the details of how it does it.
### Example
```
void repair(Vehicle vehicle) {
    System.out.println("Initiating repair");
    System.out.println("Testing accelerator");
    System.out.println("Initial speed: " + vehicle.getSpeed());
    vehicle.accelerate();
    System.out.println("Final speed: " + vehicle.getSpeed());
    System.out.println("Testing reverse");
    vehicle.reverse();
    System.out.println("Ready!");
}
```
This method invokes the accelerate and reverse methods of the vehicle that is sent as a parameter. The advantage this offers is that we can generalize algorithms to work with different types. In this case, this method will work with any class that inherits from Vehicle. 
## References
* https://openwebinars.net/blog/introduccion-a-poo-en-java-encapsulamiento/
* https://www.javatpoint.com/java-oops-concepts
* https://blog.hubspot.es/website/que-es-herencia-java#:~:text=%C2%BFQu%C3%A9%20es%20la%20herencia%20en,herencia%20entre%20clases%20es%20extends.
* https://openwebinars.net/blog/introduccion-a-poo-en-java-encapsulamiento/#:~:text=En%20Java%2C%20la%20encapsulaci%C3%B3n%20se,los%20objetos%20de%20esa%20clase.


