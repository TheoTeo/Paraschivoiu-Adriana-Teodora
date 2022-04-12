package Proxy.program;

import Proxy.clase.Autobuz;
import Proxy.clase.ProxyAutobuzNoapte;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(0,"Teodora",40);
        autobuz.opreste();
        ProxyAutobuzNoapte autobuzNoapte=new ProxyAutobuzNoapte(autobuz);
        autobuzNoapte.opreste();
    }
}
