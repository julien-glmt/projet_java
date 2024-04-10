package tec;

abstract class Passager {

  abstract String nom();

  abstract boolean estDehors();
  
  abstract boolean estAssis();
  
  abstract boolean estDebout();
  
  abstract void changerEnDehors();
  
  abstract void changerEnAssis();
  
  abstract void changerEnDebout();

  abstract void nouvelArret(Autobus v, int numeroArret);
  
}

