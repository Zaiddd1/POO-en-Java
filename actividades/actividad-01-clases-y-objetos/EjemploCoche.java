	package actividades2;

// Clase para probar el funcionamiento de la clase Coche
public class EjemploCoche {

	public static void main(String[] args) {

		// Crear los objetos coche utilizando el constructor de cuatro parámetros
		Coche cocheDeportivo = new Coche("Ford", "Mustang", 2024, 1000.0);
		Coche cocheTodoTerreno = new Coche("Toyota", "Hilux", 2008, 2000.0);

		// Encender los coches
		System.out.println("=== ENCENDER COCHES ===");
		cocheDeportivo.encenderCoche();
		cocheTodoTerreno.encenderCoche();

		// Acelerar los coches
		System.out.println("\n=== ACELERAR COCHES ===");
		cocheDeportivo.acelerarCoche();
		cocheTodoTerreno.acelerarCoche();

		// Frenar los coches
		System.out.println("\n=== FRENAR COCHES ===");
		cocheDeportivo.frenarCoche();
		cocheTodoTerreno.frenarCoche();

		// Apagar los coches
		System.out.println("\n=== APAGAR COCHES ===");
		cocheDeportivo.apagarCoche();
		cocheTodoTerreno.apagarCoche();

		// Mostrar los datos utilizando los getters
		System.out.println("\n=== DATOS DE LOS COCHES ===");

		System.out.println("Coche deportivo:");
		System.out.println("Marca: " + cocheDeportivo.getMarca());
		System.out.println("Modelo: " + cocheDeportivo.getModelo());
		System.out.println("Año: " + cocheDeportivo.getAñoFabricacion());
		System.out.println("Precio: " + cocheDeportivo.getPrecio());

		System.out.println("\nCoche todo terreno:");
		System.out.println("Marca: " + cocheTodoTerreno.getMarca());
		System.out.println("Modelo: " + cocheTodoTerreno.getModelo());
		System.out.println("Año: " + cocheTodoTerreno.getAñoFabricacion());
		System.out.println("Precio: " + cocheTodoTerreno.getPrecio());

		// Probar el método aplicarDescuento()
		System.out.println("\n=== APLICAR DESCUENTO ===");

		boolean descuentoDeportivo = cocheDeportivo.aplicarDescuento(10);
		boolean descuentoTodoTerreno = cocheTodoTerreno.aplicarDescuento(10);

		System.out.println("¿Se aplicó descuento al coche deportivo? "
				+ descuentoDeportivo);

		System.out.println("¿Se aplicó descuento al coche todo terreno? "
				+ descuentoTodoTerreno);

		// Mostrar los precios después de aplicar el descuento
		System.out.println("Precio del coche deportivo: "
				+ cocheDeportivo.getPrecio());

		System.out.println("Precio del coche todo terreno: "
				+ cocheTodoTerreno.getPrecio());

		// Probar los setters
		System.out.println("\n=== PROBAR SETTERS ===");

		cocheDeportivo.setMarca("Chevrolet");
		cocheDeportivo.setModelo("Camaro");
		cocheDeportivo.setAñoFabricacion(2005);
		cocheDeportivo.setPrecio(3000.0);

		// Mostrar los nuevos valores utilizando los getters
		System.out.println("Nueva marca: " + cocheDeportivo.getMarca());
		System.out.println("Nuevo modelo: " + cocheDeportivo.getModelo());
		System.out.println("Nuevo año: "
				+ cocheDeportivo.getAñoFabricacion());
		System.out.println("Nuevo precio: "
				+ cocheDeportivo.getPrecio());
	}
}
