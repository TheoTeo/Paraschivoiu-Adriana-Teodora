package Seminar4.FactoryMethod.Familie;

public class MainFActoryMethod {
    public static void main(String[] args) {
        MijlocTransport autobuz=new AutobuzFactory().createObject("B150");
        System.out.println(autobuz.toString());
        MijlocTransport troleibuz=new TroleibuzFactory().createObject("B120");
        System.out.println(troleibuz.toString());
    }
}
