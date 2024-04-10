//source without documentation for javadoc
package tec;

public class PassagerLunatique implements Usager {

    // constructor
    private MonteeRepos PassagerLun;

    public PassagerLunatique(String nom, int destination) {
        PassagerLun = new MonteeRepos(nom, destination, ComportementArret.ArretNerveux);
    }

    // methods
    public void monterDans(Autobus b) {
        PassagerLun.monterDans(b);
      }

}
