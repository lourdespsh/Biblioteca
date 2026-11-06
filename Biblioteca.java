import java.util.Scanner;

public class Biblioteca{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Libro libro1 = new Libro("Harry Potter y la piedra filosofal", "JK Rowling", 1997);
        Libro libro2 = new Libro("Harry Potter y la cámara secreta", "JK Rowling", 1998);
        Libro libro3 = new Libro("Harry Potter y el prisionero de Azkaban", "JK Rowling", 1999);

        Socio s1 = new Socio("Camila", 101, 1234);
        Socio s2 = new Socio("Lourdes", 201, 4321);

        int intento = 0;
        

        System.out.println("--- SOCIOS ---");
        System.out.println("101 - Camila");
        System.out.println("201 - Lourdes");
        
        System.out.println("Introduce tu número de socio: ");
        int pruebaNum = scanner.nextInt();

        do { 
            System.out.println("Este socio no existe, escríbelo de nuevo: ");
            pruebaNum = scanner.nextInt();
        } while (pruebaNum != s1.getNumeroSocio() || pruebaNum != s2.getNumeroSocio());

        System.out.println("Contraseña: ");
            int pruebaContrasena = scanner.nextInt();
            intento ++;
       
        do {
            if(pruebaContrasena == s1.getContrasena() || pruebaContrasena == s2.getContrasena()){
                System.out.println("Bienvenida. " );
            }else{
                System.out.printf("\nContraseña incorrecta. Te quedan %d intentos.", 3 - intento);
            }
            
        } while (intento < 4);
        if (intento >= 4){
            System.out.println("Has agotado todos los intentos");

        }

        if(pruebaContrasena == s1.getContrasena() || pruebaContrasena == s2.getContrasena()){

        
        public static boolean prestar(Libro libro){

            return true;
        }
        
        public static void devolver(Libro libro){

        }

    }











}