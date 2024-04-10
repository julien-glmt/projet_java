package tec;

abstract class FactoPassager extends Passager implements Usager {
  String namePassager;
  int nbArret;
  private Position posi;
  private ComportementArret ca;
  // constructor

  public FactoPassager(String nom, int destination, ComportementArret ca) {
    System.out.println("Création d'un passager\n");
    this.namePassager = nom;
    this.nbArret = destination;
    this.posi = Position.creer();
    this.ca = ca;

  }

  

  // methods
  public String nom() {
    return namePassager;
  }

  public boolean estDehors() {
    return this.posi.estDehors();
  }

  public boolean estAssis() {
    return this.posi.estAssis();
  }

  public boolean estDebout() {
    return this.posi.estDebout();
  }

  public void changerEnDehors() {
    posi = this.posi.dehors();
  }

  public void changerEnAssis() {
    posi = this.posi.assis();
  }

  public void changerEnDebout() {
    posi = this.posi.debout();
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

  final public void monterDans(Autobus b){
        choixPlaceMontee(b);
}

  int distanceDest(int arret){
    return(Math.abs(this.nbArret-arret));
}

  void nouvelArret(Autobus b, int numeroArret) {
    if (numeroArret == this.nbArret)
        b.arretDemanderSortie(this);
    ca.choixPlaceArret(b,this.distanceDest(numeroArret),this);
  }
  
  abstract void choixPlaceMontee(Autobus b);

  public String toString() {
    return namePassager + "  " + this.posi;
  }
}

