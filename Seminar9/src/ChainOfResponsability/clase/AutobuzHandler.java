package ChainOfResponsability.clase;

public class AutobuzHandler extends Handler{

    public AutobuzHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareRecomandare(int distanta) {
        if(distanta<limita){
            System.out.println("Recomandarea este sa folositi autobuzul");

        }
        else{
            super.nextHandler.afisareRecomandare(distanta);
        }
    }
}
