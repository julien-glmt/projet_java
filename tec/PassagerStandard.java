//source without documentation for javadoc
package tec;
public class PassagerStandard extends FactoPassager{

// private Position position_passage; 

  // constructor


  public PassagerStandard(String nom, int destination) {
super(nom, destination);
  }

  
  public void monterDans(Autobus t) {
  assisDebout(t);
    
  } 

  public void nouvelArret(Autobus t, int numeroArret) {
  sortir(t, numeroArret);
  }

    public String toString() {
    return namePassager +" "+ posi ; 
  }
}

