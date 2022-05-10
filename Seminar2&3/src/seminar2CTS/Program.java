package seminar2CTS;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        ReaderAplicants readerAngajati=new AngajatiReader();
        try {
            listaAngajati = readerAngajati.citireAplicanti("angajati.txt");
            for (Aplicant angajat : listaAngajati){
                angajat.afisareSalariuZilnic(1000);
                angajat.afisareStatut();
                System.out.println(angajat.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
