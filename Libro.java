public class Libro{
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private boolean estaPrestado = true;
    private int vecesPrestado = 0;


    public Libro (String titulo, String autor, int anoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.estaPrestado = false;
        this.vecesPrestado = 0;
    }

    public void mostrarInfo(){
        System.out.printf("Titulo del libro: ", this.titulo);
        System.out.printf("Autor: ", this.autor);
        System.out.printf("Libro publicado en ",this.anoPublicacion);
        //System.out.printf("Disponibilidad: ", disponible);
    }


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public boolean isDisponible() {
        return estaPrestado;
    }

    public int getVecesPrestado() {
        return vecesPrestado;
    }


}