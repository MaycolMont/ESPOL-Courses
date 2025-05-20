class ProduccionPiezas implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Producción de piezas: " + i * 10 + "% completado.");
                Thread.sleep(500); // Simula el tiempo de producción de cada pieza
            }
            System.out.println("Producción de piezas completada.");
        } catch (InterruptedException e) {
            System.out.println("Producción de piezas interrumpida.");
        }
    }
}