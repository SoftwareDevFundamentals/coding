# Object-Oriented Programming (OOP) Pillards in Java

Object-Oriented Programming (OOP) is a programming paradigm, that is, a
programming model or style that gives us guidelines on how to work with it.
It is based on the concept of classes and objects. This type of programming
is used to structure a software program into simple, reusable pieces of 
code planes (classes) to create individual instances of objects.

With the Object-Oriented Programming paradigm, what we seek is to stop
focusing on the pure logic of programs, to start thinking about objects,
which constitutes the basis of this paradigm. This helps us a lot in large
systems, since instead of thinking about functions, we think about the 
relationships or interactions of the different components of the system.

## 1.Encapsulation

Encapsulation in object-oriented programming is when we limit access or
give restricted access of a property to the elements that a member needs
and not to anything else.
The most common element of encapsulation is classes, where we encapsulate
and encompass both methods and properties. There are three access levels
for encapsulation, which are:
### - Public:
Everyone can access the data or methods of a class that are defined with
this level, this is the lowest level, this is what you want the external
party to see.
### - Protected:
We can say that these are not publicly accessible, they are only accessible
within their class and by subclasses.
### - Private:
At this level you can declare members accessible only to the class itself.
### Example:
```java
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge > 0) {
            this.age = newAge;
        }
    }
}
```

## 2.Inheritance

Inheritance allows new classes to be defined based on existing ones in order
to reuse the code, thus generating a hierarchy of classes within an 
application. If a class derives from another, it inherits its attributes and
methods and can add new attributes, methods or redefine inherited ones.

### Example:
```java
public class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }
}
public class Dog extends Animal {
    public void bark() {
        System.out.println("Woof, woof!");
    }
}
```

## 3.Polymorphism

Polymorphism is a technique in object-oriented programming that allows 
objects of different classes to respond to the same message in different ways.
This means that the same method can have different behaviors depending on the
class of the receiving object.

Polymorphism allows you to create a hierarchy of related classes that behave
differently but share a common interface. This makes the code easier to 
maintain and update, since a new class can be added without affecting existing
code.

There are two main types of polymorphism:

### - Overloading Polymorphism:
Method overloading is a technique that allows a class to have multiple methods
with the same name, but different parameters. At compile time, the compiler
identifies the appropriate method from the parameters used.
### - Overriding Polymorphism:
Method overriding is a technique that allows a subclass to redefine a method
of its superclass. This means that the subclass method overrides the 
superclass method and is executed in its place when the method is called.
### Example:
```java
public class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape.");
    }
}
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}
```
## 4.Abstraction

Abstraction consists of representing a complex entity using its most relevant
characteristics and hiding unnecessary details. It's as if we created a 
simplified version of something, keeping only what we need to interact with it.
In this way, we can deal with objects more intuitively and efficiently.

In OOP, objects are the fundamental units of abstraction. We can think of them
as entities that have properties (attributes) and can perform actions (methods).
### Example:
```java
public abstract class Vehicle {
    public abstract void accelerate();
    public abstract void brake();
}
public class Car extends Vehicle {
    @Override
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }
    @Override
    public void brake() {
        System.out.println("The car is braking.");
    }
}

```
## References:
https://profile.es/blog/que-es-la-programacion-orientada-a-objetos/
https://styde.net/encapsulamiento-en-la-programacion-orientada-a-objetos/
https://ifgeekthen.nttdata.com/es/herencia-en-programacion-orientada-objetos
https://programacion.top/orientada-objetos/polimorfismo/
https://programacion.top/orientada-objetos/abstraccion/