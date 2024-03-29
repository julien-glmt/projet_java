package tec;
public class Scenario {

  static public void main (String[] args) {
    PorteVerrouCoulissante porte1 = new PorteVerrouCoulissante();
    porte1.verrouiller();
    System.out.println(porte1.estVerrouille());
    System.out.println(porte1.estFerme());
    porte1.ouvrir();
    System.out.println(porte1.estVerrouille());
  }
}