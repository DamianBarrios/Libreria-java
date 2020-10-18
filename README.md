# Libreria-java
## Proyecto académico sistema de libreria.

Escribir un programa que tenga libros y revistas

• Las características comunes que se almacenan tanto para las revistas como para
los libros son el código, el título, y el año de publicación. Estas tres
características se pasan por parámetro en el momento de crear los objetos.

• Los libros tienen además un atributo prestado. Los libros, cuando se crean, no
están prestados.

• Las revistas tienen un número. En el momento de crear las revistas se pasa el
número por parámetro.

• Tanto las revistas como los libros deben tener (aparte de los constructores) un
método toString() que devuelve la información completa de los mismos. También
tienen un método que devuelve el año de publicación, y otro el código.

• Para prevenir posibles cambios en el programa se tiene que implementar
una interfaz Prestable con los métodos prestar(), devolver() y prestado.
La clase Libro implementa esta interfaz

### Implementación

1. Se implementa una superclase de Libro y Revista con sus características
comunes, que se llama Publicación. En esta clase además de declarar los tres
atributos, se implementa un constructor que reciba por parámetro el valor de los
tres atributos. También se implementa un constructor que reciba por parámetro
el valor de los tres atributos. También se implementan los métodos getAnio(),
getCodigo() y un método toString() que devuelve la información de estos tres
atributos.

2. Se implementan las clases Libro y Revista que añaden sus nuevos atributos.

3. Se escriben constructores, que llaman al constructor de la clase padre.

4. Se sobreescribe el método toString(), que también llama al método
toString() de la superclase.

5. La interfaz Prestable declara los métodos indicados sin implementarlos. La
clase Libro la implementa.

6. Hacer una clase Inicializador para:

1. Cargar dentro de un Array distintos libros y revistas. Esta información es
fija y no la carga el usuario.

2. Preguntarle al usuario si quiere devolver o pedir prestado un libro

3. Preguntarle al usuario el código del libro

4. Preguntarle al usuario si quiere realizar otra operación

5. Al finalizar, si el usuario no quiere relaizar otra operación, el programa
debe imprimir la información de todos los libros y el estado de cada uno
(si esta o no prestado)
