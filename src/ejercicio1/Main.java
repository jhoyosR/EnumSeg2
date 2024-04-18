package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Vestuario pantalones = Vestuario.JEAN;
        System.out.println("Los pantalones " + pantalones.getNombre() + " son de " + pantalones.mostrarDescripcionPrenda() + " y están en el estante " + pantalones.getNumeroEstante());
    }
}
