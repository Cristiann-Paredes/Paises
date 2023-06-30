public class ciudad extends paises {

    private String poblacion;
   private String nombre;


    public ciudad(String continente, int extencion, String poblacion, String nombre) {
        super(continente, extencion);
        this.poblacion = poblacion;
        this.nombre = nombre;
    }

    public String getPoblacion() {return poblacion;
    }

    public void setPoblacion(String poblacion) {this.poblacion = poblacion;
    }

    public String getNombre() {return nombre;
    }

    public void setNombre(String nombre) {this.nombre = nombre;
    }

    public void cuidad(){
        System.out.println("esta es la ciudad con mas poblacion ");
    }
    public void llamarcuidad(){
        System.out.println("Tiene una poblacion de: "+ getPoblacion());
        System.out.println(" La cuidad se llama: "+getNombre());
        cuidad();

        tamanio();
    }
}
