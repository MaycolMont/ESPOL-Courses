package Cuenta;

public class AhorroJovenes extends CuentaBancaria {
    private int puntos;

    public AhorroJovenes(String id, String cliente, double saldo) {
        super(id, cliente, saldo);
    }

    @Override
    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado con éxito. Saldo actual: " + saldo);
            if (valor > 20) {
                puntos += 1000;
                System.out.println("Ha ganado " + 1000 + " puntos por su deposito mayor a $20");
            }
            return true;
        } else {
            System.out.println("No se puede depositar un valor negativo.");
            return false;
        }
    }
}
