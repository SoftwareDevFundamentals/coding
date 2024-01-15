
# Principios de la Programacion orientada a objetos:

Existen numerosos principios en programación orientada a objetos, tales como clases y objetos. No obstante, en el desarrollo de software utilizando este paradigma, se encuentran cuatro principios fundamentales que constituyen los cimientos del proceso de desarrollo. A estos cuatro principios, que exploraremos a continuación, les denominamos los fundamentos de la programación orientada a objetos.

Esto no implica que no existan otras ideas igualmente importantes fuera de estos fundamentos, pero estos cuatro pilares representan la base de conceptos más avanzados, por lo que comprenderlos resulta crucial.

Estos fundamentos son: abstracción, encapsulamiento, herencia y polimorfismo.

Nota: Por comodidad de referencia, incluyo aquí la clase que creamos en la entrada anterior:


public class Carro

{

    public string Marca;
 
    public int AñoSalidaAlMercado { get; set; }
 
    public void Acelerar()
    {
    }
}
## Abstracion:

Según la Real Academia Española (RAE), una de las acepciones de abstraer es la siguiente:

"Hacer caso omiso de algo, o dejarlo a un lado." Y proporciona el siguiente ejemplo: "Centremos la atención en lo esencial abstrayendo DE consideraciones marginales."

Este ejemplo encapsula la esencia del concepto de abstraer. Al realizar una abstracción, buscamos pasar por alto detalles que no son necesarios para nosotros y mostrar únicamente lo que es relevante.

Desde la perspectiva del desarrollo de software, podemos observar que mediante una clase podemos llevar a cabo una abstracción de una entidad del mundo real. Tomemos, por ejemplo, la clase "carro" que creamos. Esta tiene la capacidad de almacenar datos relacionados con la marca y el año de lanzamiento al mercado del carro. Sin embargo, ¿por qué solo estas dos informaciones? Un carro del mundo real tiene más propiedades, como el color y el modelo. No obstante, debemos cuestionarnos: ¿Son estas informaciones relevantes para nuestro software?

Nuestra clase abstrae todo lo que representa un carro, seleccionando únicamente lo que nos interesa y descartando todo lo demás.

## Encapsulamiento

Ahora, se usar clases para modelar entidades relevantes para tu aplicación, almacenar datos dentro de objetos y ejecutar funcionalidades. Sin embargo, la pregunta que surge es: ¿Debería cualquiera poder modificar directamente estos datos? ¿Debe cualquiera ejecutar cualquier funcionalidad de nuestros objetos en cualquier momento? Por lo general, esto no es algo que deseamos. Queremos tener control sobre la forma en que se asignan los datos, decidir quién puede ver la información interna de nuestros objetos y, tal vez, regular la ejecución de funcionalidades de los objetos. Aquí es donde entra en juego el concepto de encapsulamiento.

El encapsulamiento nos permite controlar quién puede ver y utilizar los diversos módulos internos de nuestro sistema. En términos de clases, el encapsulamiento define el acceso a los miembros de la clase.

En C#, podemos emplear modificadores de acceso para especificar el control de agentes externos sobre distintas partes de nuestro sistema, como clases, miembros de clases, interfaces, entre otros. Supongamos que tenemos una variable llamada "velocidad", la cual deseamos incluir en nuestra clase "Carro" para indicar la velocidad a la que se desplaza un vehículo en particular. Sin embargo, queremos que solo dentro de la clase se pueda ver y modificar el valor de esta variable. Esto se puede lograr mediante un campo o una propiedad. Optemos por hacerlo con una propiedad:


public class Carro

{

    public string Marca;
 
    public int AñoSalidaAlMercado { get; set; }
 
    private int Velocidad { get; set; }
 
    public void Acelerar()
    {
        Velocidad += 10;
    }

}

Cuando hagamos una instancia de la clase Carro, no podremos acceder al valor de la propiedad Velocidad, ni tampoco podemos alterarlo desde afuera. Lo que sí podemos hacer es utilizar la función acelerar para aumentar el valor de la velocidad en 10 unidades. Esta es una de las ventajas del encapsulamiento: Nos permite controlar la manera en que se va a alterar la data interna de nuestro objeto.

Si quisiéramos que agentes externos puedan ver el valor la propiedad Velocidad, pero que no puedan alterar libremente dicho valor, podemos utilizar la siguiente sintaxis:

public int Velocidad { get; private set; }

## Herencia

Compartir código es una característica crucial en cualquier proyecto de software, ya que permite ahorrar trabajo al realizar cambios en el sistema y posibilita que un solo algoritmo pueda procesar distintas clases de entidades, entre otras ventajas.

Existen diversas formas de compartir código, y una de ellas es mediante el uso de herencia. La herencia establece una relación especial entre dos clases: la clase base y la clase derivada. En esta relación, la clase derivada adquiere la capacidad de utilizar propiedades y funcionalidades específicas de la clase base, incluso teniendo la posibilidad de sustituir la funcionalidad de esta última. La idea principal es que la clase derivada "hereda" algunas de las características de la clase base.

