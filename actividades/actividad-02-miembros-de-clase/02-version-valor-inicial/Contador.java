package actividades2;

public class Contador {
	static int acumulador;
	final static int VALOR_INICIAL = 10;
	private int valor;

	public static int acumulador() {return acumulador;}

	public Contador(int valor)
	{
		this.valor = valor;
		acumulador += valor;
	}

	public Contador() {
		this(Contador.VALOR_INICIAL);
	}

	public void inc()
	{
		this.valor++;
		acumulador++;
	}

	public int getValor()
	{
		return this.valor;
	}
}
