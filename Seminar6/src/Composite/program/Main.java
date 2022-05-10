package Composite.program;


import Composite.clase.Autobuz;
import Composite.clase.Flota;
import Composite.clase.Nod;
import com.sun.security.jgss.GSSUtil;

import javax.management.remote.rmi.RMIJRMPServerImpl;

public class Main {
    public static void main(String[] args) {
        Autobuz a1=new Autobuz("BMW","E445",20);
        Autobuz a2=new Autobuz("BMW","E445",56);
        Autobuz a3=new Autobuz("BMW","E445",13);
        Autobuz a4=new Autobuz("BMW","E445",40);
        Autobuz a5=new Autobuz("BMW","E445",80);

        Nod mari=new Flota("Autobuze mari");
        Flota mijlocii=new Flota("Autobuze mijlocii");
        Flota mici=new Flota("Autobuze mici");
        Flota flota=new Flota("Flota mama");
        try {
            mici.adaugaNod(a1);
            mici.adaugaNod(a3);

            mijlocii.adaugaNod(a2);
            mari.adaugaNod(a5);

            flota.adaugaNod(mari);
            flota.adaugaNod(mici);
            flota.adaugaNod(mijlocii);

            System.out.println("Garantie pt intreaga flota:" +flota.calculeazaSumagarantie(15)+" lei");
            System.out.println("Garantie pt flota mijlocie:" +mijlocii.calculeazaSumagarantie(15)+" lei");
            flota.afiseazaDescriere();


        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
