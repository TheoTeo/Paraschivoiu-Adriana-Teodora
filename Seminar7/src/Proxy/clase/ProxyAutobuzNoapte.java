package Proxy.clase;

public class ProxyAutobuzNoapte implements MijlocTransport{

    Autobuz autobuz;

    public ProxyAutobuzNoapte(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opreste() {
        if(autobuz.getNrCalatori()>0){
            autobuz.opreste();
        }
        else{
            System.out.println("Nu opreste in statie");
        }
    }
}
