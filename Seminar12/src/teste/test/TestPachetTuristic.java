package teste.test;

import TestarePersoana.clase.PachetTuristic;
import TestarePersoana.clase.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.categorii.CategorieBoundery;
import teste.categorii.CategorieUtilizareFAke;
import teste.dubluri.PersoanaFake;

import static org.junit.Assert.*;

public class TestPachetTuristic {

    @Test
    @Category(CategorieUtilizareFAke.class)
    public void testPoateRezervaVarstaEligibila(){
        PersoanaFake persoanaFake=new PersoanaFake();
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"Mizil",300.0);
        persoanaFake.setVarsta(22);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(CategorieUtilizareFAke.class)
    public void testPoateRezervaVarstaMaiMica(){
        PersoanaFake persoanaFake=new PersoanaFake();
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"Mizil",300.0);
        persoanaFake.setVarsta(16);
        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(CategorieUtilizareFAke.class)
    public void testAplicaDiscountVarsta(){
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(67);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"Mizil",300.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(270.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category({CategorieBoundery.class,CategorieUtilizareFAke.class})
    public void testBoundaryAplicaDiscountVarsta(){
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(65);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"Mizil",300.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(270.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CategorieUtilizareFAke.class)
    public void testNuAplicaDiscount(){
        PersoanaFake persoanaFake=new PersoanaFake();
        persoanaFake.setVarsta(30);
        PachetTuristic pachetTuristic=new PachetTuristic(persoanaFake,"Mizil",300.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(300.0,pachetTuristic.getPret(),0.01);
    }



}
