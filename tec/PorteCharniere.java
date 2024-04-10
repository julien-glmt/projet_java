package tec;
public class PorteCharniere implements Porte {
  private boolean estFerme;

  public PorteCharniere() {
    estFerme = false;
  }

  public boolean estFerme() {
    return estFerme;
  }

  public void fermer() {
    estFerme = true;
  }

  public void ouvrir() {
    estFerme = false;
  }

  protected void faireOuvrir(){
    estFerme = false;
  }
}

