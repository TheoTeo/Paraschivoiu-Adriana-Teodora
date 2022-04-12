package Facade.program;

import Facade.clase.Autobuz;
import Facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        Facade.deschideUsi(autobuz);
        Facade.lasaLibereUsi(autobuz);
    }

}
