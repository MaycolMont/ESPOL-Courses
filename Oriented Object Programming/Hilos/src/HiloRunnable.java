public class HiloRunnable implements Runnable {
    private String nombre;
    public HiloRunnable (String nombre){
        this.nombre = nombre;
    }    
    
    @Override
    public void run() {
        System.out.println(nombre + " esta ejecutandose");
        for (int i = 0; i < 10; i++) {
            System.out.println(nombre + ": " + i);
            try {
                Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //TODO: handle exception
                    System.out.println(nombre + "  fue interrumpido");
                    }
                }
            }
            public static void main(String[] args) {
                HiloRunnable h1 = new HiloRunnable("Hilo X");
                HiloRunnable h2 = new HiloRunnable("Hilo Y");
    
                Thread t1 = new Thread(h1);
                Thread t2= new Thread(h2);
                t1.start();
                t2.start();
    
                System.out.println("Hilo principal");
            }
        }
    