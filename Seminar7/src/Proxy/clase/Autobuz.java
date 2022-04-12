package Proxy.clase;

public class Autobuz implements MijlocTransport{

    private int nrCalatori;
    private String numeSofer;
    private int nrLocuri;

    public Autobuz(int nrCalatori, String numeSofer, int nrLocuri) {
        this.nrCalatori = nrCalatori;
        this.numeSofer = numeSofer;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "nrCalatori=" + nrCalatori +
                ", numeSofer='" + numeSofer + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public void opreste() {
        System.out.println("Autobuzul a oprit in statie cu "+nrCalatori+" calatori");
    }
}
