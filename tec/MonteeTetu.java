package tec;

public class MonteeTetu extends FactoPassager {

    public MonteeTetu(String nom, int destination, ComportementArret ca){
        super(nom, destination,ca);
    }

    @Override
    void choixPlaceMontee(Autobus b){
        b.monteeDemanderDebout(this);
    }
}
