# OOP Pillards
Object-oriented programming (OOP) is a programming paradigm that relies on the concept of "objects" to organize and structure code. Instead of focusing on procedures or functions, OOP focuses on the interaction between objects, which are instances of classes.

The OOP is based on four fundamental concepts:

![](C:\Users\LENOVO\IdeaProjects\coding\docs\FernandaFlores\Images\opp4.png)
## 1. Encapsulation: 

Encapsulation is a core principle of Object-Oriented Programming (OOP) in Java. It involves combining an object's data (attributes) and behaviors (methods) into a single unit known as a class. Furthermore, encapsulation enables control over access to these data and methods, permitting only regulated interactions from external sources.

By encapsulating, the internal complexities of a class are hidden, presenting a controlled interface for interacting with class objects. This enhances the security and integrity of the data by restricting modifications to specific class methods, thereby facilitating proper validation before any changes are made.

### Advantages
- Encapsulation links data with its related functionalities. Here functionalities mean "methods" and data means "variables".
- So we keep variables and methods in one place. That place is "class." The class is the basis for encapsulation.
- User actions can be controlled internally.
### Example
```
    public  class  Person {
        // private attributes
        private String name;
        private  int age; 
        // Constructor 
        public Person ( String name, int age ) {
            this .name = name;
            this .age = age;
        } 
        // Method to get the name 
        public String getName () {
            return name;
        } 
        // Method to set the name 
        public void setName ( String name ) {
            this .name = name;
        } 
        // Method to get the age 
        public int getAge () {
            return age;
        } 
        // Method to set the age 
        public void setAge ( int age ) {
            this .age = age;
        } 
        public static void main ( String[] args ) {
            // Create a Person object
            Person person = new Person( "John Doe" , 30 ); 
            // Access data through
            System access methods. out .println( "Name: " + person.getName());
            System. out .println( "Age: " + person.getAge()); 
            // Modify data through access methods
            person.setAge( 31 );
            System. out .println( "New age: " + person.getAge());
        }
    }
```
In this example, the Person class encapsulates the name and age data and provides public methods to access and modify this data in a controlled way.

## 2. Inheritance:

Inheritance allows new classes to be defined based on existing ones in order to reuse the code, thus generating a hierarchy of classes within an application. If a class derives from another, it inherits its attributes and methods and can add new attributes, methods or redefine inherited ones.
![](C:\Users\LENOVO\IdeaProjects\coding\docs\FernandaFlores\Images\herencia.jpg)
### Advantages
- Code reuse: Allows classes to inherit attributes and methods from a base class.
- Promotes coherence and consistency: By grouping common features into a base class, you ensure that all derived classes maintain consistent structure and behavior.
- Facilitates extensibility: You can extend an existing class to create a new class that inherits all the features of the base class and then add or modify your own features.
### Example
  - Definition of the superclass

Start by defining a base class, also called a superclass, that contains the common attributes and methods that you want to share with derived classes.
```
  public  class  Animal {
      String name;
      public  void  eat () {
          System. out .println( "The animal is eating." );
      }
  }
```
- Creation of the derived class

Then, create a new class that inherits from the base class using the extends keyword.
```
   public  class  Dog  extends  Animal {
       public  void  bark () {
          System. out .println( "The dog is barking." );
      }
  }
```
Using inheritance: You can now create objects of the derived class and access the attributes and methods of both the derived class and the base class.
```
    public  class  Main {
       public  static  void  main ( String [] args ) {
           Dog myDog = new  Dog ();
          my dog. name = "Bobby" ;
          my dog. eat ();  // Method of the base class 
          myDog. bark (); // Method of the derived class
      }
    }
```
In this example, the Dog class inherits from the Animal class, so an object of the Dog class can also access the methods and attributes of the Animal class.
## 3. Abstraction:

It is the process of hiding the details of the implementation from the user and only the functionality will be shown, that is, the user will obtain the information that the object does instead of how it does it and in Java it is done by implementing abstract classes and implementing interfaces

### Advantages
- Provides a structured way to organize and reuse code 
- Allows multiple inheritance, allowing programmers to work with multiple parent classes and multiple levels of inheritance 
- Helps programmers control access to data, helping them avoid logic errors and security errors 
- It allows for maximum modularity, making it easier to create and maintain code.
### Example
```
    //Archivo: Animal.java
    package cosmiclearn.inheritance;
    public abstract class Animal {
        public abstract void makeNoise();
        public void sleep()
        {
            System.out.println("Zzzzzz");
        }
    }
    //Archivo: Cat.java
    package cosmiclearn.inheritance;
    public class Cat extends Animal {
        public void makeNoise(){
            System.out.println("Meoooowwwww");
        }
    }
    //Archivo: Dog.java
    package cosmiclearn.inheritance;
    public class Dog extends Animal {
        public void makeNoise(){
            System.out.println("Woooooof");
        }
    }


```
The animal class is declared as an abstract class, and has an abstract method, makeNoise, which was implemented by the subclasses, Dog and Cat.
## 4. Polymorphism:

It refers to the ability of an object to be represented and behave in multiple different ways. In other words, an object can take various forms or manifestations depending on the context in which it is used.

Polymorphism allows objects of different classes to be treated uniformly through a common interface. This means that an object can be used and manipulated in the same way, regardless of its specific type. This provides flexibility and extensibility to the code, since new classes that implement the same interface can be added and used in place of existing classes without modifying the code that uses them.
![](C:\Users\LENOVO\IdeaProjects\coding\docs\FernandaFlores\Images\polimorfismo.gif)
### Advantages
- It allows objects to behave in different ways depending on the context in which they are used. This provides flexibility in the design and implementation of the code, allowing it to be adapted to different situations.

- Code Simplicity and Clarity: By using interfaces or abstract base classes that define a common set of methods, polymorphism helps simplify code logic. This improves readability and clarity by focusing on what an object does, not the details of how it does it.
### Example
```
  void Reparar(Vehículo vehículo) {
    Console.WriteLine("Iniciando reparación");
    Console.WriteLine("Probando acelerador");
    Console.WriteLine($"Velocidad inicial {vehículo.Velocidad}");
    vehículo.Acelerar();
    Console.WriteLine($"Velocidad final {vehículo.Velocidad}");
    Console.WriteLine("Probando reversa");
    vehículo.Reversa();
    Console.WriteLine("Listo!");
   }
```
This method invokes the Accelerate and Reverse methods of the vehicle that is sent as a parameter. The advantage this offers is that we can generalize algorithms to work with different types. In this case, this method will work with any class that inherits from Vehicle, in this sense, even if in the future we add the Motorcycle class, which inherits from Vehicle, we can use this new class with the Repair method, and it will work perfectly. In this way polymorphism occurs, since the repair method can work with several different types.
### Conclusion
Together, these pillars promote modular, flexible, and maintainable software design. By applying these principles, we can build more efficient, scalable, and adaptable systems as project requirements evolve.

### References
* https://tinchicus.com/2019/05/23/java-abstraccion/
* https://blog.hubspot.es/website/que-es-herencia-java
* https://openwebinars.net/blog/introduccion-a-poo-en-java-encapsulamiento/