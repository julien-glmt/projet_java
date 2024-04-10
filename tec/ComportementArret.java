package tec;

interface ComportementArret {
  static final ComportementArret ArretCalme = new ArretCalme();
  static final ComportementArret ArretNerveux = new ArretNerveux();
  static final ComportementArret ArretAgoraphobe = new ArretAgoraphobe();
  static final ComportementArret ArretPrudent = new ArretPrudent();
  static final ComportementArret ArretSportif = new ArretSportif();

      void choixPlaceArret(Autobus b, int distanceDestination, Passager p);

}