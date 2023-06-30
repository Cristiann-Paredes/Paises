import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        ArrayList<paises>paises=new ArrayList<>();

        paises brasil=new paises("America",8500);
        paises.add(brasil);

        ciudad rio=new ciudad("America del sur",300,"urbana","Rio de Janeiro");
        paises.add(rio);

        pueblos real=new pueblos("Americano",3000,"rural","Cristo Redentor","Brasil",1973);
        paises.add(real);

        casas propia=new casas("America del sur",250,"urbana","Cristo","Rio de Janeiro",2001 ,"Cristian",1800);
        paises.add(propia);

        System.out.println("\nPais");
        brasil.llamarpais();
        rio.llamarcuidad();
        real.llamarpueblo();
        propia.llamarcasa();
        System.out.println("-------------------------------------------------------------------------------------");








    }








}
