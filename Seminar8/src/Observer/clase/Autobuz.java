package Observer.clase;

public class Autobuz extends Subiect{
    private int nrLinie;

    public Autobuz(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    @Override
    public void notificareCalatori() {
        for(Observer calator:calatori){
            calator.primesteMesaj("Autobuzul "+nrLinie+" a plecat de la capat de linie");
        }
    }
}
