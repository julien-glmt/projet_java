class PorteVerrouCoulissante extends PorteCoulissante{
  private int pas;
  private boolean estDeVerrouille;
  PorteCoulissante porte = new PorteCoulissante(pas);
  
  public PorteVerrouCoulissante(int pasMax){
    super(pasMax);
    estDeVerrouille = true;
  } 
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
    super.ouvrir();
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