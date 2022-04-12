package Adapter.Program;

import Adapter.clase.autobuz.AdaptorValidatorMetrou;
import Adapter.clase.autobuz.AdaptorValidatorObiecte;
import Adapter.clase.autobuz.Autobuz;
import Adapter.clase.metrou.ValidatorMetrou;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz();
        ValidatorMetrou metrou=new ValidatorMetrou();

        AdaptorValidatorObiecte adaptorValidatorObiecte=new AdaptorValidatorObiecte(metrou);
        adaptorValidatorObiecte.validareBilet();
        adaptorValidatorObiecte.validareAbonament();

        AdaptorValidatorMetrou validator=new AdaptorValidatorMetrou();
        validator.validareBilet();
        validator.validareAbonament();
    }
}
