package seminar2CTS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader implements ReaderAplicants {
    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(numeFisier));
        scanner.useDelimiter(",");
        List<Aplicant> angajati = citireAplicantiDinScanner(scanner);
        scanner.close();
        return angajati;
    }

    private List<Aplicant> citireAplicantiDinScanner(Scanner scanner){
        List<Aplicant> angajati = new ArrayList<Aplicant>();
        while (scanner.hasNext()) {
            Angajat a1=new Angajat();
            AplicantReader.citireAplicant(scanner,a1);
            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            a1.setSalariu(salariu);
            a1.setOcupatie(ocupatie);
            angajati.add(a1);
        }
        return angajati;
    }
}
