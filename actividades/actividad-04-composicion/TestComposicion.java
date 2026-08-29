package actividades2;

public class TestComposicion {

    public static void main(String[] args) {

        Persona persona1 = new Persona(1,"Carlos","Perez",1001);

        Persona persona2 = new Persona(2,"Maria","Lopez",1002);

        System.out.println("--- DATOS DE LAS PERSONAS ---");

        System.out.println(persona1);
        System.out.println(persona2);

        // Se modifican los datos de la cuenta mediante sus setters
        persona1.getCuenta().setSaldo(1500.50);
        persona2.getCuenta().setSaldo(2500.75);

        System.out.println("\n--- DATOS ACTUALIZADOS ---");

        System.out.println(persona1);
        System.out.println(persona2);

        // Se prueba el acceso a los datos mediante getters
        System.out.println("\n--- DATOS DE LAS CUENTAS ---");

        System.out.println("Cuenta persona 1: "
                + persona1.getCuenta().getNumCuenta());

        System.out.println("Saldo persona 1: "
                + persona1.getCuenta().getSaldo());

        System.out.println("Cuenta persona 2: "
                + persona2.getCuenta().getNumCuenta());

        System.out.println("Saldo persona 2: "
                + persona2.getCuenta().getSaldo());
    }
}
