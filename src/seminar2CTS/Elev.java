package seminar2CTS;

public class Elev extends Aplicant {
    private int clasa;
    private String tutore;

    public Elev() {
        super();
    }

    public void setClasa(Integer i) {
        this.clasa = i;
    }

    public void setTutore(String tutore) {
        this.tutore = tutore;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{Angajat: ");
        sb.append(super.toString());
        sb.append("Clasa=").append(clasa);
        sb.append(", tutore=").append(tutore);
        return sb.toString();
    }
}
