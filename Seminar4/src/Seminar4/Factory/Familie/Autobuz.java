package Seminar4.Factory.Familie;

public class Autobuz extends MijlocTransport{

    public Autobuz(String nrInmatriculare) {
        super(nrInmatriculare);
    }

    @Override
    public String toString() {
        return "Autobuz "+nrInmatriculare;
    }
}
