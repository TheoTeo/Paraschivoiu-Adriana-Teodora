package Strategy.program;

import Strategy.clase.PlataCardBancar;
import Strategy.clase.PlataCardSTB;
import Strategy.clase.PlataSMS;
import Strategy.clase.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator=new Validator(new PlataCardBancar(),3);
        PlataCardSTB plataCardSTB=new PlataCardSTB();
        PlataSMS plataSMS=new PlataSMS();
        validator.platesteCalatorie();
        validator.setModPlata(plataSMS);
        validator.platesteCalatorie();
    }
}
