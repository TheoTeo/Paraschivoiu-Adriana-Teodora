package ChainOfResponsability.clase;

public class MetrouHandler extends Handler{
    public MetrouHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareRecomandare(int distanta) {
        if(distanta<limita){
            System.out.println("Recomandarea este sa folositi metroul");

        }
        else{
            super.nextHandler.afisareRecomandare(distanta);
        }
    }
}
