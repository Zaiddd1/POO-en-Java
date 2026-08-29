package actividades2;

public class CuentaAhorro extends Cuenta {

    private double tasaInteres;

    public CuentaAhorro(int numero, double saldo, double tasaInteres) {
        super(numero, saldo);
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() {
        saldo += saldo * tasaInteres / 100;
    }

    public String toString() {
        return "CuentaAhorro: numero=" + numero +
                ", saldo=" + saldo +
                ", tasaInteres=" + tasaInteres + "%";
    }
}
