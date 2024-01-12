# OBJECT-ORIENTED PROGRAMMING (OOP)

Object-oriented programming is based on the concept of creating a model of the target problem in your programs. Object-oriented programming reduces errors and promotes code reuse.

## The 4 pillars of object-oriented programming
![ ](https://www.google.com/imgres?imgurl=https%3A%2F%2Fi.pinimg.com%2Foriginals%2Fcb%2Faa%2F89%2Fcbaa89a3c6b9e92f8b0ef485cdfd53f5.png&tbnid=BT3uwdu_NaQE5M&vet=12ahUKEwipv_Kqo9iDAxVzW7gEHWO9DuwQMygAegQIARBT..i&imgrefurl=https%3A%2F%2Fwww.pinterest.com.mx%2Fpin%2F288582288626823813%2F&docid=vf1o2oip1CyIoM&w=2000&h=2000&q=los%204%20pilares%20de%20la%20programaci%C3%B3n%20orientada%20a%20objetos&ved=2ahUKEwipv_Kqo9iDAxVzW7gEHWO9DuwQMygAegQIARBT)
- Abstraction
- inheritance
- polymorphism
- encapsulation

## - Abstraction
In object-oriented programming, abstraction is the process of hiding the details of the implementation from the user and only the functionality will be shown, that is, the user will obtain the information that the object does instead of how it does it and in Java it is done by implementing the abstract classes and implementing interfaces
### example
To understand this concept a little better, let's look at the following example, which will consist of two classes, one for our employee where the file name will be `Employee.java` and then we will have the class that will be our program called `AbstractTest.jav`a For this let's start with the first class:
```java

public abstract class Empleado
{
        private String nombre;
        private String direccion;
        private int numero;

        public Empleado(String nombre, String direccion, int numero)
        {
                System.out.println("Construyendo un empleado");
                this.nombre = nombre;
                this.direccion = direccion;
                this.numero = numero;
        }

        public double pagoComputado()
        {
                System.out.println("Dentro del pago computado al empleado");
                return 0.0;
        }

        public void chequeCorreo()
        {
                System.out.println("Enviando el cheque por correo a "
                                + this.nombre + " " + this.direccion);
        }

        public String toString()
        {
                return nombre + " " + direccion + " " + numero;
        }

        public String getNombre()
        {
                return nombre;
        }

        public String getDireccion()
        {
                return direccion;
        }

        public void setDireccion(String nueva)
        {
                direccion = nueva;
        }

        public int getNumero()
        {
                return numero;
        }
}
```
 
 ## - inheritance

`Inheritance` in Java implies that a superclass or base class inherits its functions and attributes to a subclass or derived class. The reserved word that allows us to perform inheritance between classes is `extends`.
### inheritance types in java
- Simple or single inheritance

![](image.png)

- Multiple inheritance

![](image-1.png)

- Multilevel inheritance

![](image-2.png)

- Hierarchical inheritance

![](image-3.png)

## - polymorphism
In object-oriented programming, polymorphism is the ability of the objects of a class to offer different and independent responses depending on the parameters (different implementations) used during their invocation. In other words, the object as an entity can contain values ​​of different types during the execution of the program.
### example 
We can create two different classes: `Cat` and `Dog`, which inherit from the superclass `Animal`
The Animal class has the abstract method `makesound()` that is implemented differently in each of the subclasses (cats and dogs sound differently)
```java
class Animal {
  public void makeSound() {
    System.out.println("Grr...");
  }
}
class Cat extends Animal {
  public void makeSound() {
    System.out.println("Meow");
  }
}
class Dog extends Animal {
  public void makeSound() {
    System.out.println("Woof");
  }
}
```
Since all `Cat` and `Dog` objects are Animal objects, we can do the following
```java
public static void main(String[ ] args) {
  Animal a = new Dog();
  Animal b = new Cat();
}
```


## - encapsulation
`Encapsulation` in `Java` is a mechanism for grouping `variables` (data) and `methods` (code) as a single unit. It is the process of hiding information details and protecting the data and behavior of the object. It is one of the four important concepts of object-oriented programming.
### example
To understand what is encapsulation in detail, consider the following bank account class with deposit and show balance methods

```java 
class Account {
    private int account_number;
    private int account_balance;

    public void show Data() {
        //code to show data 
    }

    public void deposit(int a) {
        if (a < 0) {
            //show error 
        } else
            account_balance = account_balance + a;
    }
}
```

Suppose a hacker managed to access the code to your bank account

You try to deposit an invalid amount (say -100) into your bank account by manipulating the code.
![ ](image-4.png)  ![ ](image-5.png)

If a data member is `private`, it means that it can only be accessed within the same class

![ ](image-6.png)

## refeneces


- ![abstraction](https://tinchicus.com/2019/05/23/java-abstraccion/)
- ![inheritance](https://blog.hubspot.es/website/que-es-herencia-java#:~:text=%C2%BFQu%C3%A9%20es%20la%20herencia%20en,herencia%20entre%20clases%20es%20extends.)
- ![polymorphism](https://ifgeekthen.nttdata.com/es/polimorfismo-en-java-programaci%C3%B3n-orientada-objetos)
- ![encapsulation](https://www.guru99.com/es/java-oops-encapsulation.html#:~:text=Encapsulaci%C3%B3n%20en%20Java%20es%20un,de%20programaci%C3%B3n%20orientada%20a%20objetos.)