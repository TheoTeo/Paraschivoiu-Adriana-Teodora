package Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements Nod{
    private String nume;
    private List<Nod> noduri;

    public Flota(String nume) {
        this.nume = nume;
        this.noduri=new ArrayList<>();
    }

    @Override
    public void adaugaNod(Nod nod) throws Exception {
        noduri.add(nod);
    }

    @Override
    public void stergeNod(Nod nod) throws Exception {

        noduri.remove(nod);
    }

    @Override
    public Nod getNod(int poz) throws Exception {
        return noduri.get(poz);
    }

    @Override
    public void afiseazaDescriere() {

        System.out.println(nume);
        for(Nod nod:noduri){
            nod.afiseazaDescriere();
        }
    }

    @Override
    public float calculeazaSumagarantie(float pretPeLoc) {
        float suma=0;
        for(Nod nod:noduri){
            suma+=nod.calculeazaSumagarantie(pretPeLoc);
        }
        return suma;
    }
}
