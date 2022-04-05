package Seminar5.Builder.clase;

public class AutobuzLinie {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String textRulat;
    private String model;
    private int nrCalatori;

    AutobuzLinie() {
        this.nrLinie = 1;
        this.numeSofer = "Teodora";
        this.deschideUsile = true;
        this.areOprire = true;
        this.textRulat = "Buna ziua!";
        this.model = "Skoda";
        this.nrCalatori = 30;
    }

    void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    void setAreOprire(boolean areOprire) {
        this.areOprire = areOprire;
    }

    void setTextRulat(String textRulat) {
        this.textRulat = textRulat;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public String toString() {
        return "AutobuzLinie{" +
                "nrLinie=" + nrLinie +
                ", numeSofer='" + numeSofer + '\'' +
                ", deschideUsile=" + deschideUsile +
                ", areOprire=" + areOprire +
                ", textRulat='" + textRulat + '\'' +
                ", model='" + model + '\'' +
                ", nrCalatori=" + nrCalatori +
                '}';
    }
}


