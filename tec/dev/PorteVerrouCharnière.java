package tec.dev;

import tec.PorteCharniere;

class PorteVerrouCharniere extends PorteCharniere{
    private boolean estDeVerouille;

    public PorteVerrouCharniere(){
        super();
        estDeVerouille = true;
    }

    public void verrouiller(){
        estDeVerouille = false;
    }

    public void deverouiller(){
        for(; pas < MAX; pas++);
    }

    public void fermer(){

    }

    public void ouvrir(){

    }
}