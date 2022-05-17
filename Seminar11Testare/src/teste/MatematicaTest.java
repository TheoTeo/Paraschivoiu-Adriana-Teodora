package teste;

import TestarePersoana.clase.Matematica;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MatematicaTest {

    private Matematica mate;

    @Before
    public void setMate(){
        mate=Matematica.getInstance();
    }

    @Test
    public void testeazaSuma(){
      //  Matematica mate=new Matematica();
        int rezObtinut=mate.suma(8,6);
        assertEquals(14,rezObtinut);
    }

    @Test
    public void testeazaRaport(){
       // Matematica matematica=new Matematica();
        double rezObt=mate.raport(24,6);
        assertEquals(4,rezObt,0.001);
    }

    @Test
    public void testeazaRaportShouldThrowException(){
       // Matematica matematica=new Matematica();
        try {
            mate.raport(45,0);
            fail("Nu trebuie sa ajunga aici");
        }
        catch (IllegalArgumentException exception){

        }
    }

    @Test
    public void testeazaParitate(){
        boolean rez= mate.estePar(24);
        assertTrue(rez);
        assertFalse(mate.estePar(3));
    }

    @Test
    public void testParitate() {
        boolean rezultat = mate.estePar(5);
        assertFalse(rezultat); // ne asteptam sa dea False
        assertTrue(mate.estePar(4));
        assertTrue(mate.estePar(6));
        assertTrue(mate.estePar(10));
        assertFalse(mate.estePar(7));
    }

    @Test
    public void TestListaNumerePare(){
        List rezultat=mate.nNumerePare(5);
        assertEquals(4, mate.nNumerePare(4).size());
        assertEquals(5, mate.nNumerePare(5).size());
    }

    @Test
    public void TestListaNumerePare2(){
        assertNull(mate.nNumerePare(0));
    }

    @Test (expected = IllegalArgumentException.class)
    public void TestListaNumerePareShouldThrowException(){
        mate.nNumerePare(-12);
    }

    @Test
    public void TestSingleToneMatematica(){
        Matematica matematica2= Matematica.getInstance();
        assertSame(matematica2, mate);
    }

}