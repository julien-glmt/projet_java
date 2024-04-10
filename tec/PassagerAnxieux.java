//source without documentation for javadoc
package tec;

public class PassagerAnxieux implements Usager {

    // constructor
    private MonteeSportif PassagerAnx;

    public PassagerAnxieux(String nom, int destination) {
      PassagerAnx = new MonteeSportif(nom, destination, ComportementArret.ArretSportif);
    }

    // methods
    public void monterDans(Autobus b) {
        PassagerAnx.monterDans(b);
      }

}
