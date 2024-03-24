//source without documentation for javadoc
package tec;
import javax.swing.text.Position;

public class PassagerAnxieux extends FactoPassager {

// private Position position_passage; 

  // constructor


  public PassagerAnxieux(String nom, int destination) {
super(nom, destination);
  }

  //methods


   public void monterDans(Autobus t) {
	debout(t);
    
  }

  public void nouvelArret(Autobus t, int numeroArret) {
 sortir(t, numeroArret+1);
  }

    public String toString() {
    return namePassager +" "+ posi ; 
  }
}

