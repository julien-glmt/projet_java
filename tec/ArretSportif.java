package tec;

public class ArretSportif implements ComportementArret {
    @Override
    public void choixPlaceArret(Autobus b, int destination,Passager p ) {
        if(destination <=1) {
            if(!b.aPlaceAssise() || !b.aPlaceDebout())
                b.arretDemanderSortie(p);
        }
    }
}