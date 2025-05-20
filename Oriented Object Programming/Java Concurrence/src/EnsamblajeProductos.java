class EnsamblajeProductos implements Runnable {
    private Thread produccionThread;

    public EnsamblajeProductos(Thread produccionThread) {
        this.produccionThread = produccionThread;
    }

    @Override
    public void run() {
        try {
            produccionThread.join(); // Espera a que se complete la producción de piezas
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ensamblaje de producto " + i + ": " + i * 20 + "% completado.");
                Thread.sleep(700); // Simula el tiempo de ensamblaje de cada producto
            }
            System.out.println("Ensamblaje completado.");
        } catch (InterruptedException e) {
            System.out.println("Ensamblaje interrumpido.");
        }
    }
}