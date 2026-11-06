public class Socio{
    private String nombre;
    private int numeroSocio;
    private int contrasena;
    private int librosPrestados = 0;
    private final int MAX_PRESTAMOS = 2; 
    int pin;


    public Socio (String nombre, int numeroSocio, int contrasena){
        this.nombre = nombre;
        this.numeroSocio = numeroSocio;
        this.contrasena = contrasena;
        this.librosPrestados = 0;
    }

    public boolean comprobarContrasena(int pin){
       /* boolean correcto = false;
        if (pin == contrasena){
        correcto = true;
       }
       return correcto; */
       return pin == contrasena;
    }

    public boolean puedePedir(){
       /*boolean puede = false;
        if (this.librosPrestados < 2){
            puede = true;
        }
        return puede; */ 
        return librosPrestados < MAX_PRESTAMOS;
    } 

    public void pedirLibro(Libro libro){
        if (puedePedir()){
            if (Biblioteca.prestar(libro)){
                librosPrestados++;
                System.out.println("Libro prestado");
            }else{
                System.out.println("Libro ya prestado");
            }
                
            }else{
            System.out.println("Ya no puedes pedir mas prestamos");

        }
    }

    public void devolver(Libro libro){
        Biblioteca.devolver(libro);
        librosPrestados--;
        if (librosPrestados < 0 ){
            librosPrestados = 0;
        }
    }

    public void mostrarDatos(){
        System.out.println(this);
    }

    @Override 
    public String toString(){
        return "Nombre : " + this.nombre + "\n# Socio: " + this.numeroSocio + "\nLibros prestrados: " + this.librosPrestados;
    }














    public String getNombre() {
        return nombre;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public int getContrasena() {
        return contrasena;
    }

    public int getLibrosPrestados() {
        return librosPrestados;
    }
}