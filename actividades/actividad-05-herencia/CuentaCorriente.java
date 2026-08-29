package actividades2;

public class CuentaCorriente extends Cuenta {

    private double limiteSobregiro;

    public CuentaCorriente(int numero, double saldo, double limiteSobregiro) {
        super(numero, saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo + limiteSobregiro) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public String toString() {
        return "CuentaCorriente: numero=" + numero +
                ", saldo=" + saldo +
                ", limiteSobregiro=" + limiteSobregiro;
    }
