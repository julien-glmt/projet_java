package tec;

abstract class FactoPassager implements Passager, Usager {
  String namePassager;
  int nbArret;

  // constructor

  public FactoPassager(String nom, int destination) {
    System.out.println("Création d'un passager\n");
    this.namePassager = nom;
    this.nbArret = destination;
  }

  Position posi = Position.creer();

  // methods
  public String nom() {
    return namePassager;
  }

  public boolean estDehors() {
    return posi.estDehors();
  }

  public boolean estAssis() {
    return posi.estAssis();
  }

  public boolean estDebout() {
    return posi.estDebout();
  }

  public void changerEnDehors() {
    posi = posi.dehors();
  }

  public void changerEnAssis() {
    posi = posi.assis();
  }

  public void changerEnDebout() {
    posi = posi.debout();
  } 

  public void debout(Autobus b) {
    if (b.aPlaceDebout())
      b.monteeDemanderDebout(this);
  }

  final protected void assis(Autobus b) {
    if (b.aPlaceAssise())
      b.monteeDemanderAssis(this);
  }

  final protected void deboutAssis(Autobus b) {
      debout(b);
      if(this.estDehors())
        assis(b);
  }

  final protected void assisDebout(Autobus b) {
      assis(b);
      if(this.estDehors())
        debout(b);
  }

  protected boolean sortir(Autobus b, int numeroArret)
  {
    if (numeroArret >= nbArret) {
      b.arretDemanderSortie(this);
      return true;
    }
    return false;
  }
  
  public String toString() {
    return namePassager + "  " + posi;
  }
}