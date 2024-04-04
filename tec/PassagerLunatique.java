//source without documentation for javadoc
package tec;

public class PassagerLunatique extends FabriqueTec {

    // constructor

    public PassagerLunatique(String nom, int destination) {
        super(nom, destination);
    }

    // methods
    public void monterDans(Autobus t) {
        assisDebout(t);
      }

    public void nouvelArret(Autobus t, int numeroArret) {
        sortir(t, numeroArret);
        if (this.estAssis()) {
            t.arretDemanderDebout(this);
        } else if(this.estDebout()) {
        t.arretDemanderAssis(this);
        }

    }
}
