/*
Investigación 3: OOP
Investigar sobre los pilares de paradigma orientado a objetos.

1. Encapsulamiento
El encapsulamiento es el principio que restringe el acceso a ciertos componentes de un objeto. Esto se logra mediante la definición de atributos y métodos como privados o protegidos, de modo que solo puedan ser accedidos y modificados a través de métodos públicos (getters y setters). El encapsulamiento ayuda a proteger los datos y asegura que el objeto se manipule solo de maneras predefinidas.

2. Abstracción
La abstracción implica ocultar los detalles complejos de la implementación y mostrar solo las funcionalidades esenciales. Esto permite a los programadores centrarse en los problemas de alto nivel y usar las clases y objetos sin preocuparse por los detalles internos.
*/

public class Persona {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}


/*
2. Abstracción
La abstracción implica ocultar los detalles complejos de la implementación y mostrar solo las funcionalidades esenciales. Esto permite a los programadores centrarse en los problemas de alto nivel y usar las clases y objetos sin preocuparse por los detalles internos.
*/

public abstract class Animal {
    public abstract void hacerSonido();
}

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

/*
3. Herencia
La herencia es un mecanismo que permite crear una nueva clase basada en una clase existente. La clase nueva, llamada clase derivada o subclase, hereda atributos y métodos de la clase existente, llamada clase base o superclase. Esto promueve la reutilización de código y establece una relación jerárquica entre las clases.
*/

public class Animal {
    protected String nombre;

    public void comer() {
        System.out.println("El animal está comiendo");
    }
}

public class Perro extends Animal {
    public void ladrar() {
        System.out.println("Guau");
    }
}



/*
4. Polimorfismo
El polimorfismo permite tratar a objetos de diferentes clases de la misma manera a través de una interfaz común. Esto se logra mediante la sobrecarga de métodos y la sobrescritura de métodos. El polimorfismo se divide en dos tipos principales:

Polimorfismo en tiempo de compilación (sobrecarga de métodos): Permite definir múltiples métodos con el mismo nombre pero diferentes firmas (diferente número o tipo de parámetros).
Polimorfismo en tiempo de ejecución (sobrescritura de métodos): Permite que una subclase proporcione una implementación específica de un método que ya está definido en su superclase.
*/

public class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}


/*
Resumen
Encapsulamiento: Protege los datos y asegura el acceso controlado.
Abstracción: Oculta los detalles complejos y expone solo las funcionalidades esenciales.
Herencia: Promueve la reutilización de código y establece jerarquías.
Polimorfismo: Permite tratar objetos de diferentes clases de la misma manera, ya sea en tiempo de compilación o en tiempo de ejecución.
Estos pilares son fundamentales para diseñar y estructurar software de manera eficiente y modular, lo que facilita la mantenibilidad y escalabilidad de los sistemas.
*/