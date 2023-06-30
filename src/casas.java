public class casas extends pueblos{

    private String propietario;
    private int costo;

    public casas(String continente, int extencion, String poblacion, String nombre, String lugar, int fundacion, String propietario, int costo) {
        super(continente, extencion, poblacion, nombre, lugar, fundacion);
        this.propietario = propietario;
        this.costo = costo;
    }

    public String getPropietario() {return propietario;
    }

    public void setPropietario(String propietario) {this.propietario = propietario;
    }

    public int getCosto() {return costo;
    }

    public void setCosto(int costo) {this.costo = costo;
    }

    public void casa(){
        System.out.println("Esta es una casa propia ");
    }
    public void llamarcasa(){
        System.out.println("El dueño de la casa es: "+ getPropietario());
        System.out.println("El precio de la casa es: "+getCosto());
        casa();
    }

}
