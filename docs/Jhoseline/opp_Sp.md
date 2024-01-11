# Programación Orientada a Objetos (POO) en Java

## Introducción

La Programación Orientada a Objetos (POO) es un paradigma de programación 
centrado en el concepto de "objetos", los cuales pueden contener datos en 
forma de atributos y código en forma de procedimientos (métodos). Java,
un lenguaje de programación popular, respalda fuertemente los principios de la POO.

## 1. Clases y Objetos

En Java, las clases se utilizan para definir objetos. Consideremos
una clase `Digimon`:

```java
public class Digimon {
    // Atributos
    private String nombre;
    private String tipo;

    // Constructor
    public Digimon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Método
    public void digievolucionar() {
        System.out.println(nombre + " está digievolucionando.");
    }
}

// Crear objetos Digimon
Digimon agumon = new Digimon("Agumon", "Reptil");
Digimon gabumon = new Digimon("Gabumon", "Bestia");

```

## 2. Encapsulamiento

El encapsulamiento es un concepto clave en la POO que implica agrupar los datos 
(atributos) y los métodos que operan en los datos dentro de una unidad única
(una clase). En nuestra clase Digimon, los atributos nombre
y tipo están encapsulados:
```java
public class Digimon {
    private String name;
    private String type;

    // Constructor and methods...
}
```
## 4.Herencia 

La herencia permite que una clase (subclase) herede atributos y métodos
de otra clase (superclase). Creemos una jerarquía de evolución para Digimon:

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

## 5.Polimorfismo
El polimorfismo permite tratar a los objetos como instancias
de su clase padre. Demostremos esto con un método que acepta 
cualquier Digimon:

```java
public class DigimonArena {
public void battle(Digimon digimon1, Digimon digimon2) {
System.out.println(digimon1.getName() + " battles " + digimon2.getName());
// Battle logic...
}
}
```

## 6 Enlaces/ Referencias 

https://www.codingninjas.com/studio/library/four-pillars-of-oops-in-java
https://www.javatpoint.com/java-oops-concepts
https://es.stackoverflow.com/questions/429515/problema-de-punteros-en-java-poo
https://www.youtube.com/watch?v=I848HdWjLMo
