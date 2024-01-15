# Object-Oriented Programming (OOP)

## **Table of Contents**

1. [Introduction](#1Introduction)
2. [Classes and Objects](#2classes-and-objects)
3. [Encapsulation](#3encapsulation)
4. [Inheritance](#4inheritance)
5. [Polymorphism](#5polymorphism)
6. [References](#6-references)
## 1.Introduction

Object-Oriented Programming (OOP) is a programming paradigm centered around the concept of "objects,
which can contain data in the form of fields (attributes) and code in the form of procedures (methods).
Java, a popular programming language, strongly supports OOP principles.

## 2.Classes and Objects

In Java, classes are used to define objects. Let's consider a `Digimon` class:

```java

public class Digimon {
    // Attributes
    private String name;
    private String type;

    // Constructor
    public Digimon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Method
    public void digivolve() {
        System.out.println(name + " is digivolving!");
    }
}

// Creating Digimon objects
Digimon agumon = new Digimon("Agumon", "Reptile");
Digimon gabumon = new Digimon("Gabumon", "Beast");
```

## 3.Encapsulation

Encapsulation is a key concept in OOP that  involves bundling the data (attributes) and the methods
that operate on the data within a single unit (a class). In our Digimon class, the attributes
name and type are encapsulated:

```java
public class Digimon {
    private String name;
    private String type;

    // Constructor and methods...
}
```

## 4.Inheritance

Inheritance allows a class (subclass) to inherit attributes and methods
from another class (superclass). Let's create an evolution hierarchy for Digimon:

```java
public class RookieDigimon extends Digimon {
    public RookieDigimon(String name) {
        super(name, "Rookie");
    }

    // Additional methods for RookieDigimon...
}

public class ChampionDigimon extends RookieDigimon {
    public ChampionDigimon(String name) {
        super(name);
    }

    // Additional methods for ChampionDigimon...
}

```

## 5.Polymorphism

Polymorphism allows objects to be treated as instances of their parent class.
Let's demonstrate this with a method that accepts any Digimon:

```java
public class DigimonArena {
public void battle(Digimon digimon1, Digimon digimon2) {
System.out.println(digimon1.getName() + " battles " + digimon2.getName());
// Battle logic...
}
}
```

## 6. References

https://www.codingninjas.com/studio/library/four-pillars-of-oops-in-java
https://www.javatpoint.com/java-oops-concepts
https://es.stackoverflow.com/questions/429515/problema-de-punteros-en-java-poo
https://www.youtube.com/watch?v=I848HdWjLMo
