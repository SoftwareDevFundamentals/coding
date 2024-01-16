
# Object-Oriented Programming Principles:
There are numerous principles in object-oriented programming, such as classes and objects. However, in software development using this paradigm, four fundamental principles are the cornerstone of the development process. These four principles, which we will explore below, are referred to as the foundations of object-oriented programming.

This does not imply that there are no other equally important ideas outside of these foundations, but these four pillars represent the basis for more advanced concepts, making understanding them crucial.

These foundations are: abstraction, encapsulation, inheritance, and polymorphism.

Note: For reference, I include here the class we created in the previous entry:


>public class Car {

>public String brand;
private int yearReleasedToMarket;

    public int getYearReleasedToMarket() {
        return yearReleasedToMarket;
    }

    public void setYearReleasedToMarket(int yearReleasedToMarket) {
        this.yearReleasedToMarket = yearReleasedToMarket;
    }

    public void accelerate() {
        // Implementa la lógica de aceleración aquí
    }
>}

## Abstraction:

According to the Royal Spanish Academy (RAE), one of the meanings of abstraction is as follows:

"To disregard something, or set it aside." And it provides the following example: "Let's focus on the essential, abstracting FROM marginal considerations."

This example encapsulates the essence of the abstraction concept. When performing abstraction, we seek to overlook details that are not necessary for us and display only what is relevant.

From the perspective of software development, we can see that through a class, we can carry out an abstraction of an entity from the real world. Take, for example, the "Car" class we created. It has the ability to store data related to the brand and the year a car was released to the market. However, why only these two pieces of information? A real-world car has more properties, such as color and model. However, we must question: Are these pieces of information relevant to our software?

Our class abstracts everything that represents a car, selecting only what interests us and discarding everything else.

## Encapsulation

Now, we use classes to model entities relevant to your application, store data within objects, and execute functionalities. However, the question that arises is: Should anyone be able to directly modify this data? Should anyone execute any functionality of our objects at any time? Generally, this is not something we desire. We want to have control over how data is assigned, decide who can view the internal information of our objects, and perhaps regulate the execution of object functionalities. This is where the concept of encapsulation comes into play.

Encapsulation allows us to control who can view and use the various internal modules of our system. In terms of classes, encapsulation defines access to the members of the class.

In C#, we can use access modifiers to specify control over external agents on different parts of our system, such as classes, class members, interfaces, among others. Suppose we have a variable called "speed," which we want to include in our "Car" class to indicate the speed at which a particular vehicle is moving. However, we only want the value of this variable to be visible and modifiable within the class. This can be achieved using a field or a property. Let's choose to do it with a property:



>public class Car
{
public string Brand;
public int YearReleasedToMarket { get; set; }
private int Speed { get; set; }

    public void Accelerate()
    {
        Speed += 10;
    }
>}



Object-Oriented Programming Principles:
There are numerous principles in object-oriented programming, such as classes and objects. However, in software development using this paradigm, four fundamental principles are the cornerstone of the development process. These four principles, which we will explore below, are referred to as the foundations of object-oriented programming.

This does not imply that there are no other equally important ideas outside of these foundations, but these four pillars represent the basis for more advanced concepts, making understanding them crucial.

These foundations are: abstraction, encapsulation, inheritance, and polymorphism.

Note: For reference, I include here the class we created in the previous entry:


>public class Car {

>public String brand;

>private int yearReleasedToMarket;

>private int speed;

    public int getYearReleasedToMarket() {
        return yearReleasedToMarket;
    }

    public void setYearReleasedToMarket(int yearReleasedToMarket) {
        this.yearReleasedToMarket = yearReleasedToMarket;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        speed += 10;
    }
>}

Abstraction:
According to the Royal Spanish Academy (RAE), one of the meanings of abstraction is as follows:

"To disregard something, or set it aside." And it provides the following example: "Let's focus on the essential, abstracting FROM marginal considerations."

This example encapsulates the essence of the abstraction concept. When performing abstraction, we seek to overlook details that are not necessary for us and display only what is relevant.

From the perspective of software development, we can see that through a class, we can carry out an abstraction of an entity from the real world. Take, for example, the "Car" class we created. It has the ability to store data related to the brand and the year a car was released to the market. However, why only these two pieces of information? A real-world car has more properties, such as color and model. However, we must question: Are these pieces of information relevant to our software?

Our class abstracts everything that represents a car, selecting only what interests us and discarding everything else.

Encapsulation:
Now, we use classes to model entities relevant to your application, store data within objects, and execute functionalities. However, the question that arises is: Should anyone be able to directly modify this data? Should anyone execute any functionality of our objects at any time? Generally, this is not something we desire. We want to have control over how data is assigned, decide who can view the internal information of our objects, and perhaps regulate the execution of object functionalities. This is where the concept of encapsulation comes into play.

Encapsulation allows us to control who can view and use the various internal modules of our system. In terms of classes, encapsulation defines access to the members of the class.


>public class Car {

>private String brand;

>private int yearReleasedToMarket;

>private int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearReleasedToMarket() {
        return yearReleasedToMarket;
    }

    public void setYearReleasedToMarket(int yearReleasedToMarket) {
        this.yearReleasedToMarket = yearReleasedToMarket;
    }

    private int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        setSpeed(getSpeed() + 10);
    }
