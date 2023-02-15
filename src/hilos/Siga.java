package hilos;

public class Siga implements Runnable{

    @Override
    public void run() {
        System.out.println("Procesando solicitud certificado de estudio");
        try {
            Thread.sleep(15000);
            System.out.println("Tu certificado fue procesado correctamente, revisa tu email");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
