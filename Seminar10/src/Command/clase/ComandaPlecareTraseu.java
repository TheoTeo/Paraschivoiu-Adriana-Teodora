package Command.clase;

public class ComandaPlecareTraseu implements Command{
    private int nrLinie;
    private Autobuz autobuz;

    public ComandaPlecareTraseu(int nrLinie, Autobuz autobuz) {
        this.nrLinie = nrLinie;
        this.autobuz = autobuz;
    }

    @Override
    public void executa() {
        autobuz.pleacaInCursa(nrLinie);
    }
}
