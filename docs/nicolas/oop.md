# OOP pillars
> [!IMPORTANT]
> Object-Oriented Programming (OOP) is a programming paradigm **focused on representing data through _objects_ and _classes_**, with JAVA serving as a notable example. In this paradigm, classes act as templates, offering abstraction without memory consumption. Objects, instances of classes, are tangible entities that occupy memory space.

### Access Modifier
The access modifier of a method dictates its visibility to other classes and controls access levels. Common modifiers are   `public` (accessible by any class), `private` (restricted to its own class), `protected` (accessible within its package and by subclasses), and `package-private` (default, limiting access to classes within the same package).

### The Return Type
The return type in a method specifies the data type of the value the method will provide after execution. If the method doesn't yield any value, the return type is designated as `void`. Otherwise, it can be any data type such as **_int_, _String_, _boolean_, or any _object type_.**

### Method Name
The method name, acting as the identifier for reference, should adhere to language-specific naming conventions. **Typically starting with a _lowercase letter_**, it often takes the form of a verb or verb phrase **indicating the _operation performed by the method_**, like `calculateTotal`, `printDetails`, or `isEmpty`.

### Parameter List
Parameters in a method are a sequence of variables enclosed in parentheses `()`, serving as **_inputs for the method's operation_**. Each parameter is defined with a data type and an identifier name, and multiple parameters are separated by commas.

### Exception List
Certain programming languages, such as Java, permit methods to declare a list of exceptions they may throw during execution. This list, part of the method signature, is specified with the `throws` keyword, followed by the types of exceptions. **It serves to notify method callers about _potential exceptions_**, prompting them to include appropriate exception-handling code.

### Method Body
The method body, enclosed in braces `{}`, **houses the code that defines the method's functionality**. Comprising a sequence of statements, this code is executed when the method is called. Within the method body, the actual logic is implemented, involving manipulation of variables, invocation of other methods, execution of loops, and the generation of a return value if applicable.

> [!NOTE]
> OOPS moves around its four most important pillars. These are; **Inheritance, Polymorphism, Abstraction, and Encapsulation**.

# Inheritance
### Types of Inheritance
> There are a total of five types of Inheritance in OOPS.
1. Single Inheritance
   * In single inheritance, a single subclass extends from a single superclass.
     ![Screenshot of a diagram explaining the single inheritance](/images/inheritance/singleInheritance.png)
   * 
2. Multilevel  Inheritance
   * In multilevel inheritance, a subclass extends from a superclass and then the same subclass acts as a superclass for another class. For example
     ![Screenshot of a diagram explaining the Multilevel inheritance](/images/inheritance/multilevelInheritance.png)
3. Hierarchical  Inheritance
   * In hierarchical inheritance, multiple subclasses extend from a single superclass. For example
     ![Screenshot of a diagram explaining the Hierarchical inheritance](/images/inheritance/hierarchicalInheritance.png)
4. Multiple  Inheritance
   * In multiple inheritance, a single subclass extends from multiple superclasses. For example
     ![Screenshot of a diagram explaining the Multiple inheritance](/images/inheritance/multipleInheritance.png)
   * 
> [!NOTE]
> Java doesn't support multiple inheritance. However, we can achieve multiple inheritance using interfaces.

5. Hybrid  Inheritance
   * Hybrid inheritance is a combination of two or more types of inheritance. For example
     ![Screenshot of a diagram explaining the Hybrid inheritance](/images/inheritance/hybridInheritance.png)
> Here, we have combined hierarchical and multiple inheritance to form a hybrid inheritance.



### Advantages of Inheritance
* Code reusability
* We can achieve Polymorphism using Inheritance.
### Disadvantages of Inheritance
* The child class and the parent class are tightly coupled. Any changes in the parent class equally affect all the child classes.
### Example Code
![Screenshot of an example code of basic Inheritance](/images/inheritance/inheritanceCode.png)
### Output 
> My name is Silvestre     
> I can eat

In the above example, we have derived a subclass `Dog` from superclass `Animal`. Notice the statements

> chapa.name = "Silvestre";  
> chapa.eat();

Here, `chapa` is an object of `Dog`. However, `name` and `eat()` are the members of the `Animal` class. Since `Dog` inherits the field and method from `Animal`, we are able to access the field and method using the object of the `Dog`.

# Polymorphism
> Poly means many, and morphism means forms. We know that Water also exists in multiple states, such as Solid, Liquid, and Gas. So Water shows Polymorphism. In Java, we can achieve Polymorphism using methods. There are two types of Polymorphism  that JAVA supports.
### Example code
![Screenshot of an example code of basic Polymorphism](/images/polymorphism/polymorphismBaseCode.png)
### Output
> Rendering Square...     
Rendering Circle...

In the above example, we have created a superclass: `Polygon` and two subclasses: `Square` and `Circle`. Notice the use of the `render()` method.
The main purpose of the `render()` method is to render the shape. However, the process of rendering a square is different than the process of rendering a circle.
Hence, the `render()` method behaves differently in different classes. Or, we can say render`render()` is polymorphic.

### Compile-time Polymorphism
Compile-time polymorphism, also known as static or early binding, occurs when the association between an object and its functionality is determined at compile time. In Java, this is achieved through **_method overloading_**, where multiple methods in a class share the same name but have different parameter lists. During compilation, Java determines which method to call based on the method signatures, enabling the selection of the appropriate method at compile time. This is an example of compile-time polymorphism, as opposed to runtime polymorphism, which occurs dynamically during program execution.
### Example Compile code
![Screenshot of an example code Compile Polymorphism](/images/polymorphism/compilePolymorphismCode.png)
### Output
> 5     
5.0

> [!NOTE]
> The compiler handles Compile-time Polymorphism.

### Runtime polymorphism
Runtime polymorphism, also known as dynamic or late binding, occurs when an object is associated with its functionality during runtime. In Java, this is achieved through method overriding, where a child class provides a specific implementation of a method declared in its parent class. During program execution, the Java Virtual Machine (JVM) dynamically determines the proper method to call based on the actual object type. Unlike compile-time polymorphism, which is determined at compile time, runtime polymorphism allows for flexibility in method selection during program execution. This is exemplified in situations where a child class overrides a method inherited from its parent class.

### Example Runtime code
![Screenshot of an example code Run-Time Polymorphism](/images/polymorphism/runtimePolymorphismCode.png)
### Output
> Method 2

> [!NOTE]
> JVM handles the runtime polymorphism.

### Differences between both 
![Screenshot of the differences between both types of compilation](/images/polymorphism/Differences.png)

# Abstraction

# Encapsulation

# Sources

