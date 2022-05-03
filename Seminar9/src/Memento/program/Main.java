package Memento.program;

import Memento.clase.Autobuz;
import Memento.clase.ManagerAutobuze;

public class Main {

    public static void main(String[] args) {

        Autobuz autobuz=new Autobuz("Teodora",11.7,21,"AUDI",2010);
        System.out.println(autobuz.toString());

        ManagerAutobuze managger=new ManagerAutobuze();
        managger.addMemento(autobuz.creeazaMemento());
        autobuz.setNumeSofer("Adriana");
        autobuz.setConsumMediu(15.3);
        managger.addMemento(autobuz.creeazaMemento());

        System.out.println(autobuz.toString());
        autobuz.restaurareMemento(managger.getMemento(0));
        System.out.println(autobuz.toString());
    }
}
