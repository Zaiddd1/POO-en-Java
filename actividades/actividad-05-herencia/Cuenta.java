package actividades2;

public class Cuenta {

    protected int numero;
    protected double saldo;

    public Cuenta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Cuenta: numero=" + numero +
                ", saldo=" + saldo;
    }
}
