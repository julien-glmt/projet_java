//source without documentation for javadoc
package tec;

public class PassagerStresse extends FactoPassager {

  int nbDarret;
  // constructor

  public PassagerStresse(String nom, int destination) {
    super(nom, destination);
    this.nbDarret = destination;
  }

  // methods
  public void monterDans(Autobus t) {
    assis(t);

  }

  public void nouvelArret(Autobus t, int numeroArret) {

    if (sortir(t, numeroArret) != true) {
      if ((this.nbArret - 3) >= numeroArret) {
        t.arretDemanderDebout(this);
      }

    }
  }

}
