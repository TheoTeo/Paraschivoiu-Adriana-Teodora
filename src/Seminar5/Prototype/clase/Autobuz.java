package Seminar5.Prototype.clase;

public class Autobuz implements MijlocTransport {

    private String sofer;

    public Autobuz(String sofer) {
        this.sofer = sofer;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "sofer='" + sofer + '\'' +
                '}';
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone();
    }

}
