package Seminar4.Main;

import Seminar4.Factory.Familie.Factory;
import Seminar4.Factory.Familie.MijlocTransport;
import Seminar4.Factory.Familie.TipTransport;
import Seminar4.Singleton.Singleton;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
//        Singleton s1=Singleton.getInstance();
//        Singleton s2=Singleton.getInstance();
//        System.out.println(s1);
//        System.out.println(s2);

        Factory fabrica=new Factory();
        MijlocTransport a=fabrica.createObject(TipTransport.AUTOBUZ,"B100");
        MijlocTransport b=fabrica.createObject(TipTransport.TRAMVAI,"B200");
        MijlocTransport c=fabrica.createObject(TipTransport.TROLEIBUZ,"B300");

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
    }
}
