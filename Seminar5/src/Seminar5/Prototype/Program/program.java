package Seminar5.Prototype.Program;

import Seminar5.Prototype.clase.Autobuz;
import Seminar5.Prototype.clase.MijlocTransport;

public class program {

    public static void main(String[] args) {
        MijlocTransport autobuz=new Autobuz("Teodora");
        try {
            MijlocTransport autobuz1=autobuz.copiaza();
            System.out.println(autobuz.toString());
            System.out.println(autobuz1.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
