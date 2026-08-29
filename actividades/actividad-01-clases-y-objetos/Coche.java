package actividades2;

// Clase Coche
public class Coche {

	// Atributos de la clase
	private String marca;
	private String modelo;
	private double precio;
	private int añoFabricacion;

	// Constructor por defecto
	public Coche()
	{
		this.marca = "";
		this.modelo = "";
		this.precio = 0.0;
		this.añoFabricacion = 0;
	}

	// Constructor con cuatro parámetros
	public Coche(String marca, String modelo, int añoFabricacion, double precio)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.añoFabricacion = añoFabricacion;
		this.precio = precio;
	}

	// Métodos getters para obtener los valores de los atributos
	public String getMarca() {return marca;}
	public String getModelo() {return modelo;}
	public double getPrecio() {return precio;}
	public int getAñoFabricacion() {return añoFabricacion;}

	// Métodos setters para modificar los valores de los atributos
	public void setMarca(String marca) {this.marca = marca;}
	public void setModelo(String modelo) {this.modelo = modelo;}
	public void setPrecio(double precio) {this.precio = precio;}
	public void setAñoFabricacion(int añoFabricacion) {this.añoFabricacion = añoFabricacion;}

	// Método que aplica un descuento si el coche fue fabricado antes del 2010
	public boolean aplicarDescuento(double descuento)
	{
		if(añoFabricacion < 2010)
		{
			// Calcula y aplica el descuento al precio
			precio = precio - (precio * descuento / 100);

			// Indica que el descuento fue aplicado
			return true;
		}

		// Indica que el descuento no fue aplicado
		return false;
	}

	// Método para encender el coche
	public void encenderCoche()
	{
		System.out.println("Coche: " + marca + " esta encendido");
	}

	// Método para acelerar el coche
	public void acelerarCoche()
	{
		System.out.println("Coche: " + marca + " esta acelerando");
	}

	// Método para frenar el coche
	public void frenarCoche()
	{
		System.out.println("Coche: " + marca + " esta frenando");
	}

	// Método para apagar el coche
	public void apagarCoche()
	{
		System.out.println("Coche: " + marca + " esta apagado");
	}
}
