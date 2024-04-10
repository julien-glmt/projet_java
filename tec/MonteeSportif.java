package tec;

public class MonteeSportif extends FactoPassager {

    public MonteeSportif(String nom, int destination, ComportementArret ca) {
        super(nom,destination,ca);
    }

    @Override
    void choixPlaceMontee(Autobus b) {
        if(b.aPlaceDebout())
            b.monteeDemanderDebout(this);
    }
}
