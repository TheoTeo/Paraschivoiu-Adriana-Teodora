package Adapter.clase.autobuz;

public class Autobuz implements ValidatorAutobuz{
    @Override
    public void validareAbonament() {
        System.out.println("Am validat abonament autobuz");
    }

    @Override
    public void validareBilet() {
        System.out.println("Am validat bilet abonament");
    }
}
