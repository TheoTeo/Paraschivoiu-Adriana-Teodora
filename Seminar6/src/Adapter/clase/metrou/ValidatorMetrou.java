package Adapter.clase.metrou;

public class ValidatorMetrou implements ValidatorSubteran {
    @Override
    public void validareCalatorie() {
        System.out.println("Am validat bilet metrou");
    }

    @Override
    public void validareAbonament() {

        System.out.println("Am validat abonament metrou");
    }
}
