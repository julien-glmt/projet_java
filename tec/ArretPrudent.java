package tec;

public class ArretPrudent implements ComportementArret {
        public void choixPlaceArret(Autobus b, int destination, Passager p) {
           if(destination <= 3) {
                    if(p.estAssis() && b.aPlaceDebout())
                        b.arretDemanderDebout(p);
            }
            return;
        }
    }
