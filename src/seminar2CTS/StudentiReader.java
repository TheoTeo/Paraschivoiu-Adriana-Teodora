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
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>(
        );

        while (input.hasNext()) {

            Student s=new Student();
            AplicantReader.citireAplicant(input,s);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            s.setFacultate(facultate);
            s.setAn_studii(an_studii);
            studenti.add(s);
        }
        input.close();
        return studenti;
    }
}
