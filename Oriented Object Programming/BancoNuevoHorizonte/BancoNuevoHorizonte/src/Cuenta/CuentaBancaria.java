package Cuenta;

public abstract class CuentaBancaria {
    public String id;
    public double saldo;
    public String cliente;

    public CuentaBancaria(String id, String cliente, double saldo) {
        this.id = id;
        this.cliente = cliente;
        depositar(saldo);
    }

    public abstract boolean depositar(double saldo);

    public void retirar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Retiro realizado con éxito. Saldo actual: " + saldo);
        } else {
            System.out.println("Valor de retiro inválido o saldo insuficiente");
        }
    }

    public double consultarSaldo() {
        System.out.println("Su saldo actual es: " + saldo);
        return saldo;
    }
}
