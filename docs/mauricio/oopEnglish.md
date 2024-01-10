# The Four Pillars of Object-Oriented Programming
![Pillars of OOP](https://www.crio.do/blog/content/images/2022/02/Four-pillars-of-Object-Oriented-Programming.png)

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of `objects`, which can contain data in the form of fields (often known as attributes or properties) and code in the form of procedures (known as methods).

## Index
- [Encapsulation](#encapsulation)
- [Abstraction](#abstraction)
- [Inheritance](#inheritance)
- [Polymorphism](#polymorphism)
- [References](#references)

# Encapsulation
![Encapsulation](https://www.crio.do/blog/content/images/2022/01/What-is-Encapsulation.png)
Encapsulation is one of the four fundamental pillars of Object-Oriented Programming (OOP). It acts as a protective shield around instance variables, preventing them from being modified or set to inappropriate values.

## Access Modifiers

To deeply understand Encapsulation, one must be familiar with access modifiers in Java. Classes, attributes, methods, and objects are primarily used to write programs. In Java, there are mainly four levels of visibility:

| Modifier     | Description |
|--------------|-------------|
| `public`     | Visible to any other class everywhere. |
| `private`    | Visible only within the class that defines it. |
| `protected`  | Visible to the class that defines it and its subclasses. |
| `package`    | Visible only within its own package. |

### Example of Encapsulation
`Polygon.java`
```java
package polygon;
public class Polygon {
    protected int edges;
    private String poly_name;

    void printEdges() {
        System.out.print("Number of edges: " + edges);
    }

    public void printInfo() {
        System.out.println("Number of edges: " + edges + "Name of polygon: " + poly_name);
    }
}
```
`Hexagon.java`
```java
package Hexagon;
import polygon.Polygon;

class Hexagon extends Polygon {
    public static void main(String args[]) {
        Hexagon h = new Hexagon();
        h.edges = 6; // Compiles because edges is declared as protected
        h.poly_name = "hexagon"; // Compilation error since private variables cannot be accessed by subclasses
        h.printEdges(); // Compilation error since this method has default access (package)
        h.printInfo(); // Compiles as this method is public
    }
}
```

# Abstraction
Abstraction is a technique to identify useful information that should be visible to a user and to ignore irrelevant details.
For example, one can think of the Linux operating system as a class from which flavors (objects) of Linux are created.
![Abstraction](https://www.crio.do/blog/content/images/2022/02/Linux-OS-1.png)

## Abstraction Concepts

Abstraction uses abstract classes and interfaces to implement abstraction. An `abstract class` may contain abstract methods that have no implementation and are intended to be overridden in derived classes.

| Element        | Use in Abstraction                |
|----------------|-----------------------------------|
| Abstract Class | To declare common structure.      |
| Abstract Method| To compel subclasses to implement specific behaviors. |

### Example of Abstraction
`Vehicle.java`
```java
package transportation;

public abstract class Vehicle {
    private String brand;

    public abstract void startEngine();
    // Other vehicle-related methods
}
```
`Car.java`
```java
package transportation;

public abstract class Vehicle {
    private String brand;

    public abstract void startEngine();
    // Other vehicle-related methods
}
```

# Inheritance

In Java, it is possible to inherit attributes and methods from one class to another. We categorize the concept of "inheritance" into two groups:
- **Subclass (Child)**: the class that inherits from another class.
- **Superclass (Parent)**: the class from which it inherits.

To inherit from a class, the keyword `extends` is used.

### Example of Inheritance

In the following example, the `Car` class (subclass) inherits the attributes and methods of the `Vehicle` class (superclass):

### Example Code
```java
class Vehicle {
    protected String brand = "Ford";        // Vehicle attribute
    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";    // Car attribute
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
```
### Code Explanation

- The `Vehicle` class contains a `brand` attribute and a `honk()` method.
- The `Car` class extends `Vehicle`, which means it inherits its attributes and methods.
- Inside `Car`, we declare an additional attribute called `modelName`.
- In the `main` method, we create a `Car` object, call the inherited `honk()` method, and access the `brand` and `modelName` attributes.

This example demonstrates how inheritance allows for code reuse and the hierarchical relationship between classes in Java.

# Polymorphism

Polymorphism, a fundamental concept in Java programming, is akin to a Swiss Army knife, offering multiple functionalities within a single entity. It's like a chameleon, adapting its behavior based on the context. This concept is crucial for code flexibility and maintenance.

- **Definition:** Polymorphism in Java allows objects to be treated as instances of their parent class, enabling them to take on multiple forms.
- **Analogy:** Comparable to a Swiss Army knife, polymorphism enables a Java object to exhibit different behaviors in different contexts.

### Importance of Polymorphism in Java
- Enhances code flexibility and reusability.
- Facilitates code maintenance and understanding.
- Crucial for implementing inheritance and interfaces.

### Types of Polymorphism in Java
- **Compile-time Polymorphism:** Achieved through method overloading (same method name, different parameters).
- **Runtime Polymorphism:** Achieved through method overriding (the subclass provides its own method implementation).

### Example Code
- Superclass: `Animal` with a `makeSound()` method.
- Subclasses: `Dog` and `Cat`, each overriding `makeSound()`.

```java
public class Animal {
  public void makeSound() {
    System.out.println("The animal makes a sound");
  }
}

public class Dog extends Animal {
  public void makeSound() {
    System.out.println("The dog barks");
  }
}

public class Cat extends Animal {
  public void makeSound() {
    System.out.println("The cat meows");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal animal1 = new Animal();
    Animal animal2 = new Dog();
    Animal animal3 = new Cat();

    animal1.makeSound(); // The animal makes a sound
    animal2.makeSound(); // The dog barks
    animal3.makeSound(); // The cat meows
  }
}
```

# References
- Encapsulation: [Documentation](https://www.crio.do/blog/encapsulation-in-java/)
- Abstraction: [Documentation](https://www.crio.do/blog/abstraction-in-java/?utm_source=blog-int)
- Inheritance: [Documentation](https://www.w3schools.com/java/java_inheritance.asp)
- Polymorphism: [Documentation](https://www.shiksha.com/online-courses/articles/polymorphism-in-java/)
