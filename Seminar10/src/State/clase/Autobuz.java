package State.clase;

public class Autobuz {
    private Stare stare;
    private int nrAutobuz;

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        this.stare=new LaCapatDeLinie();
    }

    public Stare getStare() {
        return stare;
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public void pleacaInCursa(){
        InCursa inCursa=new InCursa();
        inCursa.actualizareStare(this);
    }

    public void intraInService(){
        new LaReparat().actualizareStare(this);
    }

    public void ieseDinService(){
        new LaCapatDeLinie().actualizareStare(this);
    }

    public void ajungeLaCapatDeLinie(){
        new LaCapatDeLinie().actualizareStare(this);
    }




}
