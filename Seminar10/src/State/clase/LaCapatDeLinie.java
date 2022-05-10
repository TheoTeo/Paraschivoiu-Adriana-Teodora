package State.clase;

public class LaCapatDeLinie implements Stare{


    @Override
    public void actualizareStare(Autobuz autobuz) {
        if ( !(autobuz.getStare() instanceof LaCapatDeLinie) ){
            System.out.println("Autobuzul "+autobuz.getNrAutobuz()+" este la capat de linie.");
            autobuz.setStare(this);
        }
        else{
            System.out.println("Autobuzul "+ autobuz.getNrAutobuz()+" este deja la capat de linie.");
        }
    }
}
