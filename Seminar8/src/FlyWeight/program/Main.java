package FlyWeight.program;

import FlyWeight.clase.Autobuz;
import FlyWeight.clase.FabricaLinie;
import FlyWeight.clase.Linie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1=new Autobuz("Mercedes", 2007, 60);
        Autobuz autobuz2=new Autobuz("BMW",2015, 45);
        Autobuz autobuz3=new Autobuz("Skoda",2019,50);
        Autobuz autobuz4=new Autobuz("Audi", 2022,70);

        FabricaLinie fabricaLinie=new FabricaLinie();
        fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz1);
        fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz3);

        fabricaLinie.getLinie(137).afiseazaDetaliiAutobuzLinie(autobuz2);
        fabricaLinie.getLinie(137).afiseazaDetaliiAutobuzLinie(autobuz4);
    }
}
