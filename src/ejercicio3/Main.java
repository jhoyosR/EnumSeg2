package ejercicio3;

public class Main {
    public static void main(String[] args) {
        VideoJuegos juego = VideoJuegos.SIMULACION;
        System.out.println("El juego " + juego.getNombre() + ", que se juega " + juego.getComoJuega() + " salió en el año " + juego.getAnoCreacion() + ". Se encuentra en el ranking " + juego.mostrarPosicionRanking());
        System.out.println(juego.comprarMonedas());
    }
}
