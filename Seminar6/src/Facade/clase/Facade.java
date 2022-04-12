package Facade.clase;

public class Facade {

    public static void deschideUsi(Autobuz autobuz){
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public static void lasaLibereUsi(Autobuz autobuz){
        autobuz.lasaLiberFata();
        autobuz.lasaLiberMijloc();
        autobuz.lasaLiberSpate();
    }
}
