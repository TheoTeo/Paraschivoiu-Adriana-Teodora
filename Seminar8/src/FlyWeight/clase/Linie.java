package FlyWeight.clase;

public class Linie implements AutobuzLinie{
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public String toString() {
        return "Linie{" +
                "nrLinie=" + nrLinie +
                ", primaStatie='" + primaStatie + '\'' +
                ", ultimaStatie='" + ultimaStatie + '\'' +
                '}';
    }

    @Override
    public void afiseazaDetaliiAutobuzLinie(Autobuz autobuz) {
        System.out.println("Pe linia " +toString()+"circula Autobuzul"+autobuz.toString() );
    }
}
