package tec;

class MonteeFatiguee extends FactoPassager {

    public MonteeFatiguee(String nom, int destination, ComportementArret ca){
        super(nom,destination,ca);
    }

    @Override
    void choixPlaceMontee(Autobus b) {
        if(b.aPlaceAssise())
            b.monteeDemanderAssis(this);
    }

}
