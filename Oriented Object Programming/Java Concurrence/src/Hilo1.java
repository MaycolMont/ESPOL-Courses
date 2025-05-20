
public class Hilo1 implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println("Tarea número: " + i);
            }
        } catch (InterruptedException e) {
            System.out.println("Hilo uno ha sido interrumpido");
        }

    }
    
}
