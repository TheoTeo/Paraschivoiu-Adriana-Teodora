package Strategy.clase;

public class Validator {
    private ModPlata modPlata;
    private float sumaDePlata;

    public Validator(ModPlata modPlata, float sumaDePlata) {
        this.modPlata = modPlata;
        this.sumaDePlata = sumaDePlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void platesteCalatorie(){
        modPlata.plateste(sumaDePlata);
    }
}
