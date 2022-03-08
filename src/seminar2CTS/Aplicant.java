package seminar2CTS;

import java.util.Arrays;

public abstract class Aplicant {
    protected String nume;
    protected String prenume;
    protected int varsta;
    protected int punctaj;
    protected int nrProiecte;
    protected String[] denumireProiect;
    protected static int pragPunctaj = 80;

    public Aplicant() {
        super();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }


    public void afisareStatut() {
        if (punctaj > pragPunctaj)
            System.out.println("Aplicantul " + nume + " " + prenume + " a fost acceptat.");
        else
            System.out.println("Aplicantul " + nume + " " + prenume + " nu a fost acceptat.");
    }


    public void setPunctaj(Integer punctaj) {
        this.punctaj = punctaj;
    }

    public void setDenumiriProiecte(Integer nrProiecte, String[] denumireProiect) {
        this.nrProiecte = nrProiecte;
        this.denumireProiect = new String[nrProiecte];
        for (int i = 0; i < nrProiecte; i++) {
            this.denumireProiect[i] = denumireProiect[i];
        }
    }

    public void afisareSalariuZilnic(Integer salariu) {

        System.out.println("Aplicantul " + getNume() + " " + getPrenume() + " primeste " + salariu + " Euro/zi in proiect.");

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("nume=");
        sb.append(nume).append('\'');
        sb.append(", prenume= '").append(prenume).append('\'');
        sb.append(", varsta= ").append(varsta);
        sb.append(", punctaj= ").append(punctaj);
        sb.append(", nrProiecte =").append(nrProiecte);
        sb.append(", denumireProiect= ").append(Arrays.toString(denumireProiect));
        return sb.toString();
    }
}
