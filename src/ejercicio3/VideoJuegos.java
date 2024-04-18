package ejercicio3;

public enum VideoJuegos implements VideoJuegosInter{
    DEPORTIVOS("FIFA","con PS4", 2007) {
        @Override
        public String mostrarPosicionRanking() {
            return "Tercero";
        }
    },
    ESTRATEGIA("Tetris","con Nintendo", 1990) {
        @Override
        public String mostrarPosicionRanking() {
            return "Cuarto";
        }
    },
    MUSICALES("Piano Tiles","con Celular", 2017) {
        @Override
        public String mostrarPosicionRanking() {
            return "Quinto";
        }
    },
    AVENTURA("Skyrim","con PC", 2004) {
        @Override
        public String mostrarPosicionRanking() {
            return "Segundo";
        }
    },
    SIMULACION("GTA V","con PC", 2019) {
        @Override
        public String mostrarPosicionRanking() {
            return "Primero";
        }
    };

    private String nombre;
    private String comoJuega;
    private int anoCreacion;

    VideoJuegos(String nombre, String comoJuega, int anoCreacion) {
        this.nombre = nombre;
        this.comoJuega = comoJuega;
        this.anoCreacion = anoCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComoJuega() {
        return comoJuega;
    }

    public void setComoJuega(String comoJuega) {
        this.comoJuega = comoJuega;
    }

    public int getAnoCreacion() {
        return anoCreacion;
    }

    public void setAnoCreacion(int anoCreacion) {
        this.anoCreacion = anoCreacion;
    }

    public String comprarMonedas(){
        return "Monedas compradas exitosamente";
    };
}
