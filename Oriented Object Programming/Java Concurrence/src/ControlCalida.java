class ControlCalidad implements Runnable {
    private Thread ensamblajeThread;

    public ControlCalidad(Thread ensamblajeThread) {
        this.ensamblajeThread = ensamblajeThread;
    }

    @Override
    public void run() {
        try {
            ensamblajeThread.join();
            System.out.println("Control de calidad iniciado.");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Inspeccionando producto " + i + "...");
                Thread.sleep(600);
                if (Math.random() < 0.2) { // Simula un error con una probabilidad del 20%
                    System.out.println("Error detectado en el producto " + i + ". Interrumpiendo.");
                    break;
                }
            }
            System.out.println("Control de calidad finalizado.");
        } catch (InterruptedException e) {
            System.out.println("Control de calidad interrumpido.");
        }
    }
}