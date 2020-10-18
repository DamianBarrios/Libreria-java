package libreria;

public class Revista extends Publicacion {

    private int numero;
    public boolean disponible;

    public Revista(int codigo, String titulo, int año, int numero , boolean disponible) {
        super(codigo, titulo, año);
        this.disponible = disponible;
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
    
     public String disponible(){
        if(this.disponible){
           return "esta disponible"; 
        }else{
          return "no esta disponible";  
        }  
    }
     
     public String infoRevista() {
        return "Código" + super.getCodigo() + ": La revista " + super.getTitulo() + " numero " + this.numero + " del año " + super.getAño() + "," + disponible();
    }
}
