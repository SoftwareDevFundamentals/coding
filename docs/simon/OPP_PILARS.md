<<<<<<< HEAD
# Programación Orientada a Objetos (OOP) en Java

## Los 4 Pilares de la OOP

La Programación Orientada a Objetos se basa en cuatro conceptos fundamentales conocidos como los "cuatro pilares". Estos son:

### 1. Encapsulation (Encapsulación)

La encapsulación implica ocultar los detalles internos de la implementación y proteger los datos utilizando modificadores de acceso como `private`, `public`, y `protected`. Esto ayuda a controlar el acceso a los miembros de una clase y prevenir modificaciones no deseadas.

### 2. Inheritance (Herencia)

La herencia permite crear una nueva clase utilizando propiedades y comportamientos de una clase existente. La clase existente se llama clase base o padre, y la nueva clase se llama clase derivada o hija. Esto fomenta la reutilización del código y establece una jerarquía de clases.

### 3. Polymorphism (Polimorfismo)

El polimorfismo permite que objetos de diferentes clases sean tratados como objetos de una misma clase base. Esto se logra a través de la implementación de métodos con el mismo nombre en diferentes clases. Hay dos tipos de polimorfismo: estático (sobrecarga) y dinámico (sobrescritura).

### 4. Abstraction (Abstracción)

La abstracción implica representar solo los aspectos esenciales de un objeto y ocultar los detalles innecesarios. Esto se logra mediante el uso de interfaces y clases abstractas que proporcionan una estructura general sin especificar todos los detalles de implementación.

## Aplicación de los Conceptos en el Código

### Encapsulation Example

- **Player.java:** Se utiliza el modificador `private` en los campos `name` y `health` para encapsular los detalles internos de la implementación de la clase `Player`.

### Inheritance, Polymorphism, and Abstraction Example

- **Character.java:** La clase base `Character` tiene un método `displayInfo()` que es heredado por las clases `Player` y `Enemy`.

- **Player.java y Enemy.java:** Utilizan la herencia (extienden de `Character`), implementan el polimorfismo al sobrescribir el método `atack()`, y aplican la abstracción al proporcionar métodos específicos (`useSkill()` y `defend()` respectivamente).

- **RPGGameInheritance.java y RPGGamePolymorphism.java:** Ambos programas utilizan el polimorfismo al tratar objetos de `Player` y `Enemy` como objetos de la clase base `Character`.
=======
>>>>>>> main

# Object-Oriented Programming (OOP) in Java

## The 4 Pillars of OOP

Object-Oriented Programming is based on four fundamental concepts known as the "four pillars." These are:

### 1. Encapsulation

Encapsulation involves hiding internal implementation details and protecting data using access modifiers such as `private`, `public`, and `protected`. This helps control access to class members and prevents unwanted modifications.

### 2. Inheritance

Inheritance allows the creation of a new class using properties and behaviors of an existing class. The existing class is called the base or parent class, and the new class is called the derived or child class. This encourages code reuse and establishes a class hierarchy.

### 3. Polymorphism

Polymorphism allows objects of different classes to be treated as objects of the same base class. This is achieved through the implementation of methods with the same name in different classes. There are two types of polymorphism: static (overloading) and dynamic (overriding).

### 4. Abstraction

Abstraction involves representing only the essential aspects of an object and hiding unnecessary details. This is achieved through the use of interfaces and abstract classes that provide a general structure without specifying all implementation details.

## Application of Concepts in the Code

### Encapsulation Example

- **Player.java:** The `private` modifier is used on the `name` and `health` fields to encapsulate the internal details of the `Player` class implementation.

### Inheritance, Polymorphism, and Abstraction Example

- **Character.java:** The base class `Character` has a `displayInfo()` method that is inherited by the `Player` and `Enemy` classes.

- **Player.java and Enemy.java:** They use inheritance (extend from `Character`), implement polymorphism by overriding the `performAction()` method, and apply abstraction by providing specific methods (`useSkill()` and `defend()` respectively).

- **RPGGameInheritance.java and RPGGamePolymorphism.java:** Both programs use polymorphism by treating objects of `Player` and `Enemy` as objects of the base class `Character`.

# Sources
- https://chat.openai.com/
- https://www.geeksforgeeks.org/four-main-object-oriented-programming-concepts-of-java/