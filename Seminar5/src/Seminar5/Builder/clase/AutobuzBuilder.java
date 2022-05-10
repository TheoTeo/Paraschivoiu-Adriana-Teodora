package Seminar5.Builder.clase;

public class AutobuzBuilder implements Builder {
    AutobuzLinie autobuzLinie;

    public AutobuzBuilder() {
        this.autobuzLinie = new AutobuzLinie();
    }

    public AutobuzBuilder setNrLinie(int nrLinie) {
        this.autobuzLinie.setNrLinie(nrLinie);
        return this;
    }

    public AutobuzBuilder setNumeSofer(String numeSofer) {
        this.autobuzLinie.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuilder setDeschideUsile(boolean deschideUsile) {
        this.autobuzLinie.setDeschideUsile(deschideUsile);
        return this;
    }

    public AutobuzBuilder setAreOprire(boolean areOprire) {
        this.autobuzLinie.setAreOprire(areOprire);
        return this;
    }

    public AutobuzBuilder setTextRulat(String textRulat) {
        this.autobuzLinie.setTextRulat(textRulat);
        return this;
    }

    public AutobuzBuilder setModel(String model) {
        this.autobuzLinie.setModel(model);
        return this;
    }

    public AutobuzBuilder setNrCalatori(int nrCalatori) {
        this.autobuzLinie.setNrCalatori(nrCalatori);
        return this;
    }


    @Override
    public AutobuzLinie build() {
        return autobuzLinie;
    }
}
