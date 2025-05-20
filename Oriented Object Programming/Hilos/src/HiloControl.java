public class HiloControl {
    public static void main(String[] args) {
        Thread t1= new Thread(new HiloRunnable("Hilo 1"));
        Thread t2= new Thread(new HiloRunnable("Hilo 2"));

        t1.start();
        t2.start();

        try {
            Thread.sleep(1);
            System.err.println("Interrumpiendo hilos");
            t1.interrupt();

        } catch (InterruptedException e){
            System.out.println("La ejecución del programa ha sido interrumpida");
        }

        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e){
            System.out.println("La ejecución del programa ha sido interrumpida");
        }
        System.out.println("Hilo principal");
    }
}
    