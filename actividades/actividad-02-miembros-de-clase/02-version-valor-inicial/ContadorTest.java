package actividades2;

public class ContadorTest {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("       PRUEBA DE LA CLASE CONTADOR");
        System.out.println("======================================");

        System.out.println("\n--- ESTADO INICIAL ---");
        System.out.println("Acumulador inicial: " + Contador.acumulador());

        Contador c1 = new Contador();

        System.out.println("\n--- CREACIÓN DE c1 ---");
        System.out.println("Valor de c1: " + c1.getValor());
        System.out.println("Acumulador: " + Contador.acumulador());

        Contador c2 = new Contador(5);

        System.out.println("\n--- CREACIÓN DE c2 ---");
        System.out.println("Valor de c2: " + c2.getValor());
        System.out.println("Acumulador: " + Contador.acumulador());

        c1.inc();

        System.out.println("\n--- INCREMENTO DE c1 ---");
        System.out.println("Valor de c1: " + c1.getValor());
        System.out.println("Valor de c2: " + c2.getValor());
        System.out.println("Acumulador: " + Contador.acumulador());

        c2.inc();
        c2.inc();

        System.out.println("\n--- DOS INCREMENTOS DE c2 ---");
        System.out.println("Valor de c1: " + c1.getValor());
        System.out.println("Valor de c2: " + c2.getValor());
        System.out.println("Acumulador: " + Contador.acumulador());

        Contador c3 = new Contador(20);

        System.out.println("\n--- CREACIÓN DE c3 ---");
        System.out.println("Valor de c3: " + c3.getValor());
        System.out.println("Acumulador: " + Contador.acumulador());

        c3.inc();
        c3.inc();
        c3.inc();

        System.out.println("\n--- TRES INCREMENTOS DE c3 ---");
        System.out.println("Valor de c3: " + c3.getValor());
        System.out.println("Acumulador: " + Contador.acumulador());

        System.out.println("\n--- VALORES FINALES ---");
        System.out.println("c1 = " + c1.getValor());
        System.out.println("c2 = " + c2.getValor());
        System.out.println("c3 = " + c3.getValor());
        System.out.println("Acumulador final = " + Contador.acumulador());

        System.out.println("\n--- CONSTANTE ---");
        System.out.println("VALOR_INICIAL = " + Contador.VALOR_INICIAL);

        System.out.println("\n--- VERIFICACIÓN ---");

        if (c1.getValor() == 11) {
            System.out.println("c1 funciona correctamente.");
        } else {
            System.out.println("Error en c1.");
        }

        if (c2.getValor() == 7) {
            System.out.println("c2 funciona correctamente.");
        } else {
            System.out.println("Error en c2.");
        }

        if (c3.getValor() == 23) {
            System.out.println("c3 funciona correctamente.");
        } else {
            System.out.println("Error en c3.");
        }

        if (Contador.acumulador() == 41) {
            System.out.println("El acumulador funciona correctamente.");
        } else {
            System.out.println("Error en el acumulador.");
        }

        System.out.println("\n======================================");
        System.out.println("          FIN DE LA PRUEBA");
        System.out.println("======================================");
    }
}
