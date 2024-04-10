package tec;
abstract class Verrou implements Porte {
  private boolean estDeVerrouille;
  private Porte p;
  
  public Verrou(Porte p){
    this.p = p;
    estDeVerrouille = true;
  } 
  
  public boolean estFerme(){
    return !this.estDeVerrouille;
  };

  public void fermer(){
    if(estDeVerrouille = true){
      p.fermer();
    }
  };

  public void ouvrir(){
    if(estDeVerrouille = false){
      p.ouvrir();
    }
  };
}