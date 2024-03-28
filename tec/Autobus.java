public class Autobus {
  // variable
  private int arretCourant; 
  private Jauge jaugeAssis;
  private Jauge jaugeDebout;
  private Passager [] mesPassagers; 

  // constructor
  public Autobus(int nbPlaceAssise, int nbPlaceDebout) {
    jaugeAssis = new Jauge(nbPlaceAssise, 0);
    jaugeDebout = new Jauge(nbPlaceDebout, 0);
    arretCourant = 0;
    mesPassagers = new Passager[nbPlaceAssise + nbPlaceDebout];
    for(int i = 0; i < mesPassagers.length; i++){
      mesPassagers[i] = null; 
    }

  }

  // public methods
  boolean aPlaceAssise() {
    return jaugeAssis.estVert();
  }

  boolean aPlaceDebout() {
    return jaugeDebout.estVert();
  }

  void monteeDemanderAssis(Passager p) {
    jaugeAssis.incrementer();
    mesPassagers[parcourirPassagers(null)] = p;
    p.changerEnAssis();
  }

  void monteeDemanderDebout(Passager p) {
    jaugeDebout.incrementer();
    mesPassagers[parcourirPassagers(null)] = p;
    p.changerEnDebout();
  }

  public void allerArretSuivant() {
    arretCourant ++; 
    for(int i = 0; i < mesPassagers.length; i++){ // parcours des passagers de l'autobus
      if(mesPassagers[i] != null){
        mesPassagers[i].nouvelArret(this, arretCourant);
      }
    }
  }

  void arretDemanderAssis(Passager p) {
    jaugeDebout.decrementer();
    jaugeAssis.incrementer();
    p.changerEnAssis();
  }

  void arretDemanderDebout(Passager p) {
    jaugeAssis.decrementer();
    jaugeDebout.incrementer();
    p.changerEnDebout();
  }

  void arretDemanderSortie(Passager p) {
    if(p.estDebout()){ // On décrémente la jauge correspondant à la position du passager
      jaugeDebout.decrementer();
    }
    else{
      jaugeAssis.decrementer();
    }
    mesPassagers[parcourirPassagers(p)] = null; // suppression du passager
    p.changerEnDehors();
  }

  public String toString(){
    return "[arret:" + arretCourant + ", assis:" + jaugeAssis.toString() 
    + ", debout:" + jaugeDebout.toString() + "]";
  }

// private methods
  /* Parcours les passagers du tableau mesPassagers et retourne l'indice du 1er emplacement à null */
  private int parcourirPassagers(Passager p){
    int i = 0;
    for(i = 0; i < mesPassagers.length; i++){
      if(mesPassagers[i] == p){
        return i;
      }
    }
    return -1;
  }
}