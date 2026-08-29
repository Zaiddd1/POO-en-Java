package actividades2;

// Clase de prueba para comprobar el funcionamiento de Contador
public class ContadorTest {

    // Metodo principal donde se ejecuta el programa
    public static void main(String[] args) {

        // Se declaran dos objetos de tipo Contador
        Contador c1, c2;

        // Muestra el valor inicial del acumulador
        System.out.println(Contador.acumulador());

        // Crea el primer contador con un valor inicial de 3
        c1 = new Contador(3);

        // Crea el segundo contador con un valor inicial de 10
        c2 = new Contador(10);

        // Incrementa el valor del primer contador
        c1.inc();

        // Incrementa nuevamente el valor del primer contador
        c1.inc();

        // Incrementa el valor del segundo contador
        c2.inc();

        // Muestra el valor final del primer contador
        System.out.println(c1.getValor());

        // Muestra el valor final del segundo contador
        System.out.println(c2.getValor());

        // Muestra el valor acumulado de todos los contadores
        System.out.println(Contador.acumulador);
    }
}
