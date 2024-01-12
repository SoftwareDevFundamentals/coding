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

# Abstraction

# Encapsulation

# Sources

