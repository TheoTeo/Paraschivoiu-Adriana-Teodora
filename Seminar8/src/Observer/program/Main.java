package Observer.program;

import Observer.clase.Autobuz;
import Observer.clase.Calator;
import Observer.clase.Observer;
import Observer.clase.Subiect;

public class Main {
    public static void main(String[] args) {
        Subiect autobuz=new Autobuz(32);
        Observer calator1=new Calator("Teodora");
        Observer calator2=new Calator("Adriana");
        Observer calator3=new Calator("Paraschivoiu");

        autobuz.adaugaCalatori(calator1);
        autobuz.adaugaCalatori(calator2);
        autobuz.notificareCalatori();
        autobuz.adaugaCalatori(calator3);
        autobuz.stergeCalatori(calator2);
        autobuz.notificareCalatori();
    }
}
