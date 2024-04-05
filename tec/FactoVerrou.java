package tec;
abstract class FactoVerrou {
  private boolean estDeVerrouille;
  
  public FactoVerrou(){
    super();
    estDeVerrouille = true;
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

  final public void ouvrir(){
    if(!this.estVerrouille())
      this.faireOuvrir();
  }
  protected abstract void faireOuvrir();
}