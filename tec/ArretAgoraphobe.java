package tec;

public class ArretAgoraphobe implements ComportementArret {
    public void choixPlaceArret(Autobus b, int distanceDestination, Passager p) {
        if(!b.aPlaceAssise() || !b.aPlaceDebout())
            b.arretDemanderSortie(p);
        return;
    }
}

