package Seminar4.FactoryMethod.Familie;

public class TroleibuzFactory implements Factory{

    @Override
    public MijlocTransport createObject(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
