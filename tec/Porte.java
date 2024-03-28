public class Porte {
    
  private PorteCharniere porteCharniere;
  private PorteCoulissante porteCoulissante;

  private Porte(PorteCharniere c){
    this.porteCharniere = c;
  }

  private Porte(PorteCoulissante c){
    this.porteCoulissante = c;
  }

  static public Porte creerCharniere(){
    return new Porte(new PorteCharniere());
  }

  static public Porte creerCoulissante(int max){
    return new Porte(new PorteCoulissante(max));
  }

  public boolean estFerme() {
    return false;
  }

  public void fermer() {
    if(this.porteCharniere != null){
      this.porteCharniere.fermer();
    } 
    if(this.porteCoulissante != null){
      this.porteCoulissante.fermer();
    }
  }

  public void ouvrir() {
    if(this.porteCharniere != null){
      this.porteCharniere.ouvrir();
    } 
    if(this.porteCoulissante != null){
      this.porteCoulissante.ouvrir();
    }
  }
}