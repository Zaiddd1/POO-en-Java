package actividades2;

public class TestAgregacion {

    public static void main(String[] args) {

        Motor motor1 = new Motor(1001, 3000);
        Motor motor2 = new Motor(1002, 3500);

        Automovil auto1 = new Automovil("ABC-123",4,"Toyota","Corolla");

        Automovil auto2 = new Automovil("XYZ-789",2,"Ford","Mustang");

        // Se asigna un motor a cada automovil
        auto1.setMotor(motor1);
        auto2.setMotor(motor2);

        System.out.println("--- DATOS DE LOS AUTOMOVILES ---");

        System.out.println(auto1);
        System.out.println(auto2);

        System.out.println("\n--- DATOS DE LOS MOTORES ---");

        System.out.println(motor1);
        System.out.println(motor2);

        // Se prueba la modificacion de datos mediante setters
        auto1.setMarca("Honda");
        motor1.setRevPorMin(4000);

        System.out.println("\n--- DATOS ACTUALIZADOS ---");

        System.out.println(auto1);
        System.out.println(motor1);
    }
}
