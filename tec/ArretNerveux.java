package tec;

public class ArretNerveux implements ComportementArret {
        
    public void choixPlaceArret(Autobus b, int distanceDestination, Passager p) {
        if(p.estDebout() && b.aPlaceAssise())
            b.arretDemanderAssis(p);
        else if(p.estAssis() && b.aPlaceDebout())
            b.arretDemanderDebout(p);
        return;
    }
    
}
