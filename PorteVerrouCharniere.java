package tec;

public class PorteVerrouCharniere {
    boolean estDeverrouille;  //true : verrou et false : deverrou 
    private PorteCharniere posi   = new PorteCharniere();  // lien A1 
    public PorteVerrouCharniere(){}

    public boolean estVerrouille(){
        return estDeverrouille; 
    }   

    void verrouiller(){
        if (estVerrouille()==false){
        estDeverrouille = true;
        }
    }

    void deverrouiller(){
        if (estVerrouille()==true){
        estDeverrouille = false;
        }
    }

    void ouvrir(){
        if(estVerrouille()==false){
        posi.ouvrir();
        }
    }

    void fermer(){
        posi.fermer();
    }

    boolean estFerme(){
        return posi.estFerme();
        
    }
}