package tec;

public class Scenario {

  static public void main (String[] args) {
    PorteVerrouCoulissante porte1 = new PorteVerrouCoulissante();
    porte1.estFerme();
    System.err.println(porte1.estFerme());
  }
}