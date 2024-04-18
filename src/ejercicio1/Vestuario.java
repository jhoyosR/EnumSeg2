package ejercicio1;

public enum Vestuario {
    BLUSA("Tiritas", "Talla M", 1) {
        @Override
        public String mostrarDescripcionPrenda() {
            return BLUSA.getDescripcion();
        }
    },
    JEAN("Skinny","Talla M",2) {
        @Override
        public String mostrarDescripcionPrenda() {
            return JEAN.getDescripcion();
        }
    },
    CAMISETA("Rayas","Talla M", 3) {
        @Override
        public String mostrarDescripcionPrenda() {
            return CAMISETA.getDescripcion();
        }
    },
    CAMISA("Ajustada","Talla M", 4) {
        @Override
        public String mostrarDescripcionPrenda() {
            return CAMISA.getDescripcion();
        }
    };

    private String nombre;
    private String descripcion;
    private int numeroEstante;

    Vestuario(String nombre, String descripcion, int numeroEstante) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroEstante = numeroEstante;
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

    public int getNumeroEstante() {
        return numeroEstante;
    }

    public void setNumeroEstante(int numeroEstante) {
        this.numeroEstante = numeroEstante;
    }

    public abstract String mostrarDescripcionPrenda();
}
