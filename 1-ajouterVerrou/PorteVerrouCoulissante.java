package tec;

public class PorteVerrouCoulissante{
  private final int MAX;
  private int pas;

  public PorteVerrouCoulissante(int pasMax) {
    PorteCoulissante porte 1;
    MAX = pasMax;
    pas = 0;
  }

  public boolean estFerme() {
    return MAX == pas;
  }

  public void fermer() {
    for (; pas < MAX; pas++) ;
  }

  public void ouvrir() {
    for (; pas > 0; pas--) ;
  }

  public void coulisser() {
    if (estFerme())
      ouvrir();
    else
      fermer();
  }
}

}