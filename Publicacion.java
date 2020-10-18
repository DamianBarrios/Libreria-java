
package libreria;

public class Publicacion {
    private int codigo;
    private String titulo;
    private int año;

    public Publicacion(int codigo , String titulo , int año) {
        this.año= año;
        this.codigo = codigo;
        this.titulo = titulo;

    }

    public String getTitulo() {
        return titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getAño() {
        return año;
    }
}
