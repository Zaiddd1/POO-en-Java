package actividades2;

public class Contador {

    static int acumulador;

    final static int VALOR_INICIAL = 10;

    static int nContadores;

    static int ultimoContador;

    private int valor;

    public static int acumulador() {
        return acumulador;
    }

    public static int getNContadores() {
        return nContadores;
    }

    public static int getUltimoContador() {
        return ultimoContador;
    }

    public Contador(int valor) {
        this.valor = valor;
        acumulador += valor;
        nContadores++;
        ultimoContador = valor;
    }

    public Contador() {
        this(Contador.VALOR_INICIAL);
    }

    public void inc() {
        this.valor++;
        acumulador++;
    }

    public int getValor() {
        return this.valor;
    }
}
