package Seminar4.FactoryMethod.Familie;

public class TramvaiFactory implements Factory{
    @Override
    public MijlocTransport createObject(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
