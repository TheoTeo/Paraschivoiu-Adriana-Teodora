package Adapter.clase.autobuz;

import Adapter.clase.metrou.ValidatorMetrou;

public class AdaptorValidatorMetrou extends ValidatorMetrou implements ValidatorAutobuz {



    @Override
    public void validareBilet() {
        super.validareCalatorie();
    }
}
