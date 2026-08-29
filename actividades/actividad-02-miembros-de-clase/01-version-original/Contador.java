package actividades2;

// Clase que permite llevar un contador individual y un acumulador general
public class Contador {

    // Variable estatica que almacena la suma de todos los contadores
    static int acumulador= 0;

    // Guarda el valor individual de cada objeto Contador
    private int valor;

    // Metodo que devuelve el valor actual del acumulador general
    public static int acumulador() {
        return acumulador;
    }

    // Constructor que recibe un valor inicial
    public Contador(int valor)
    {
        // Guarda el valor recibido en la variable del objeto
        this.valor = valor;

        // Suma el valor recibido al acumulador general
        acumulador += valor;
    }

    // Metodo que incrementa el valor del contador en uno
    public void inc()
    {
        // Aumenta en uno el valor individual
        valor++;

        // Aumenta en uno el acumulador general
        acumulador++;
    }

    // Metodo que devuelve el valor individual del contador
    public int getValor()
    {
        return this.valor;
    }
}
