package FlyWeight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaLinie {
    Map<Integer,Linie>linii;

    public FabricaLinie() {
        this.linii = new HashMap<>();
    }

    public Linie getLinie(Integer nrLinie){
        Linie linie=linii.get(nrLinie);
        if(linie!=null){
            return linie;
        }else{
            linie=new Linie(nrLinie,"Piata Romana", "Gara de Nord");
            linii.put(nrLinie,linie);
            return linie;
        }

    }


}
