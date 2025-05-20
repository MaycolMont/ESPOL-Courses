public class HiloPrincipal {
    public static void main(String[] args) {
        Thread h1 = new Thread(new Hilo1());

        h1.start();

        try {
            Thread.sleep(3000);
            h1.interrupt();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
