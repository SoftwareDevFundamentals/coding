# The Four Pillars of Object-Oriented Programming

Object-Oriented Programming or OOPs refers to languages that use objects in programming, they use objects as a primary
source to implement what is to happen in the code. Objects are seen by the viewer or user, performing tasks assigned by
you. Object-oriented programming aims to implement real-world entities like inheritance, hiding, polymorphism etc. in
programming. The main aim of OOP is to bind together the data and the functions that operate on them so that no other
part of the code can access this data except that function.

## OOP Basic Concepts

- **Class**: A class is a user-defined blueprint or prototype from which objects are created. It represents the set of
  properties or methods that are common to all objects of one type. Using classes, you can create multiple objects with
  the same behavior instead of writing their code multiple times. This includes classes for objects occurring more than
  once in your code.

- **Object**: An object is a basic unit of Object-Oriented Programming that represents real-life entities. A typical
  Java program creates many objects, which as you know, interact by invoking methods. The objects are what perform your
  code, they are the part of your code visible to the viewer/user.

- **Method**: A method is a collection of statements that perform some specific task and return the result to the
  caller. A method can perform some specific task without returning anything. Methods allow us to reuse the code without
  retyping it, which is why they are considered time savers. In Java, every method must be part of some class, which is
  different from languages like C, C++, and Python.

## Abstraction

Data Abstraction is the property by virtue of which only the essential details are displayed to the user. The trivial or
non-essential units are not displayed to the user. Data Abstraction may also be defined as the process of identifying
only the required characteristics of an object, ignoring the irrelevant details. The properties and behaviors of an
object differentiate it from other objects of similar type and also help in classifying/grouping the object.

Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators will increase the
car speed or applying brakes will stop the car, but he does not know how on pressing the accelerator, the speed is
actually increasing. He does not know about the inner mechanism of the car or the implementation of the accelerators,
brakes etc. in the car. This is what abstraction is.

In Java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.
The abstract method contains only method declaration but not implementation.

```java
//abstract class 
abstract class Calculator {
    //abstract methods declaration 
    abstract void add();

    abstract void mul();

    abstract void div();
}
```

## Encapsulation

It is defined as the wrapping up of data under a single unit. It is the mechanism that binds together the code and the
data it manipulates. Another way to think about encapsulation is that it is a protective shield that prevents the data
from being accessed by the code outside this shield.

Technically, in encapsulation, the variables or the data in a class is hidden from any other class and can be accessed
only through any member function of the class in which they are declared. Encapsulation can be achieved by declaring all
the variables in a class as private and writing public methods in the class to set and get the values of the variables.

```java
//Encapsulation using private modifier  

//Employee class contains private data called employee id and employee name 
class Employee {
    private int EmployeeId;
    private String EmployeeName;
}
```

## Inheritance

Inheritance is an important pillar of OOP (Object-Oriented Programming). It is the mechanism in Java by which one class
is allowed to inherit the features (fields and methods) of another class. We are achieving inheritance by using extends
keyword. some important and frequently used terminologies are:

* Superclass: The class whose features are inherited is known as superclass (also known as base or parent class).
* Subclass: The class that inherits the other class is known as subclass (also known as derived or extended or child
  class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
* Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is
  already a class that includes some of the code that we want, we can derive our new class from the existing class. By
  doing this, we are reusing the fields and methods of the existing class.

```java
//base class or parent class or super class 
class Calculator {
    //parent class methods 
    public int add(int x, int y) {
        return (x + y);
    }

    public int res(int x, int y) {
        return (x - y);
    }
}

//derived class or child class or extended class 
class ImprovedCalculator extends Calculator {  //Inherits parent class methods 
    //child class methods 
    public int mul(int x, int y) {
        return (x * y);
    }

    public int div(int x, int y) {
        return (x / y);
    }
}

class Main {
    public static void main(String[] args) {
        ImprovedCalculator calculator = new ImprovedCalculator();
        System.out.println(calculator.add(1, 2)); //calls inherited method from parent class 
        System.out.println(calculator.res(1, 2)); //calls inherited method from parent class 
        System.out.println(calculator.mul(1, 2)); //calls child class method 
        System.out.println(calculator.div(1, 2)); //calls child class method
    }
}
```

**Output**

```
3
-1
2
0
```

## Polymorphism

It refers to the ability of object-oriented programming languages to differentiate between entities with the same name
efficiently. This is done by Java with the help of the signature and declaration of these entities. The ability to
appear in many forms is called polymorphism.

```java
// This class will contain 3 methods with same name, 
// yet the program will compile & run successfully 
public class Calculator {

    // Overloaded add(). 
    // This add takes two int parameters 
    public int add(int x, int y) {
        return (x + y);
    }

    // Overloaded add(). 
    // This add takes three int parameters 
    public int add(int x, int y, int z) {
        return (x + y + z);
    }

    // Overloaded add(). 
    // This add takes two double parameters 
    public double add(double x, double y) {
        return (x + y);
    }

    // Driver code 
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.add(10, 20, 30));
        System.out.println(calculator.add(10.5, 20.5));
    }
}
```

**Output**

```
30  
60  
31.0
```

## Sources

- [Object-Oriented Programming (OOPs) Concept in Java](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/?ref=lbp)
