package tec;

class PorteVerrouCoulissante{
  private int pas;
  private boolean estDeVerrouille = true;
  PorteCoulissante porte = new PorteCoulissante(pas);
  
  public boolean estFerme() {
    return porte.estFerme();
  }

  public void fermer() {
    porte.fermer();
  }
  
  public void ouvrir() {
    if (this.estVerrouille() ){
      this.deverrouiller();
    }
    porte.ouvrir();
  }

  public void coulisser() {
    if(estVerrouille()){
      return;
    }
    porte.coulisser();
  }
  
  public void verrouiller() {
    if(this.estDeVerrouille){
      this.estDeVerrouille = false;
    }
  }
  
  public void deverrouiller() {
    if(!this.estDeVerrouille){
      this.estDeVerrouille = true;
    }
  }

  public boolean estVerrouille() {
    return !estDeVerrouille;
  }
}