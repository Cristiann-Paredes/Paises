public class paises {

    private String continente;
    private int extencion;

    public paises(String continente, int extencion) {
        this.continente = continente;
        this.extencion = extencion;
    }

    public String getContinente() {return continente;
    }

    public void setContinente(String continente) {this.continente = continente;
    }

    public int getExtencion() {return extencion;
    }

    public void setExtencion(int extencion) {this.extencion = extencion;
    }


    public void tamanio(){
        System.out.println("El continentre es uno de los mas grandes ");
    }

    public void llamarpais(){
        System.out.println("Este es brasil");
        System.out.println("Se encuentra en el contienete de: "+ getContinente());
        System.out.println("Tiene una extencion de: "+ getExtencion());
        tamanio();
    }


}
