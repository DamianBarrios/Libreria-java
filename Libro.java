package libreria;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(int codigo, String titulo, int año, boolean prestado) {
        super(codigo, titulo, año);
        this.prestado = prestado;
    }
    
    public int getCodigo(){
        return super.getCodigo();
    }

    @Override
    public boolean prestar() {
        return this.prestado = true;
    }

    @Override
    public boolean devolver() {
        return this.prestado = false;
    }

    @Override
    public String prestado() {
        if (this.prestado) {
            return " no está disponible";
        } else {
            return " está disponible";
        }
    }
    
    public String infoLibro() {
        return "Código " + super.getCodigo() + ": El libro " + super.getTitulo() + " del año " + super.getAño() + prestado();
    }
}
