package tec;
public class PassagerStandard implements Passager, Usager {

  String nom;
  int destination;

  public PassagerStandard(String nom, int destination){
    this.nom = nom;
    this.destination = destination;
  }

  Position pos = Position.creer();

  public void monterDans(Autobus t) {
    assisDebout(t);
  }

  public boolean estDehors() {
    return pos.estDehors();
  }

  public boolean estAssis() {
    return pos.estAssis();
  }

  public boolean estDebout() {
    return pos.estDebout();
  }

  public void changerEnDehors() {
    pos = pos.dehors();
  }

  public void changerEnAssis() {
    pos = pos.assis();
  }

  public void changerEnDebout() {
    pos = pos.debout();
  } 

  public void nouvelArret(Autobus t, int numeroArret) {
      sortir(t, numeroArret);
      if (this.estAssis()) {
          t.arretDemanderDebout(this);
      } else if(this.estDebout()) {
      t.arretDemanderAssis(this);
      }
  }
//   public void nouvelArret(Autobus t, int numeroArret) {
//     if (t.arretDemanderSortie(this)) {
//         if (this.estAssis()) {
//             t.arretDemanderDebout(this);
//         } else if (this.estDebout()) {
//             t.arretDemanderAssis(this);
//         }
//     }
// }

// public void nouvelArret(Autobus t, int numeroArret) {
//  sortir(t, numeroArret+1);
//   }

  public void assisDebout(Autobus b) {
      assis(b);
      if(this.estDehors())
        debout(b);
  }

  public void debout(Autobus b) {
    if (b.aPlaceDebout())
      b.monteeDemanderDebout(this);
  }

  public void assis(Autobus b) {
    if (b.aPlaceAssise())
      b.monteeDemanderAssis(this);
  }

  protected boolean sortir(Autobus b, int numeroArret)
  {
    if (numeroArret >= 7) {
      b.arretDemanderSortie(this);
      return true;
    }
    return false;
  }
  public String toString() {
    return nom + "  " + pos;
  }
  public String nom() {
    return nom;
  }
}

