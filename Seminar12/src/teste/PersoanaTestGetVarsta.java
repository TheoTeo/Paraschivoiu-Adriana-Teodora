package teste;

import TestarePersoana.clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTestGetVarsta {
private Persoana persoana;
    //Right-BICEP
    @Test
    public void getVarstaRight() {
        persoana = new Persoana("Teodora", "6000202263498");
        int varsta=persoana.getVarsta();
        assertEquals(22,varsta);
    }

    @Test
    public void getVarstaBoundary() {
        persoana = new Persoana("Teodora", "3000101263498");
        int varsta=persoana.getVarsta();
        assertEquals(222,varsta);
    }

    @Test
    public void getVarstaBoundary2() {
        persoana = new Persoana("Teodora", "2991231263498");
        int varsta=persoana.getVarsta();
        assertEquals(22,varsta);
    }
    @Test
    public void getVarstaBoundary3() {
        persoana = new Persoana("Teodora", "6220517263498");
        int varsta=persoana.getVarsta();
        assertEquals(0,varsta);
    }
    @Test
    public void getVarstaBoundary4() {
        persoana = new Persoana("Teodora", "6040518263498");
        int varsta=persoana.getVarsta();
        assertEquals(17,varsta);
    }

  //  @Test(expected = IllegalArgumentException.class)
    public void getVarstaErrorCondition() {
        persoana = new Persoana("Teodora", "6220517263498");
        int varsta= persoana.getVarsta();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getVarstaErrorCondition2() {
        persoana = new Persoana("Teodora", null);
        int varsta= persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance() {
        persoana = new Persoana("Teodora", "6000101263498");
        int varsta= persoana.getVarsta();
    }

    //CORRECT
    @Test
    public void getVarstaOrder() {
        persoana = new Persoana("Teodora", "5030101263498");
        Persoana persoana2 = new Persoana("Adriana", "5001231263498");
        assertTrue(persoana2.getVarsta()>persoana.getVarsta());
    }


}