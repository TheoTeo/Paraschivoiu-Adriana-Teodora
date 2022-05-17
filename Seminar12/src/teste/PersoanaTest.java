package teste;

import TestarePersoana.clase.IPersoana;
import TestarePersoana.clase.Persoana;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {
    private Persoana persoana;

    @org.junit.Before
    public void setUp() throws Exception {

    }

    //Right-BICEP
    @Test
    public void getSexRight() {
        persoana = new Persoana("Teodora", "2980202263498");
        String sex = persoana.getSex();
        assertEquals("F", sex);
    }

    @Test
    public void getSexBoundary() {
        persoana = new Persoana("Teodora", "5000101263498");
        String sex = persoana.getSex();
        assertEquals("M", sex);
    }


    @Test
    public void getSexCross_Check() {
        persoana = new Persoana("Teodora", "6000101263498");
        int primaCifra = persoana.CNP.charAt(0);
        String sex = persoana.getSex();
        int cifra;
        if (sex == "M") {
            cifra = 1;
        } else {
            cifra = 2;
        }
        assertEquals(cifra % 2 == 1, primaCifra % 2 == 1);
    }


    @Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition() {
        persoana = new Persoana("Teodora", "0000101263498");
        String sex = persoana.getSex();
    }

    @Test(timeout = 10)
    public void getSexPerformance() {
        persoana = new Persoana("Teodora", "6000101263498");
        String sex = persoana.getSex();
    }

    //CORRECT
    @Test
    public void getSexOutputFormat() {
        persoana = new Persoana("Teodora", "6000101263498");
        String sex = persoana.getSex();
        assertEquals(1,sex.length());
    }

    @Test
    public void getSexRangeBtwn1800and1899() {
        persoana = new Persoana("Teo", "3780101263498");
        String sex = persoana.getSex();
        assertEquals("M",sex);
    }


    @Test(expected = NullPointerException.class)
    public void getSexEixstence() {
        persoana = new Persoana("Teo", null);
        String sex = persoana.getSex();
        assertEquals("M",sex);
    }






}