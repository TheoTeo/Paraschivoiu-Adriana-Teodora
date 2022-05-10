package Seminar4.Factory.Familie;

public class Factory {
    public MijlocTransport createObject(TipTransport tip,String nrInmatriculare){
        switch (tip){
            case AUTOBUZ:
                return new Autobuz(nrInmatriculare);
            case TRAMVAI:
                return new Tramvai(nrInmatriculare);
            case TROLEIBUZ:
                return new Troleibuz(nrInmatriculare) ;
            default:
                return null;
        }

    }
}
