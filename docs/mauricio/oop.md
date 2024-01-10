# Los Cuatro Pilares de la Programación Orientada a Objetos
![Pilares de la OOP](https://www.crio.do/blog/content/images/2022/02/Four-pillars-of-Object-Oriented-Programming.png)

La Programación Orientada a Objetos (OOP) es un paradigma de programación basado en el concepto de `objetos`, que pueden contener datos en forma de campos (a menudo conocidos como atributos o propiedades) y código en forma de procedimientos (conocidos como métodos).

## Índice
- [Encapsulamiento](#encapsulamiento)
- [Abstracción](#abstracción)
- [Herencia](#herencia)
- [Polimorfismo](#polimorfismo)
- [Referencias](#referencias)

# Encapsulamiento
![Encapsulamiento](https://www.crio.do/blog/content/images/2022/01/What-is-Encapsulation.png)
El Encapsulamiento es uno de los cuatro pilares fundamentales de la Programación Orientada a Objetos (OOP). Actúa como un escudo protector alrededor de las variables de instancia, evitando que se modifiquen o establezcan valores inapropiados.

## Modificadores de Acceso

Para comprender en profundidad el Encapsulamiento, uno debe estar familiarizado con los modificadores de acceso en Java. Las clases, atributos, métodos y objetos son principalmente utilizados para escribir programas. En Java, hay principalmente cuatro niveles de visibilidad:

Para comprender en profundidad el Encapsulamiento, uno debe estar familiarizado con los modificadores de acceso en Java. Las `clases`, `atributos`, `métodos` y `objetos` son principalmente utilizados para escribir programas. En Java, existen cuatro niveles de visibilidad:

| Modificador | Descripción |
|-------------|-------------|
| `public`    | Visible para cualquier otra clase en todas partes. |
| `private`   | Visible solo dentro de la clase que lo define. |
| `protected` | Visible para la clase que lo define y sus subclases. |
| `package`   | Visible solo dentro de su propio paquete. |

### Ejemplo de Encapsulamiento
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
        h.edges = 6; // Compila porque edges está declarado como protected
        h.poly_name = "hexagon"; // Error de compilación ya que las variables privadas no pueden ser accedidas por subclases
        h.printEdges(); // Error de compilación ya que este método tiene acceso predeterminado (paquete)
        h.printInfo(); // Compila ya que este método es público
    }
}
```

# Abstracción
La abstracción es una técnica para identificar la información útil que debe ser visible para un usuario e ignorar los detalles irrelevantes.
Por ejemplo, se puede pensar en el sistema operativo Linux como una clase a partir de la cual se crean sabores (objetos) de Linux.
![Abstracción](https://www.crio.do/blog/content/images/2022/02/Linux-OS-1.png)

## Conceptos de Abstracción

La abstracción utiliza clases abstractas e interfaces para implementar la abstracción. Una `clase abstracta` puede contener métodos abstractos que no tienen implementación y se destinan a ser sobrescritos en clases derivadas.

| Elemento        | Uso en Abstracción                |
|-----------------|------------------------------------|
| Clase Abstracta | Para declarar la estructura común. |
| Método Abstracto| Para obligar a las subclases a implementar comportamientos específicos. |

### Ejemplo de Abstracción
`Vehiculo.java`

```java
package transporte;

public abstract class Vehiculo {
    private String marca;

    public abstract void encenderMotor();
    // Otros métodos relacionados con vehículos
}
```
`Coche.java`
```java
package transporte;

public class Coche extends Vehiculo {

    @Override
    public void encenderMotor() {
        // Implementación específica para Coche
    }
    // Otros métodos específicos del coche
}
```

# Herencia 

En Java, es posible heredar atributos y métodos de una clase a otra. Agrupamos el concepto de "herencia" en dos categorías:
- **Subclase (Hijo)**: la clase que hereda de otra clase.
- **Superclase (Padre)**: la clase de la cual se hereda.

Para heredar de una clase, se utiliza la palabra clave `extends`.

### Ejemplo de Herencia

En el siguiente ejemplo, la clase `Car` (subclase) hereda los atributos y métodos de la clase `Vehicle` (superclase):

### Código de Ejemplo

```java
class Vehicle {
  protected String brand = "Ford";        // Atributo de Vehicle
  public void honk() {                    // Método de Vehicle
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";    // Atributo de Car
  public static void main(String[] args) {

    // Crear un objeto myCar
    Car myCar = new Car();

    // Llamar al método honk() (de la clase Vehicle) en el objeto myCar
    myCar.honk();

    // Mostrar el valor del atributo brand (de la clase Vehicle) y el valor del modelName de la clase Car
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
}
```
### Explicación del Código

- La clase `Vehicle` contiene un atributo `brand` y un método `honk()`.
- La clase `Car` extiende `Vehicle`, lo que significa que hereda sus atributos y métodos.
- Dentro de `Car`, declaramos un atributo adicional llamado `modelName`.
- En el método `main`, creamos un objeto de `Car`, llamamos al método `honk()` heredado y accedemos a los atributos `brand` y `modelName`.

Este ejemplo demuestra cómo la herencia permite la reutilización de código y la relación jerárquica entre clases en Java.


# Polimorfismo 

El polimorfismo, un concepto fundamental en la programación Java, se asemeja a una navaja suiza, ofreciendo múltiples funcionalidades dentro de una sola entidad. Es como un camaleón, adaptando su comportamiento en base al contexto. Este concepto es crucial para la flexibilidad y el mantenimiento del código.

- **Definición:** El polimorfismo en Java permite que los objetos sean tratados como instancias de su clase padre, lo que les permite asumir múltiples formas.
- **Analogía:** Comparable a una navaja suiza, el polimorfismo permite que un objeto Java exhiba diferentes comportamientos en diferentes contextos.

### Importancia del Polimorfismo en Java
- Mejora la flexibilidad y reutilización del código.
- Facilita el mantenimiento y comprensión del código.
- Crucial para la implementación de herencia e interfaces.

### Tipos de Polimorfismo en Java
- **Polimorfismo en Tiempo de Compilación:** Logrado a través de la sobrecarga de métodos (mismo nombre de método, diferentes parámetros).
- **Polimorfismo en Tiempo de Ejecución:** Logrado a través de la sobreescritura de métodos (la subclase proporciona su propia implementación del método).

### Código de Ejemplo
- Superclase: `Animal` con un método `makeSound()`.
- Subclases: `Dog` y `Cat`, cada una sobrescribe `makeSound()`.

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
# Referencias
- Encapsulamiento: [Documentación](https://www.crio.do/blog/encapsulation-in-java/)
- Abstracción: [Documentación](https://www.crio.do/blog/abstraction-in-java/?utm_source=blog-int)
- Herencia: [Documentación](https://www.w3schools.com/java/java_inheritance.asp)
- Polimorfismo: [Documentación](https://www.shiksha.com/online-courses/articles/polymorphism-in-java/)