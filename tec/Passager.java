package tec;
interface Passager {

  public String nom();
  boolean estDehors();
  
  boolean estAssis();
  
  boolean estDebout();
  
  void changerEnDehors();
  
  void changerEnAssis();
  
  void changerEnDebout();

  void assisDebout(Autobus v);

  void nouvelArret(Autobus v, int numeroArret);
  


