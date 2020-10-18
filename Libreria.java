package libreria;

import java.util.Scanner;

public class Libreria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Libreria libreria = new Libreria();
        Libro[] Libro = libreria.cargarLibros();
        Revista[] Revista = libreria.cargarRevistas();

        int seguir;
        System.out.println("Quiere operar sobre: ");
        System.out.println("1: Libros o 2: Revistas");
        int seleccionar = entrada.nextInt();
        if (seleccionar == 1) {
            libreria.infoLibros(Libro);
            do {
                System.out.println("Quiere pedir prestado o devolver un libro(1-2)");
                int elegir = entrada.nextInt();
                if (elegir == 1) {
                    System.out.println("Que libro desea? (Elegir según su codigo)");
                    int codigo = entrada.nextInt();
                    for (int i = 0; i < Libro.length; i++) {
                        if (codigo == Libro[i].getCodigo()) {
                            Libro[i].prestar();
                        }
                    }
                    libreria.infoLibros(Libro);
                } else if (elegir == 2) {
                    System.out.println("¿Cual libro desea devolver? (Elegir según su codigo)");
                    int codigo = entrada.nextInt();
                    for (int i = 0; i < Libro.length; i++) {
                        if (codigo == Libro[i].getCodigo()) {
                            Libro[i].devolver();
                        }
                    }
                }
                System.out.println("¿Desea realizar otra operacion? (1: si 2: no)");
                seguir = entrada.nextInt();
            } while (seguir == 1);
        } else if (seleccionar == 2) {

            libreria.infoRevistas(Revista);
            do {
                System.out.println("¿Que revista desea?(Elegir segun el codigo)");
                int elegir = entrada.nextInt();

                for (int i = 0; i < Revista.length; i++) {
                    if (elegir == Revista[i].getCodigo()) {
                        Revista[i].setDisponible(false);
                    }
                }

                System.out.println("¿Desea realizar otra operacion? (1: si 2: no)");
                seguir = entrada.nextInt();
            } while (seguir == 1);
        }
        libreria.infoLibros(Libro);
        libreria.infoRevistas(Revista);

    }

    public Libro[] cargarLibros() {
        Libro[] Libro = new Libro[3];
        Libro[0] = new Libro(1, "Rayuela", 1963, false);
        Libro[1] = new Libro(2, "Cien años de soledad", 1982, false);
        Libro[2] = new Libro(3, "El Principito", 1943, false);
        return Libro;
    }

    public Revista[] cargarRevistas() {
        Revista[] Revista = new Revista[3];
        Revista[0] = new Revista(4, "Gente", 2019, 50, true);
        Revista[1] = new Revista(5, "Caras", 2015, 60, true);
        Revista[2] = new Revista(6, "Pronto", 2018, 70, true);
        return Revista;
    }

    public void infoLibros(Libro[] Libro) {
        System.out.println("Libros: ");
        for (int i = 0; i < Libro.length; i++) {
            System.out.println(Libro[i].infoLibro());
        }
        System.out.println("");
    }

    public void infoRevistas(Revista[] Revista) {
        System.out.println("Revistas: ");
        for (int i = 0; i < Revista.length; i++) {
            System.out.println(Revista[i].infoRevista());
        }
        System.out.println("");
    }
}
