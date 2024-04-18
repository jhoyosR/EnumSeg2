package ejercicio5;

public class Main {
    public static void main(String[] args) {
        Producto elemtEstudio = Producto.CARTUCHERA;
        System.out.println("El producto " + elemtEstudio.getNombre() + ", descrito como " + elemtEstudio.getDescripcion() + ", cumple la función de " + elemtEstudio.mostrarUso());
    }
}
