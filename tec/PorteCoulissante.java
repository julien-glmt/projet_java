package tec;
class PorteCoulissante extends PorteCharniere{
  private final int MAX;
  private int pas;

  public PorteCoulissante(int pasMax) {
    MAX = pasMax;
    pas = 0;
  }

  public boolean estFerme() {
    return MAX == pas;
  }

  public void fermer() {
    for (; pas < MAX; pas++) ;
  }

  protected void faireOuvrir() {
    for (; pas > 0; pas--) ;
  }

  public void coulisser() {
    if (estFerme())
      this.ouvrir();
    else
      this.fermer();
  }
}

