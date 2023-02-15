package hilos;

public class Asincrono {

    public static void main(String[] args){
        Siga siga = new Siga();
        System.out.println("Ingreso a SIGA");
        System.out.println("Realizar solicitud del ertificado de estudio");
        Thread segundoHilo = new Thread(siga);
        segundoHilo.start();
        System.out.println("Salir de SIGA");
    }
}