Podemos ilustrar esto con un ejemplo utilizando la clase "Carro". Un carro se considera un tipo de vehículo, y además, deseamos procesar otros tipos de vehículos, como un camión. Tanto el carro como el camión comparten el concepto de velocidad, y ambos tienen la capacidad de acelerar y de retroceder. No obstante, cuando un camión retrocede, debe emitir un sonido. Finalmente, un carro debe tener la capacidad de encender la radio. A continuación, procedamos a modelar esto:


public class Vehículo
{

    public string Marca;
 
    public int AñoSalidaAlMercado { get; set; }
 
    public int Velocidad { get; private set; }
 
    public void Acelerar()
    {
        Velocidad += 10;
    }
 
    public virtual void Reversa()
    {
 
        Console.WriteLine("Voy de reversa!");
    }
}

public class Carro: Vehículo

{

public void EncenderRadio()

{
    Console.WriteLine("Encendiendo la radio");
}

}

public class Camión: Vehículo

{
public override void Reversa()

    {
        base.Reversa();
        Console.WriteLine("BEEP BEEP BEEP!");
    }
}

Vemos que tenemos 3 clases: Vehículo, Carro y Camión. Carro y Camión heredan de la clase Vehículo. La relación de herencia se representa de esta manera:

### class Carro: Vehículo

Con esta sintaxis, establecemos que "Carro" es una clase derivada de "Vehículo".

Observamos que la función "Acelerar" está definida en la clase "Vehículo", lo que permite que todas las clases derivadas puedan hacer uso de dicha función. Lo mismo ocurre con los campos y propiedades.

Ciertamente, las clases "Carro" y "Camión" pueden definir sus propios miembros que no están directamente relacionados con la clase "Vehículo". Por ejemplo, la clase "Carro" tiene el método "EncenderRadio", el cual solo esta clase posee.

Es posible también modificar la funcionalidad de la clase base. Para lograr esto, en la clase base, el método debe ser marcado como "virtual". Cuando se desea sobrescribir, es decir, cambiar o agregar funcionalidad, podemos hacerlo utilizando "override", como se muestra en la clase "Camión". Dentro del método "Reversa" de la clase "Camión", encontramos el código "base.Reversa();", el cual se utiliza para invocar el método "Reversa" de la clase base.

Podemos utilizar el código anterior de la siguiente manera:

> Carro miCarro = new Carro();

>miCarro.AñoSalidaAlMercado = 2018;

>miCarro.Acelerar();

>Console.WriteLine(miCarro.Velocidad);

>miCarro.Reversa();

>Console.WriteLine("-------");

>Camión miCamion = new Camión();

>miCamion.Acelerar();

>miCamion.AñoSalidaAlMercado = 2012;

>miCamion.Reversa();

## Polimorfismo

Cuando empezamos a hablar de herencia, dijimos que la herencia “permite que un solo algoritmo pueda procesar distintas clases de entidades”. La idea es que podemos tener una función la cual reciba un parámetro, como una clase base, y podemos pasarle a ese método objetos que sean instancias de las clases derivadas de dicha clase base. Lo mismo ocurre si el método recibe como parámetro una interfaz. Podemos pasarle a dicho método cualquier clase que implemente dicha interfaz.

Polimorfismo significa de muchas formas. En nuestro caso llamamos polimorfismo cuando un método recibe un parámetro que abarca varios tipos.

Veamos un ejemplo de polimorfismo donde pasamos a un método la clase base Vehículo:

////

static void Reparar(Vehículo vehículo)

{

    Console.WriteLine("Iniciando reparación");
 
    Console.WriteLine("Probando acelerador");
 
    Console.WriteLine($"Velocidad inicial {vehículo.Velocidad}");
 
    vehículo.Acelerar();
 
    Console.WriteLine($"Velocidad final {vehículo.Velocidad}");
 
    Console.WriteLine("Probando reversa");
 
    vehículo.Reversa();
 
    Console.WriteLine("Listo!");

}

Este método invoca los métodos "Acelerar" y "Reversa" del vehículo que se le envíe como parámetro. La ventaja que esto ofrece es que podemos generalizar algoritmos para que funcionen con distintos tipos. En este caso, este método va a funcionar con cualquier clase que herede de "Vehículo". En tal sentido, incluso si en el futuro agregamos la clase "Motocicleta", la cual hereda de "Vehículo", podemos utilizar esta nueva clase con el método "Reparar", y va a funcionar perfectamente. De esta manera, se manifiesta el polimorfismo, ya que el método "Reparar" puede trabajar con varios tipos distintos.

En el método "Reparar", no podemos hacer uso del método "EncenderRadio" de la clase "Carro", ya que la clase "Vehículo" no implementa dicho método. No obstante, podríamos emplear el operador "is" para realizar un casting a "Carro" en caso de que el "Vehículo" sea un carro:

if (vehículo is Carro miCarro)

{

    miCarro.EncenderRadio();

}

Esta sintaxis es una manera resumida de decir:

if (vehículo is Carro)

{

    Carro miCarro = vehículo as Carro;
 
    miCarro.EncenderRadio();

}