package seminar2CTS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader implements ReaderAplicants {
    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(numeFisier));
        scanner.useDelimiter(",");
        List<Aplicant> elevi = citireAplicantiDinScanner(scanner);
        scanner.close();
        return elevi;
    }

    private List<Aplicant> citireAplicantiDinScanner(Scanner scanner){
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (scanner.hasNext()) {
            Elev elev=new Elev();
            AplicantReader.citireAplicant(scanner,elev);
            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }
        return elevi;
    }
}
