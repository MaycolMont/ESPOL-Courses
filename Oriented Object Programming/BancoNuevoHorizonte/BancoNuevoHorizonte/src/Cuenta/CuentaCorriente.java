package Cuenta;

public class CuentaCorriente extends CuentaBancaria{
    public CuentaCorriente(String id, String cliente, double saldo) {
        super(id, cliente, saldo);
    }

    @Override
    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado con éxito. Saldo actual: " + saldo);
            if (valor > 15000) {
                saldo += saldo * 0.005;
                System.out.println("Premio por deposito mayor a $15000: " + (saldo * 0.005));
            }
            return true;
        } else {
            System.out.println("No se puede depositar un valor negativo.");
            return false;
        }
    }
}
