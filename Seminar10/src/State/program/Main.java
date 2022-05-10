package State.program;

import State.clase.Autobuz;
import State.clase.LaReparat;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(133);
        autobuz.pleacaInCursa();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.ajungeLaCapatDeLinie();
        autobuz.ieseDinService();
        autobuz.intraInService();
        autobuz.ieseDinService();
        autobuz.pleacaInCursa();
        autobuz.ajungeLaCapatDeLinie();
        System.out.println("");
       // autobuz.setStare(new LaReparat()); nu trebuie sa avem voie sa modificam starea
        autobuz.ieseDinService();
    }
}
