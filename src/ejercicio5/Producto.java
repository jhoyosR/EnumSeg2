package ejercicio5;

public enum Producto {
    LAPIZ("Lapiz Norma","MIRADO") {
        @Override
        public String mostrarUso() {
            return "Escribir";
        }
    },
    CUADERNO("Cuaderno Primavera","Cuadriculado") {
        @Override
        public String mostrarUso() {
            return "Tomar Apuntes";
        }
    },
    BORRADOR("Borrador Faber","Negro") {
        @Override
        public String mostrarUso() {
            return "Borrar errores";
        }
    },
    SACAPUNTA("Sacapunta Mattel","Metálico") {
        @Override
        public String mostrarUso() {
            return "Afilar el lapiz";
        }
    },
    CARTUCHERA("Cartuchera Totto","Mediana") {
        @Override
        public String mostrarUso() {
            return "Guardar las cosas";
        }
    };

    private String nombre;
    private String descripcion;

    Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract String mostrarUso();
}
