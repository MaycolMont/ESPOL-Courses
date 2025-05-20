public class App {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Thread produccionThread = new Thread(new ProduccionPiezas());
        Thread ensamblajeThread = new Thread(new EnsamblajeProductos(produccionThread));
        Thread controlCalidadThread = new Thread(new ControlCalidad(ensamblajeThread));

        produccionThread.start();
        ensamblajeThread.start();
        controlCalidadThread.start();

        try {
            controlCalidadThread.join();
        } catch (InterruptedException e) {
            System.out.println("Programa principal interrumpido.");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Tiempo total de ejecución: " + (endTime - startTime) + " ms.");
    }
}
