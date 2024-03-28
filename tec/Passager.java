interface Passager {

  public boolean estDehors();
  
  public void monterDans(Autobus t);

  public boolean estAssis();
  
  public boolean estDebout();
  
  public void changerEnDehors();
  
  public void changerEnAssis();
  
  public void changerEnDebout();

  public void assisDebout(Autobus v);

  public void nouvelArret(Autobus v, int numeroArret);
  
}

