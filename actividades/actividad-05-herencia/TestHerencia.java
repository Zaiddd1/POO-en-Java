package actividades2;

public class TestHerencia {

    public static void main(String[] args) {

        CuentaAhorro ahorro = new CuentaAhorro(2001, 1000.0, 5.0);
        CuentaCorriente corriente = new CuentaCorriente(3001, 500.0, 300.0);

        System.out.println("--- DATOS INICIALES ---");
        System.out.println(ahorro);
        System.out.println(corriente);

        ahorro.aplicarInteres();

        System.out.println("\n--- DESPUES DEL INTERES ---");
        System.out.println(ahorro);

        boolean retiroAhorro = ahorro.retirar(2000.0);
        boolean retiroCorriente = corriente.retirar(700.0);

        System.out.println("\n--- INTENTOS DE RETIRO ---");
        System.out.println("Retiro cuenta ahorro (2000.0): " + retiroAhorro);
        System.out.println("Retiro cuenta corriente (700.0): " + retiroCorriente);

        System.out.println("\n--- SALDOS FINALES ---");
        System.out.println(ahorro);
        System.out.println(corriente);
    }
}
