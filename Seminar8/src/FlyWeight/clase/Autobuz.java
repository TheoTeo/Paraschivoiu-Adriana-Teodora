package FlyWeight.clase;

public class Autobuz {
    private String modelAutobuz;
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(String modelAutobuz, int anFabricatie, int nrLocuri) {
        this.modelAutobuz = modelAutobuz;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "modelAutobuz='" + modelAutobuz + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
}
