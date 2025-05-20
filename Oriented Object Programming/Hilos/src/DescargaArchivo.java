public class DescargaArchivo implements Runnable {
    private String archivo;

    public DescargaArchivo(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public void run() {
        System.out.println("Iniciando descarga de: " + archivo);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Descargando " + archivo + ": " + (i * 10) + "%");
            try {
                Thread.sleep(500); // Simula tiempo de descarga
            } catch (InterruptedException e) {
                System.out.println("La descarga de " + archivo + " fue interrumpida.");
                return;
            }
        }
        System.out.println("Descarga completada: " + archivo);
    }

    public static void main(String[] args) {
        DescargaArchivo archivo1 = new DescargaArchivo("Archivo 1");
        DescargaArchivo archivo2 = new DescargaArchivo("Archivo 2");

        Thread t1 = new Thread(archivo1);
        Thread t2 = new Thread(archivo2);

        t1.start();
        t2.start();

        try {
            Thread.sleep(2000); // Simula tiempo de descarga
            System.err.println("Interrumpiendo descargas");
            t1.interrupt();
        } catch (InterruptedException e) {
            System.out.println("La ejecución del programa ha sido interrumpida");
        }

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("La ejecución del programa ha sido interrumpida");
        }
        System.out.println("Descargas completadas");


    }
}
