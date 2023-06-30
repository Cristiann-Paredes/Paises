public class pueblos extends ciudad{
    private String lugar;
    private int fundacion;


    public pueblos(String continente, int extencion, String poblacion, String nombre, String lugar, int fundacion) {
        super(continente, extencion, poblacion, nombre);
        this.lugar = lugar;
        this.fundacion = fundacion;
    }

    public String getLugar() {return lugar;
    }

    public void setLugar(String lugar) {this.lugar = lugar;
    }

    public int getFundacion() {return fundacion;
    }

    public void setFundacion(int fundacion) {this.fundacion = fundacion;
    }

    public void pueblo(){
        System.out.println("Este es un puedo muy antiguo ");
    }

    public void llamarpueblo(){
        System.out.println("Se encuentra en el lugaer  de: "+ getLugar());
        System.out.println(" La se fundo en: "+getFundacion());
        pueblo();
    }
}


