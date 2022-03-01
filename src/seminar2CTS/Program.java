package seminar2CTS;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        AngajatiReader readerAngajati=new AngajatiReader();
        try {
            listaAngajati = readerAngajati.citireAplicanti("angajati.txt");
            for (Aplicant angajat : listaAngajati)
                System.out.println(angajat.toString());
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
