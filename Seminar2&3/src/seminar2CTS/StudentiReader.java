package seminar2CTS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader implements ReaderAplicants{
    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner input = new Scanner(new File(numeFisier));
        input.useDelimiter(",");
        List<Aplicant> studenti = new ArrayList<>();
        input.close();
        return studenti;
    }

    private List<Aplicant> citireAplicantiDinScanner(Scanner scanner){
        List<Aplicant> studenti = citireAplicantiDinScanner(scanner);

        while (scanner.hasNext()) {

            Student s=new Student();
            AplicantReader.citireAplicant(scanner,s);
            int an_studii = scanner.nextInt();
            String facultate = (scanner.next()).toString();
            s.setFacultate(facultate);
            s.setAnStudii(an_studii);
            studenti.add(s);
        }
        return studenti;
    }
}
