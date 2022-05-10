package teste;

import clase.Matematica;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {

    @Test
    public void testeazaSuma(){
        Matematica mate=new Matematica();
        int rezObtinut=mate.suma(8,6);
        assertEquals(14,rezObtinut);
    }

    @Test
    public void testeazaRaport(){
        Matematica matematica=new Matematica();
        double rezObt=matematica.raport(24,6);
        assertEquals(4,rezObt,0.001);
    }

    @Test
    public void testeazaRaportShouldThrowException(){
        Matematica matematica=new Matematica();
        try {
            matematica.raport(45,0);
            fail("Nu trebuie sa ajunga aici");
        }
        catch (IllegalArgumentException exception){

        }
    }

}