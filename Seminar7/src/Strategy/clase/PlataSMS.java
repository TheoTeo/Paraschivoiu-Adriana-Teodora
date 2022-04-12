package Strategy.clase;

public class PlataSMS implements ModPlata{
    @Override
    public void plateste(float sumaDePlata) {
        System.out.println("S-a achitat prin SMS suma de: "+sumaDePlata+" lei");
    }
}
