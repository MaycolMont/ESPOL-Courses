package Cuenta;

public class AhorroAdultos extends CuentaBancaria {

    public AhorroAdultos(String id, String cliente, double saldo) {
        super(id, cliente, saldo);
    }

    @Override
    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado con éxito. Saldo actual: " + saldo);
            if (valor > 500) {
                saldo += valor * 0.05;
                System.out.println("Premio por deposito mayor a $500: " + (valor * 0.05));
            }
            return true;
        } else {
            System.out.println("No se puede depositar un valor negativo.");
            return false;
        }
    }
}