>}

When we instantiate the "Car" class, we cannot access the value of the "Speed" property, nor can we alter it from outside. What we can do is use the "Accelerate" function to increase the speed value by 10 units. This is one of the advantages of encapsulation: it allows us to control how the internal data of our object will be altered.

If we want external agents to see the value of the "Speed" property but not be able to freely alter that value, we can use the following syntax:

>private void setSpeed(int speed) {
this.speed = speed;
}

## Inheritance

Code sharing is a crucial feature in any software project, as it allows saving work when making changes to the system and enables a single algorithm to process different classes of entities, among other advantages.

There are various ways to share code, and one of them is through the use of inheritance. Inheritance establishes a special relationship between two classes: the base class and the derived class. In this relationship, the derived class gains the ability to use specific properties and functionalities of the base class, even having the possibility to override the functionality of the latter. The main idea is that the derived class "inherits" some of the characteristics of the base class.

We can illustrate this with an example using the "Car" class. A car is considered a type of vehicle, and besides, we want to process other types of vehicles, such as a truck. Both the car and the truck share the concept of speed, and both have the ability to accelerate and reverse. However, when a truck reverses, it must emit a sound. Finally, a car must have the ability to turn on the radio. Let's proceed to model this:

>public class Vehicle {

>public String brand;

>private int yearReleasedToMarket;

>private int speed;

    public int getYearReleasedToMarket() {
        return yearReleasedToMarket;
    }

    public void setYearReleasedToMarket(int yearReleasedToMarket) {
        this.yearReleasedToMarket = yearReleasedToMarket;
    }

    public int getSpeed() {
        return speed;
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        setSpeed(getSpeed() + 10);
    }

    public void reverse() {
        System.out.println("Going in reverse!");
    }
>}

>public class Car extends Vehicle {

>public void turnOnRadio() {
System.out.println("Turning on the radio");
}

>}

>public class Truck extends Vehicle {

>@Override
public void reverse() {
super.reverse();
System.out.println("BEEP BEEP BEEP!");

>}
}


We see that we have 3 classes: Vehicle, Car, and Truck. Both Car and Truck inherit from the Vehicle class. The inheritance relationship is represented in this way:

>public class Car extends Vehicle

With this syntax, we establish that "Car" is a derived class of "Vehicle."

We observe that the "Accelerate" function is defined in the "Vehicle" class, allowing all derived classes to use this function. The same applies to fields and properties.

Certainly, the "Car" and "Truck" classes can define their own members that are not directly related to the "Vehicle" class. For example, the "Car" class has the "TurnOnRadio" method, which only this class possesses.

It is also possible to modify the functionality of the base class. To achieve this, in

the base class, the method must be marked as "virtual." When overriding, i.e., changing or adding functionality, we can do so using "override," as shown in the "Truck" class. Within the "Reverse" method of the "Truck" class, we find the code "base.Reverse();," which is used to invoke the "Reverse" method of the base class.

We can use the above code as follows:

>public class Main {

>public static void main(String[] args) {

>Car myCar = new Car();

        myCar.setYearReleasedToMarket(2018);
        myCar.accelerate();
        System.out.println(myCar.getSpeed());
        myCar.reverse();
        System.out.println("-------");

        Truck myTruck = new Truck();
        myTruck.accelerate();
        myTruck.setYearReleasedToMarket(2012);
        myTruck.reverse();
    }
>}

## Polymorphism

When we began discussing inheritance, we said that inheritance "allows a single algorithm to process different classes of entities." The idea is that we can have a function that receives a parameter, such as a base class, and we can pass objects that are instances of classes derived from that base class to that method. The same applies if the method receives an interface as a parameter. We can pass any class that implements that interface to that method.

Polymorphism means in many forms. In our case, we call it polymorphism when a method receives a parameter that encompasses various types.

Let's look at an example of polymorphism where we pass the base class "Vehicle" to a method:


>public static void repair(Vehicle vehicle) 

>{
System.out.println("Initiating repair");
System.out.println("Testing accelerator");
System.out.println("Initial speed: " + vehicle.getSpeed());
vehicle.accelerate();
System.out.println("Final speed: " + vehicle.getSpeed());
System.out.println("Testing reverse");
vehicle.reverse();
System.out.println("Done!");

>}

This method invokes the "Accelerate" and "Reverse" methods of the vehicle passed as a parameter. The advantage this offers is that we can generalize algorithms to work with different types. In this case, this method will work with any class that inherits from "Vehicle." In this sense, even if in the future we add the "Motorcycle" class, which inherits from "Vehicle," we can use this new class with the "Repair" method, and it will work perfectly. In this way, polymorphism is manifested, as the "Repair" method can work with various different types.

In the "Repair" method, we cannot use the "TurnOnRadio" method of the "Car" class since the "Vehicle" class does not implement that method. However, we could use the "is" operator to perform casting to "Car" in case the "Vehicle" is a car:

>if (vehicle instanceof Car)
{
Car myCar = (Car) vehicle;
myCar.turnOnRadio();
}


This syntax is a shorthand way of saying:

>if (vehicle instanceof Car) 
{
Car myCar = (Car) vehicle;
myCar.turnOnRadio();
}