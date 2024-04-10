package tec;

class MonteeRepos extends FactoPassager {

    public MonteeRepos(String nom, int destination, ComportementArret ca) {
        super(nom,destination,ca);
    }

    @Override
    void choixPlaceMontee(Autobus b) {
        if(b.aPlaceAssise())
            b.monteeDemanderAssis(this);
        else if(b.aPlaceDebout())
            b.monteeDemanderDebout(this);
    }
}